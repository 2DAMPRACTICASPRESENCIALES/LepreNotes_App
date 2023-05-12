package com.example.leprenotesapp.contract;

import com.example.leprenotesapp.domain.Notes;

import java.util.List;

public interface SeeDetailNotesContract {

    interface model{
        interface OnLoadDetailNote{
            void onLoadDetailSuccess();
            void onLoadDetailError(String message);
        }
        void loadDetailNote(OnLoadDetailNote listener, long noteId);
    }
    interface view {

    }
    interface presenter {
        void loadDetailNote(long noteId);
    }
}
