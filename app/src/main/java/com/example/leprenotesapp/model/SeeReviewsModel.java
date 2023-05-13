package com.example.leprenotesapp.model;

import android.content.Context;
import android.util.Log;

import com.example.leprenotesapp.api.LepreNotesAPI;
import com.example.leprenotesapp.api.LepreNotesAPIInterface;
import com.example.leprenotesapp.contract.SeeReviewsContract;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.domain.Reviews;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SeeReviewsModel implements SeeReviewsContract.model {
    private Context context;
    @Override
    public void loadAllReviews(OnLoadReviewsListener listener) {
        LepreNotesAPIInterface apiInterface = LepreNotesAPI.buildInstancce();
        Call<List<Reviews>> callReviews = apiInterface.getAllReviews();

        callReviews.enqueue(new Callback<List<Reviews>>() {
            @Override
            public void onResponse(Call<List<Reviews>> call, Response<List<Reviews>> response) {
                if (response.body() != null ){
                    List<Reviews> reviews = response.body();
                    listener.onLoadSuccess(reviews);
                    Log.d("TAG", "Código de respuesta: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Reviews>> call, Throwable t) {

            }
        });


    }
}
