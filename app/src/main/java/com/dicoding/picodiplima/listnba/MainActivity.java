package com.dicoding.picodiplima.listnba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private ArrayList<nba_team> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(nba_teamData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListTeamAdapter listTeamAdapter = new ListTeamAdapter(this);
        listTeamAdapter.setListTeam(list);
        rvCategory.setAdapter(listTeamAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {

                moveIntent(list.get(position));


            }
        });
    }

    private void moveIntent(nba_team nbaTeam){
        Toast.makeText(this, "Lihat Detail "+ nbaTeam.getName(), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this, detail.class);
        i.putExtra(detail.TITLE, nbaTeam.getName());
        i.putExtra(detail.Detail1, nbaTeam.getConference());
        i.putExtra(detail.Detail2, nbaTeam.getFoundingDate());
        i.putExtra(detail.Detail3, nbaTeam.getArena());
        i.putExtra(detail.Detail4, nbaTeam.getCoach());

        i.putExtra(detail.IMG, nbaTeam.getImg());

        startActivity(i);


    }
}
