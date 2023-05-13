package com.example.leprenotesapp.presenter;

import com.example.leprenotesapp.contract.SeeReviewsContract;
import com.example.leprenotesapp.domain.Reviews;
import com.example.leprenotesapp.model.SeeReviewsModel;
import com.example.leprenotesapp.view.ListReviewsActivity;

import java.util.List;

public class SeeReviewsPresenter implements SeeReviewsContract.presenter, SeeReviewsContract.model.OnLoadReviewsListener {

    private SeeReviewsModel model;
    private ListReviewsActivity view;

    public SeeReviewsPresenter (ListReviewsActivity view){
        this.view = view;
        this.model = new SeeReviewsModel();
    }


    @Override
    public void loadAllReviews() {
        model.loadAllReviews(this);

    }

    @Override
    public void onLoadSuccess(List<Reviews> reviewsList) {

        view.showReviews(reviewsList);
    }

    @Override
    public void onLoadError(String message) {

    }


}
