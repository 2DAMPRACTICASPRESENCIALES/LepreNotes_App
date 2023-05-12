package com.example.leprenotesapp.model;

import android.content.Context;

import com.example.leprenotesapp.api.LepreNotesAPI;
import com.example.leprenotesapp.api.LepreNotesAPIInterface;
import com.example.leprenotesapp.contract.SeeDetailNotesContract;
import com.example.leprenotesapp.domain.Notes;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeeDetailNotesModel implements SeeDetailNotesContract.model {
    private Context context;

    @Override
    public void loadDetailNote(OnLoadDetailNote listener, long noteId) {
        LepreNotesAPIInterface apiInterface = LepreNotesAPI.buildInstancce();
        Call<Notes> callNotes = apiInterface.getOneNote(noteId);

        callNotes.enqueue(new Callback<Notes>() {
            @Override
            public void onResponse(Call<Notes> call, Response<Notes> response) {
                listener.onLoadDetailSuccess();
            }

            @Override
            public void onFailure(Call<Notes> call, Throwable t) {

            }
        });

    }

}
