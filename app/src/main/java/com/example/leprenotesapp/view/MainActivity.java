package com.example.leprenotesapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.adapter.ListNotesAdapter;
import com.example.leprenotesapp.contract.SeeNotesContract;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.presenter.SeeNotesPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SeeNotesContract.View {

    private SeeNotesPresenter presenter;
    private List<Notes> noteList;
    private ListNotesAdapter listNotesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_view);

        presenter = new SeeNotesPresenter(this);

        initializeRecyclerView();


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
    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadAllNotes();
    }

    @Override
    public void showNotes(List<Notes> notes) {
        noteList.clear();
        noteList.addAll(notes);
        listNotesAdapter.notifyDataSetChanged();
    }
}