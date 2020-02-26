package com.example.blackforkwetlandsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PlantsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<OrganismClass> plantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plant_activity_layout);


        plantList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));
        plantList.add(new OrganismClass(getString(R.string.plant_test_name)
                , getString(R.string.plant_test_description), R.drawable.ic_android2));



        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(plantList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
