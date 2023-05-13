package com.example.leprenotesapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.domain.Reviews;

import java.util.List;

public class LIstReviewsAdapter extends RecyclerView.Adapter<LIstReviewsAdapter.LIstReviewsHolder> {

    private List<Reviews> reviewsList;
    private Context context;

    public LIstReviewsAdapter (Context context, List<Reviews> reviewsList) {
        this.context = context;
        this.reviewsList = reviewsList;

    }
    public Context getContext() {
        return context;
    }

    @Override
    public LIstReviewsAdapter.LIstReviewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list_reviews_item, parent, false);
        return new LIstReviewsAdapter.LIstReviewsHolder(view);
    }
    @Override
    public void onBindViewHolder(LIstReviewsAdapter.LIstReviewsHolder holder, int position) {
        holder.description.setText(reviewsList.get(position).getDescription());
        holder.postdate.setText(reviewsList.get(position).getPostDate());
        holder.rating.setText(String.valueOf(reviewsList.get(position).getRating()));

    }

    @Override
    public int getItemCount() {
        return reviewsList.size();
    }

    public class LIstReviewsHolder extends RecyclerView.ViewHolder {

        public TextView description,postdate,rating;
        public View parentView;

        public LIstReviewsHolder(View view) {
            super(view);
            parentView = view;

            description = view.findViewById(R.id.reviews_rcview_description);
            postdate = view.findViewById(R.id.reviews_rcview_postdate);
            rating = view.findViewById(R.id.reviews_rcview_rating);


        }

    }

}
