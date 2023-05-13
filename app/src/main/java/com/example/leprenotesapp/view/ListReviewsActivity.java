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
import com.example.leprenotesapp.adapter.LIstReviewsAdapter;
import com.example.leprenotesapp.contract.SeeReviewsContract;
import com.example.leprenotesapp.domain.Reviews;
import com.example.leprenotesapp.presenter.SeeReviewsPresenter;

import java.util.ArrayList;
import java.util.List;

public class ListReviewsActivity extends AppCompatActivity implements SeeReviewsContract.view {

    private SeeReviewsPresenter presenter;
    private List<Reviews> reviewsList;
    private LIstReviewsAdapter lIstReviewsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_reviews);

        presenter = new SeeReviewsPresenter(this);

        initializeRecyclerView();
    }

    private void initializeRecyclerView() {
        reviewsList = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.reviews_rcvviewer);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        lIstReviewsAdapter = new LIstReviewsAdapter(this, reviewsList);
        recyclerView.setAdapter(lIstReviewsAdapter);
    }
    @Override
    protected void onResume() {
        super.onResume();
        presenter.loadAllReviews();

    }

    @Override
    public void showReviews(List<Reviews> reviews) {
        reviewsList.clear();
        reviewsList.addAll(reviews);
        lIstReviewsAdapter.notifyDataSetChanged();

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