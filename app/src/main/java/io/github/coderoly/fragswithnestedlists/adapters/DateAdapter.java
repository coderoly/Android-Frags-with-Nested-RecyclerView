package io.github.coderoly.fragswithnestedlists.adapters;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import io.github.coderoly.fragswithnestedlists.R;
import io.github.coderoly.fragswithnestedlists.objects.Date;

public class DateAdapter extends RecyclerView.Adapter<DateAdapter.MyViewHolder> {

    private List<Date> dateList;
    Context context;

    MovieAdapter movieAdapter;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvDate;
        public RecyclerView rvMovies;

        public MyViewHolder(View view) {
            super(view);
            tvDate = view.findViewById(R.id.tv_date);
            rvMovies = view.findViewById(R.id.recyclerView_movies);
        }
    }


    public DateAdapter(List<Date> dateList, Context context) {
        this.dateList = dateList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_dates_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Date date = dateList.get(position);
        holder.tvDate.setText(date.getDate());

        LinearLayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        holder.rvMovies.setLayoutManager(layoutManager);
        movieAdapter = new MovieAdapter(date.getMovies());

        holder.rvMovies.setAdapter(movieAdapter);
    }

    @Override
    public int getItemCount() {
        return dateList.size();
    }
}