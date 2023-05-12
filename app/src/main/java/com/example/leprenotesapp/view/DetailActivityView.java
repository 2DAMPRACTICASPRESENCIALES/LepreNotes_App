package com.example.leprenotesapp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.contract.SeeDetailNotesContract;
import com.example.leprenotesapp.domain.NoteSingleton;
import com.example.leprenotesapp.presenter.SeeNotesDetailPresenter;

public class DetailActivityView extends AppCompatActivity implements SeeDetailNotesContract.view {

    private SeeNotesDetailPresenter presenter;
    private long idNote;
    private int priceNote;
    private String titleNote, subjectNote, yearSchoolNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_view);

        //Recover notes Id
        //Recover data from note
        NoteSingleton noteSingleton = NoteSingleton.getInstance();
        idNote = noteSingleton.getId();
        priceNote = noteSingleton.getPrice();
        titleNote = noteSingleton.getTitle();
        subjectNote = noteSingleton.getSubject();
        yearSchoolNote = noteSingleton.getSchoolYear();

        showNoteDetail();


    }

    private void showNoteDetail() {
        TextView textNoteTitle = findViewById(R.id.detail_title_text);
        TextView textNoteSubject = findViewById(R.id.detail_subject_text);
        TextView textNotePrice = findViewById(R.id.detail_price_text);
        TextView textNoteYear = findViewById(R.id.detail_schoolyear_text);

        //TODO Continue

    }
}