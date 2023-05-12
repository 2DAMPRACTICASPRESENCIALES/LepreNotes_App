package com.example.leprenotesapp.presenter;

import com.example.leprenotesapp.contract.SeeNotesContract;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.model.SeeNotesModel;
import com.example.leprenotesapp.view.MainActivity;

import java.util.List;

public class SeeNotesPresenter implements SeeNotesContract.Presenter, SeeNotesContract.Model.OnLoadNotesListener{

    private SeeNotesModel model;
    private MainActivity view;

    public SeeNotesPresenter ( MainActivity view){
        this.view = view;
        this.model = new SeeNotesModel();

    }

    @Override
    public void loadAllNotes() {
        model.loadAllNotes(this);
    }

    @Override
    public void onLoadLinesSuccess(List<Notes> notesList) {
        view.showNotes(notesList);

    }

    @Override
    public void onLoadLinesError(String message) {

    }

}
