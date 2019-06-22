package com.dicoding.picodiplima.listnba;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListTeamAdapter extends RecyclerView.Adapter<ListTeamAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<nba_team> listTeam;

    public ListTeamAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<nba_team> getListTeam() {
        return listTeam;
    }

    public void setListTeam(ArrayList<nba_team> listTeam) {
        this.listTeam = listTeam;
    }

    @NonNull
    @Override
    public ListTeamAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_file,viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListTeamAdapter.CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListTeam().get(position).getName());

        Glide.with(context)
                .load(getListTeam().get(position).getImg())
                .apply(new RequestOptions().override(70,70))
                .into(categoryViewHolder.imgTeam);
    }

    @Override
    public int getItemCount() {
        return getListTeam().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        ImageView imgTeam;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            context = itemView.getContext();
            tvName  = itemView.findViewById(R.id.tv_team_name);
            imgTeam = itemView.findViewById(R.id.imgteam);
        }
    }
}
