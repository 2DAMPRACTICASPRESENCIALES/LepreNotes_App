package com.example.leprenotesapp.api;

import com.example.leprenotesapp.domain.Notes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface LepreNotesAPIInterface {

    @GET("notes")
    Call<List<Notes>> getAllNotes();

    @GET("notes/{id}")
    Call<Notes> getOneNote(@Path("id") long id);
}
