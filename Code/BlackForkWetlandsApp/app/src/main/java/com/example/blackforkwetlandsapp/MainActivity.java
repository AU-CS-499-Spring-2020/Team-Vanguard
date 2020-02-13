package com.example.blackforkwetlandsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<OrganismClass> organismClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        organismClassList = new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));
        organismClassList.add(new OrganismClass(getString(R.string.organism_test_name)
                , getString(R.string.organism_test_description), R.drawable.ic_android2));


        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(organismClassList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
