package io.github.coderoly.fragswithnestedlists.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.coderoly.fragswithnestedlists.R;
import io.github.coderoly.fragswithnestedlists.object.Movie;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    private List<Movie> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView movie, actor;

        public MyViewHolder(View view) {
            super(view);
            movie = (TextView) view.findViewById(R.id.tv_Movie);
            actor = (TextView) view.findViewById(R.id.tv_Actor);
        }
    }


    public MyRecyclerAdapter(List<Movie> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.movie.setText(movie.getName());
        holder.actor.setText(movie.getActor());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}