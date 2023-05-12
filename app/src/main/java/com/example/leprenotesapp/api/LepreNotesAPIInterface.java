package com.example.leprenotesapp.api;

import com.example.leprenotesapp.domain.Notes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LepreNotesAPIInterface {

    @GET("notes")
    Call<List<Notes>> getAllNotes();
}
