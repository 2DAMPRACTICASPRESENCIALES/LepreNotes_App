package com.example.leprenotesapp.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.domain.NoteSingleton;
import com.example.leprenotesapp.domain.Notes;

public class EditNoteActivity extends AppCompatActivity {

    private String titletext,subjecttext,contenttext,pricetext;
    public Notes notebody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_note);

        //Recover data from note
        //Recogemos datos de la estacion
        NoteSingleton noteSingleton = NoteSingleton.getInstance();
        titletext = noteSingleton.getTitle();
        subjecttext = noteSingleton.getSubject();
        contenttext = noteSingleton.getContent();
        pricetext = String.valueOf(noteSingleton.getPrice());

        showData();
    }

    private void showData() {
        EditText edittitle = findViewById(R.id.edit_title);
        EditText editsubject = findViewById(R.id.edit_subject);
        EditText editcontent = findViewById(R.id.edit_content);
        EditText editprice = findViewById(R.id.edit_price);

        edittitle.setText(titletext);
        editsubject.setText(subjecttext);
        editcontent.setText(contenttext);
        editprice.setText(pricetext);
    }
    public void butSaveEditNote (View view){

    }

    public Notes createNotesBody(){
        notebody = new Notes();
        notebody.setTitle(titletext);
        //TODO to end

        return null;
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