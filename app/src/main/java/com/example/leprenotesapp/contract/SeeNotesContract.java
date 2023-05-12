package com.example.leprenotesapp.contract;

import com.example.leprenotesapp.domain.Notes;

import java.util.List;

public interface SeeNotesContract {

    interface Model {
        interface OnLoadNotesListener{
            void onLoadLinesSuccess(List<Notes> notesList);
            void onLoadLinesError(String message);
        }
        void loadAllNotes(OnLoadNotesListener listener);

    }
    interface View {
        void showNotes(List<Notes> notes);

    }
    interface Presenter {
        void loadAllNotes();
    }
}
