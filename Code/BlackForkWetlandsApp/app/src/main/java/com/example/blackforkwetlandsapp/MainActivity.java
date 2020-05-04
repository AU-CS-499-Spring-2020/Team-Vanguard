package com.example.blackforkwetlandsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //private RecyclerView recyclerView;
    //private List<OrganismClass> organismClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        Button birdButton = findViewById(R.id.birdButton);
        birdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BirdsActivity.class);
                startActivity(intent);
            }
        });

        Button animalButton = findViewById(R.id.animalButton);
        animalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimalsActivity.class);
                startActivity(intent);
            }
        });


        Button treeButton = findViewById(R.id.treeButton);
        treeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TreesActivity.class);
                startActivity(intent);
            }
        });


        Button infoButton = findViewById(R.id.infoButton);
        infoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GenInfoActivity.class);
                startActivity(intent);
            }
        });
        /*
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
         */
    }
}
