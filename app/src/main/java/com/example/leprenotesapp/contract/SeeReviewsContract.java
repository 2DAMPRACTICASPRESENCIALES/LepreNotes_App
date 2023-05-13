package com.example.leprenotesapp.contract;

import com.example.leprenotesapp.domain.Reviews;

import java.util.List;

public interface SeeReviewsContract {

    interface model {
        interface OnLoadReviewsListener{
            void onLoadSuccess(List<Reviews> reviewsList);
            void onLoadError(String message);
        }
        void loadAllReviews(OnLoadReviewsListener listener);


    }
    interface view {
        void showReviews(List<Reviews> reviewsList);

    }
    interface presenter {
        void loadAllReviews();

    }
}
