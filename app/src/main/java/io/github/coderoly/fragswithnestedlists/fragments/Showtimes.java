package io.github.coderoly.fragswithnestedlists.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.github.coderoly.fragswithnestedlists.R;
import io.github.coderoly.fragswithnestedlists.adapter.MyRecyclerAdapter;
import io.github.coderoly.fragswithnestedlists.object.Movie;

public class Showtimes extends Fragment {

    private List<Movie> list = new ArrayList<>();
    MyRecyclerAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_showtimes, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        adapter = new MyRecyclerAdapter(list);

        // To make recyclerView horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        // LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setAdapter(adapter);


        // Set content for recycler view
        prepareMovieData();

        return view;
    }


    private void prepareMovieData() {


        Movie movie = new Movie("Movie 1", "Actor 1");
        list.add(movie);

        movie = new Movie("Movie 2", "Actor 2");
        list.add(movie);

        movie = new Movie("Movie 3", "Actor 3");
        list.add(movie);

        movie = new Movie("Movie 4", "Actor 4");
        list.add(movie);

        movie = new Movie("Movie 5", "Actor 5");
        list.add(movie);

        movie = new Movie("Movie 6", "Actor 6");
        list.add(movie);

        movie = new Movie("Movie 7", "Actor 7");
        list.add(movie);


        adapter.notifyDataSetChanged();
    }
}
