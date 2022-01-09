package com.example.whatsapp.Fragments.CHATS;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp.Adapter.ChatsAdapter;
import com.example.whatsapp.Model.ChatsModel;
import com.example.whatsapp.R;

import java.util.ArrayList;

public class ChatFragment extends Fragment {

    private ChatsViewModel chatsViewModel;
    RecyclerView rv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        chatsViewModel = new ViewModelProvider(this).get(ChatsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_first, container, false);

        rv = root.findViewById(R.id.recyclerView);

        chatsViewModel.getlist().observe(getViewLifecycleOwner(), new Observer<ArrayList<ChatsModel>>() {
            @Override
            public void onChanged(ArrayList<ChatsModel> postsModels) {

                rv.setLayoutManager(new LinearLayoutManager(getActivity()));
                ChatsAdapter chatsAdapter= new ChatsAdapter(getActivity(), postsModels);
                rv.setAdapter(chatsAdapter);
            }
        });

        return root;
    }
}