package com.example.zetro.uts_akb9_10116397_muhammadazraqisaputra;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class DailyFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    ArrayList<String> id = new ArrayList<>();
    ArrayList<String> title = new ArrayList<>();
    ArrayList<String> description = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_ricycle, container, false);

        id.clear();
        title.clear();
        description.clear();

        id.add("1");
        title.add("Wake Up");
        description.add("");

        id.add("2");
        title.add("Cleaning Rooms");
        description.add("");

        id.add("3");
        title.add("Bath");
        description.add("");

        id.add("4");
        title.add("Eat");
        description.add("");

        id.add("5");
        title.add("Go to College");
        description.add("");

        id.add("6");
        title.add("Play Games");
        description.add("");

        id.add("7");
        title.add("Sleep");
        description.add("");

        id.add("8");
        title.add("Repeat");
        description.add("");


        recyclerView = view.findViewById(R.id.recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(getActivity().getApplicationContext(), id, title, description);
        recyclerView.setAdapter(mAdapter);

        return view;
    }

}
