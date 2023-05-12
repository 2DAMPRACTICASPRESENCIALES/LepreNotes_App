package com.example.leprenotesapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.domain.Notes;
import java.util.List;

public class ListNotesAdapter extends RecyclerView.Adapter<ListNotesAdapter.ListNotesHolder> {

    private List<Notes> notesList;
    private Context context;

    public ListNotesAdapter (Context context, List<Notes> notesList) {
        this.context = context;
        this.notesList = notesList;

    }
    public Context getContext() {
        return context;
    }

    @Override
    public ListNotesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_main_item, parent, false);
        return new ListNotesHolder(view);
    }
    @Override
    public void onBindViewHolder(ListNotesHolder holder, int position) {
       holder.title.setText(notesList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class ListNotesHolder extends RecyclerView.ViewHolder {

        public TextView title;
        public View parentView;

        public ListNotesHolder(View view) {
            super(view);
            parentView = view;

            title = view.findViewById(R.id.main_rcview_title);

        }

    }

}
