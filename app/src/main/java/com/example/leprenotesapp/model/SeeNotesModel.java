package com.example.leprenotesapp.model;

import android.content.Context;
import android.util.Log;

import com.example.leprenotesapp.api.LepreNotesAPI;
import com.example.leprenotesapp.api.LepreNotesAPIInterface;
import com.example.leprenotesapp.contract.SeeNotesContract;
import com.example.leprenotesapp.domain.Notes;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeeNotesModel implements SeeNotesContract.Model {
    private Context context;
    @Override
    public void loadAllNotes(OnLoadNotesListener listener) {
        LepreNotesAPIInterface apiInterface = LepreNotesAPI.buildInstancce();
        Call<List<Notes>> callNotes = apiInterface.getAllNotes();

        callNotes.enqueue(new Callback<List<Notes>>() {
            @Override
            public void onResponse(Call<List<Notes>> call, Response<List<Notes>> response) {
                //Recoge resultados
                if (response.body() != null ){
                    List<Notes> lines = response.body();
                    listener.onLoadLinesSuccess(lines);
                    Log.d("TAG", "Código de respuesta: " + response.code());
                }

            }

            @Override
            public void onFailure(Call<List<Notes>> call, Throwable t) {
                Log.d("TAG", "Código de respuesta: ERROR");
                t.printStackTrace();
                String message = "Error llamada a la API";
                listener.onLoadLinesError(message);
            }
        });
    }
}
