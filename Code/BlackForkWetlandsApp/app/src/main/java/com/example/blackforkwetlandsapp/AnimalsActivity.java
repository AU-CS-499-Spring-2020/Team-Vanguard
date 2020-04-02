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
                , getString(R.string.animal_2_des), R.drawable.american_beaver));

        animalList.add(new OrganismClass(getString(R.string.animal_3_name)
                , getString(R.string.animal_3_des), R.drawable.brown_rat));

        animalList.add(new OrganismClass(getString(R.string.animal_4_name)
                , getString(R.string.animal_4_des), R.drawable.muskrat));

        animalList.add(new OrganismClass(getString(R.string.animal_5_name)
                , getString(R.string.animal_5_des), R.drawable.eastern_chipmunk));

        animalList.add(new OrganismClass(getString(R.string.animal_6_name)
                , getString(R.string.animal_6_des), R.drawable.eastern_fox_squirrel));

        animalList.add(new OrganismClass(getString(R.string.animal_7_name)
                , getString(R.string.animal_7_des), R.drawable.eastern_grey_squirrel));

        animalList.add(new OrganismClass(getString(R.string.animal_8_name)
                , getString(R.string.animal_8_des), R.drawable.house_mouse));

        animalList.add(new OrganismClass(getString(R.string.animal_9_name)
                , getString(R.string.animal_9_des), R.drawable.meadow_vole));

        animalList.add(new OrganismClass(getString(R.string.animal_10_name)
                , getString(R.string.animal_10_des), R.drawable.red_squirrel));

        animalList.add(new OrganismClass(getString(R.string.animal_11_name)
                , getString(R.string.animal_11_des), R.drawable.southern_flying_squirrel));

        animalList.add(new OrganismClass(getString(R.string.animal_12_name)
                , getString(R.string.animal_12_des), R.drawable.white_footed_mouse));

        animalList.add(new OrganismClass(getString(R.string.animal_13_name)
                , getString(R.string.animal_13_des), R.drawable.groundhog));

        animalList.add(new OrganismClass(getString(R.string.animal_14_name)
                , getString(R.string.animal_14_des), R.drawable.eastern_cottontail));

        animalList.add(new OrganismClass(getString(R.string.animal_15_name)
                , getString(R.string.animal_15_des), R.drawable.eastern_mole));

        animalList.add(new OrganismClass(getString(R.string.animal_16_name)
                , getString(R.string.animal_16_des), R.drawable.northern_short_tailed_shrew));

        animalList.add(new OrganismClass(getString(R.string.animal_17_name)
                , getString(R.string.animal_17_des), R.drawable.big_brown_bat));

        animalList.add(new OrganismClass(getString(R.string.animal_18_name)
                , getString(R.string.animal_18_des), R.drawable.little_brown_bat));

        animalList.add(new OrganismClass(getString(R.string.animal_19_name)
                , getString(R.string.animal_19_des), R.drawable.northern_long_eared_bat));

        animalList.add(new OrganismClass(getString(R.string.animal_20_name)
                , getString(R.string.animal_20_des), R.drawable.american_mink));

        animalList.add(new OrganismClass(getString(R.string.animal_21_name)
                , getString(R.string.animal_21_des), R.drawable.bobcat));

        animalList.add(new OrganismClass(getString(R.string.animal_22_name)
                , getString(R.string.animal_22_des), R.drawable.coyote));

        animalList.add(new OrganismClass(getString(R.string.animal_23_name)
                , getString(R.string.animal_23_des), R.drawable.least_weasel));

        animalList.add(new OrganismClass(getString(R.string.animal_24_name)
                , getString(R.string.animal_24_des), R.drawable.long_tailed_weasel));

        animalList.add(new OrganismClass(getString(R.string.animal_25_name)
                , getString(R.string.animal_25_des), R.drawable.raccoon));

        animalList.add(new OrganismClass(getString(R.string.animal_26_name)
                , getString(R.string.animal_26_des), R.drawable.red_fox));

        animalList.add(new OrganismClass(getString(R.string.animal_27_name)
                , getString(R.string.animal_27_des), R.drawable.river_otter));

        animalList.add(new OrganismClass(getString(R.string.animal_28_name)
                , getString(R.string.animal_28_des), R.drawable.striped_skunk));

        animalList.add(new OrganismClass(getString(R.string.animal_29_name)
                , getString(R.string.animal_29_des), R.drawable.white_tailed_deer));


        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(animalList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
