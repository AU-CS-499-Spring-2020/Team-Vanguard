package com.example.blackforkwetlandsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private List<OrganismClass> animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animal_activity_layout);


        animalList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));
        animalList.add(new OrganismClass(getString(R.string.animal_test_name)
                , getString(R.string.animal_test_description), R.drawable.ic_android2));


        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(animalList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
