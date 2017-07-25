package com.onkar.sharma.assignment.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.onkar.sharma.assignment.R;
import com.onkar.sharma.assignment.adapter.AlbumsAdapter;
import com.onkar.sharma.assignment.model.Album;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class VideosFragment extends Fragment {
    private RecyclerView recyclerView;
    private AlbumsAdapter adapter;
    private List<Album> albumList;

    public VideosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View mView = inflater.inflate(R.layout.fragment_videos, container, false);
//        RecyclerView recyclerView = (RecyclerView) mView.findViewById(R.id.recyclerView);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView = (RecyclerView) mView.findViewById(R.id.recyclerView);

        albumList = new ArrayList<>();
        adapter = new AlbumsAdapter(getActivity(), albumList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

        prepareAlbums();
        return mView;
    }

    private void prepareAlbums() {
        int[] covers = new int[]{
                R.drawable.album1,
                R.drawable.album2,
                R.drawable.album3,
                R.drawable.album4,
                R.drawable.album5,
                R.drawable.album6,
                R.drawable.album7,
                R.drawable.album8,
                R.drawable.album9,
                R.drawable.album10,
                R.drawable.album11};

        Album a = new Album("True Romance", 8, covers[0]);
        albumList.add(a);

        a = new Album("Xscpae", 10, covers[1]);
        albumList.add(a);

        a = new Album("Maroon 5", 12, covers[2]);
        albumList.add(a);

        a = new Album("Born to Die", 14, covers[3]);
        albumList.add(a);

        a = new Album("Honeymoon", 18, covers[4]);
        albumList.add(a);

        a = new Album("I Need a Doctor", 20, covers[5]);
        albumList.add(a);

        a = new Album("Loud", 22, covers[6]);
        albumList.add(a);

        a = new Album("Legend", 24, covers[7]);
        albumList.add(a);

        a = new Album("Hello", 29, covers[8]);
        albumList.add(a);

        a = new Album("Greatest Hits", 36, covers[9]);
        albumList.add(a);

        adapter.notifyDataSetChanged();
    }

}
