package com.example.blackforkwetlandsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TreesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<OrganismClass> treeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_layout);


        treeList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        treeList.add(new OrganismClass(getString(R.string.tree_1_name)
                , getString(R.string.tree_1_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_3_name)
                , getString(R.string.tree_3_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_5_name)
                , getString(R.string.tree_5_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_7_name)
                , getString(R.string.tree_7_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_9_name)
                , getString(R.string.tree_9_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_11_name)
                , getString(R.string.tree_11_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_13_name)
                , getString(R.string.tree_13_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_15_name)
                , getString(R.string.tree_15_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_17_name)
                , getString(R.string.tree_17_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_19_name)
                , getString(R.string.tree_19_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_21_name)
                , getString(R.string.tree_21_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_23_name)
                , getString(R.string.tree_23_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_25_name)
                , getString(R.string.tree_25_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_27_name)
                , getString(R.string.tree_27_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_29_name)
                , getString(R.string.tree_29_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_31_name)
                , getString(R.string.tree_31_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_33_name)
                , getString(R.string.tree_33_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_35_name)
                , getString(R.string.tree_35_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_37_name)
                , getString(R.string.tree_37_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_39_name)
                , getString(R.string.tree_39_des), R.drawable.ic_android2));

        treeList.add(new OrganismClass(getString(R.string.tree_41_name)
                , getString(R.string.tree_41_des), R.drawable.ic_android2));




        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(treeList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
