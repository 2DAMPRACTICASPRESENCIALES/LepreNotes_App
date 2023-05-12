package com.example.leprenotesapp.presenter;

import com.example.leprenotesapp.contract.SeeDetailNotesContract;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.model.SeeDetailNotesModel;
import com.example.leprenotesapp.model.SeeNotesModel;
import com.example.leprenotesapp.view.DetailActivityView;

public class SeeNotesDetailPresenter implements SeeDetailNotesContract.presenter,SeeDetailNotesContract.model.OnLoadDetailNote {

    private SeeDetailNotesModel model;
    private DetailActivityView view;

    public SeeNotesDetailPresenter (DetailActivityView view){
        this.view = view;
        this.model = new SeeDetailNotesModel();
    }
    @Override
    public void loadDetailNote(long noteId) {

    }
    @Override
    public void onLoadDetailSuccess() {

    }

    @Override
    public void onLoadDetailError(String message) {

    }


}
