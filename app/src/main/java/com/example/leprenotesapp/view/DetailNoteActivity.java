package com.example.leprenotesapp.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.domain.NoteSingleton;

public class DetailNoteActivity extends AppCompatActivity {
    private long idNote;
    private String titleNote, subjectNote, yearSchoolNotes, priceNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_note);

        //Recover data from note
        //Recogemos datos de la estacion
        NoteSingleton noteSingleton = NoteSingleton.getInstance();
        titleNote = noteSingleton.getTitle();
        subjectNote = noteSingleton.getSubject();
        yearSchoolNotes = noteSingleton.getSchoolYear();
        priceNote = String.valueOf(noteSingleton.getPrice());


        TextView textViewTitle = findViewById(R.id.product_title);
        TextView textViewSubject = findViewById(R.id.product_subject);
        TextView textViewPrice = findViewById(R.id.product_price);
        TextView textViewYear = findViewById(R.id.product_schoolyear);

        textViewTitle.setText(titleNote);
        textViewSubject.setText(subjectNote);
        textViewPrice.setText(priceNote);
        textViewYear.setText(yearSchoolNotes);



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