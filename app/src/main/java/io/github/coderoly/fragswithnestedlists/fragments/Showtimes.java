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
import io.github.coderoly.fragswithnestedlists.adapters.DateAdapter;
import io.github.coderoly.fragswithnestedlists.objects.Date;
import io.github.coderoly.fragswithnestedlists.objects.Movie;

public class Showtimes extends Fragment {

    private List<Date> dates = new ArrayList<>();
    DateAdapter dateAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_showtimes, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerView_dates);
        dateAdapter = new DateAdapter(dates, getActivity());

        // To make recyclerView horizontal
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setAdapter(dateAdapter);


        // Set content for recycler view
        prepareDateData();

        return view;
    }


    private void prepareDateData() {

        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", "Actor 1"));
        movies.add(new Movie("Movie 2", "Actor 2"));
        movies.add(new Movie("Movie 3", "Actor 3"));
        movies.add(new Movie("Movie 4", "Actor 4"));
        movies.add(new Movie("Movie 5", "Actor 5"));
        movies.add(new Movie("Movie 6", "Actor 6"));

        dates.add(new Date("21/06/2018", movies));

        movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", "Actor 1"));
        movies.add(new Movie("Movie 2", "Actor 2"));
        movies.add(new Movie("Movie 3", "Actor 3"));
        movies.add(new Movie("Movie 4", "Actor 4"));
        movies.add(new Movie("Movie 5", "Actor 5"));
        movies.add(new Movie("Movie 6", "Actor 6"));

        dates.add(new Date("23/06/2018", movies));

        movies = new ArrayList<>();
        movies.add(new Movie("Movie 1", "Actor 1"));
        movies.add(new Movie("Movie 2", "Actor 2"));
        movies.add(new Movie("Movie 3", "Actor 3"));
        movies.add(new Movie("Movie 4", "Actor 4"));
        movies.add(new Movie("Movie 5", "Actor 5"));
        movies.add(new Movie("Movie 6", "Actor 6"));

        dates.add(new Date("25/06/2018", movies));


        dateAdapter.notifyDataSetChanged();
    }
}
