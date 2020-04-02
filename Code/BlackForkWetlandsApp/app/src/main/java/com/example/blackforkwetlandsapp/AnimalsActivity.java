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
        setContentView(R.layout.recycler_layout);


        animalList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        animalList.add(new OrganismClass(getString(R.string.animal_1_name)
                , getString(R.string.animal_1_des), R.drawable.virgina_opossum));

        animalList.add(new OrganismClass(getString(R.string.animal_2_name)
                , getString(R.string.animal_2_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_3_name)
                , getString(R.string.animal_3_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_4_name)
                , getString(R.string.animal_4_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_5_name)
                , getString(R.string.animal_5_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_6_name)
                , getString(R.string.animal_6_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_7_name)
                , getString(R.string.animal_7_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_8_name)
                , getString(R.string.animal_8_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_9_name)
                , getString(R.string.animal_9_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_10_name)
                , getString(R.string.animal_10_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_11_name)
                , getString(R.string.animal_11_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_12_name)
                , getString(R.string.animal_12_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_13_name)
                , getString(R.string.animal_13_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_14_name)
                , getString(R.string.animal_14_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_15_name)
                , getString(R.string.animal_15_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_16_name)
                , getString(R.string.animal_16_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_17_name)
                , getString(R.string.animal_17_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_18_name)
                , getString(R.string.animal_18_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_19_name)
                , getString(R.string.animal_19_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_20_name)
                , getString(R.string.animal_20_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_21_name)
                , getString(R.string.animal_21_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_22_name)
                , getString(R.string.animal_22_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_23_name)
                , getString(R.string.animal_23_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_24_name)
                , getString(R.string.animal_24_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_25_name)
                , getString(R.string.animal_25_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_26_name)
                , getString(R.string.animal_26_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_27_name)
                , getString(R.string.animal_27_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_28_name)
                , getString(R.string.animal_28_des), R.drawable.ic_android2));

        animalList.add(new OrganismClass(getString(R.string.animal_29_name)
                , getString(R.string.animal_29_des), R.drawable.ic_android2));


        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(animalList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
