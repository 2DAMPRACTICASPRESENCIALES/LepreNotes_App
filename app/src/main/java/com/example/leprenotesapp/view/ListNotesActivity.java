package com.example.leprenotesapp.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.adapter.ListNotesAdapter;
import com.example.leprenotesapp.contract.SeeNotesContract;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.presenter.SeeNotesPresenter;

import java.util.ArrayList;
import java.util.List;

public class ListNotesActivity extends AppCompatActivity implements SeeNotesContract.View {

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.taskbar,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Regresa a la pantalla anterior
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return true;
    }
}