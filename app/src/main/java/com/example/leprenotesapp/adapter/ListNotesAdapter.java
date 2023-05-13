package com.example.leprenotesapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.leprenotesapp.R;
import com.example.leprenotesapp.domain.NoteSingleton;
import com.example.leprenotesapp.domain.Notes;
import com.example.leprenotesapp.view.DetailNoteActivity;
import com.example.leprenotesapp.view.EditNoteActivity;

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
       holder.subject.setText(notesList.get(position).getSubject());
       holder.price.setText(String.valueOf(notesList.get(position).getPrice()));

    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    public class ListNotesHolder extends RecyclerView.ViewHolder {

        public TextView subject, price;
        public Button goToDetailsButton, editNotes;
        public View parentView;

        public ListNotesHolder(View view) {
            super(view);
            parentView = view;

            subject = view.findViewById(R.id.main_rcview_subject);
            price = view.findViewById(R.id.main_rcview_price);
            goToDetailsButton = view.findViewById(R.id.main_rcview_seebutton);
            editNotes = view.findViewById(R.id.main_rcview_editbutton);
            
            goToDetailsButton.setOnClickListener(notDe -> noteDetail(getAdapterPosition()));
            editNotes.setOnClickListener(notDe -> editNote(getAdapterPosition()));

        }

    }

    private void editNote(int position) {
        Notes note = notesList.get(position);

        //Recuperamos datos a pasar a la nueva Activity para modificar
        NoteSingleton noteSingleton = NoteSingleton.getInstance();
        noteSingleton.setId(note.getId());
        noteSingleton.setPrice(note.getPrice());
        noteSingleton.setSubject(note.getSubject());
        noteSingleton.setSchoolYear(note.getSchoolYear());
        noteSingleton.setTitle(note.getTitle());
        noteSingleton.setContent(note.getContent());

        //Pasamos a la activity detail
        Intent intent = new Intent(context, EditNoteActivity.class);
        context.startActivity(intent);
    }

    private void noteDetail(int position) {

        Notes note = notesList.get(position);

        //Recuperamos datos a pasar a la nueva Activity para modificar
        NoteSingleton noteSingleton = NoteSingleton.getInstance();
        noteSingleton.setId(note.getId());
        noteSingleton.setPrice(note.getPrice());
        noteSingleton.setSubject(note.getSubject());
        noteSingleton.setSchoolYear(note.getSchoolYear());
        noteSingleton.setTitle(note.getTitle());

        //Pasamos a la activity detail
        Intent intent = new Intent(context, DetailNoteActivity.class);
        context.startActivity(intent);


    }

}
