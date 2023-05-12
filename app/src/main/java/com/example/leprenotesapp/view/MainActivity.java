package com.example.leprenotesapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.adapter.ListNotesAdapter;
import com.example.leprenotesapp.domain.Notes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Notes> noteList;
    private ListNotesAdapter listNotesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);
    }
    private void initializeRecyclerView() {
        noteList = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.main_reciclerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        listNotesAdapter = new ListNotesAdapter(this, noteList);
        recyclerView.setAdapter(listNotesAdapter);
    }

}