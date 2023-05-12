package com.example.leprenotesapp.api;

import static com.example.leprenotesapp.api.Constants.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LepreNotesAPI {

    public static LepreNotesAPIInterface buildInstancce() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL) //URL Base API
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(LepreNotesAPIInterface.class);
    }
}
