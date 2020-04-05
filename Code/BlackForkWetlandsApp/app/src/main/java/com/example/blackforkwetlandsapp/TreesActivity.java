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
                , getString(R.string.tree_1_des), R.drawable.tulip_tree));

        treeList.add(new OrganismClass(getString(R.string.tree_2_name)
                , getString(R.string.tree_2_des), R.drawable.sycamore));

        treeList.add(new OrganismClass(getString(R.string.tree_3_name)
                , getString(R.string.tree_3_des), R.drawable.american_elm));

        treeList.add(new OrganismClass(getString(R.string.tree_4_name)
                , getString(R.string.tree_4_des), R.drawable.american_hackberry));

        treeList.add(new OrganismClass(getString(R.string.tree_5_name)
                , getString(R.string.tree_5_des), R.drawable.black_walnut));

        treeList.add(new OrganismClass(getString(R.string.tree_6_name)
                , getString(R.string.tree_6_des), R.drawable.bitternut_hickory));

        treeList.add(new OrganismClass(getString(R.string.tree_7_name)
                , getString(R.string.tree_7_des), R.drawable.shellbark_hickory));

        treeList.add(new OrganismClass(getString(R.string.tree_8_name)
                , getString(R.string.tree_8_des), R.drawable.shagbark_hickory));

        treeList.add(new OrganismClass(getString(R.string.tree_9_name)
                , getString(R.string.tree_9_des), R.drawable.american_beech));

        treeList.add(new OrganismClass(getString(R.string.tree_10_name)
                , getString(R.string.tree_10_des), R.drawable.white_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_11_name)
                , getString(R.string.tree_11_des), R.drawable.bur_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_12_name)
                , getString(R.string.tree_12_des), R.drawable.swamp_white_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_13_name)
                , getString(R.string.tree_13_des), R.drawable.shingle_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_14_name)
                , getString(R.string.tree_14_des), R.drawable.black_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_15_name)
                , getString(R.string.tree_15_des), R.drawable.red_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_16_name)
                , getString(R.string.tree_16_des), R.drawable.pin_oak));

        treeList.add(new OrganismClass(getString(R.string.tree_17_name)
                , getString(R.string.tree_17_des), R.drawable.eastern_hophornbeam));

        treeList.add(new OrganismClass(getString(R.string.tree_18_name)
                , getString(R.string.tree_18_des), R.drawable.ironwood));

        treeList.add(new OrganismClass(getString(R.string.tree_19_name)
                , getString(R.string.tree_19_des), R.drawable.alder));

        treeList.add(new OrganismClass(getString(R.string.tree_20_name)
                , getString(R.string.tree_20_des), R.drawable.american_basswood));

        treeList.add(new OrganismClass(getString(R.string.tree_21_name)
                , getString(R.string.tree_21_des), R.drawable.cottonwood));

        treeList.add(new OrganismClass(getString(R.string.tree_22_name)
                , getString(R.string.tree_22_des), R.drawable.black_willow));

        treeList.add(new OrganismClass(getString(R.string.tree_23_name)
                , getString(R.string.tree_23_des), R.drawable.wild_black_cherry));

        treeList.add(new OrganismClass(getString(R.string.tree_24_name)
                , getString(R.string.tree_24_des), R.drawable.hawthorn));

        treeList.add(new OrganismClass(getString(R.string.tree_25_name)
                , getString(R.string.tree_25_des), R.drawable.honey_locust));

        treeList.add(new OrganismClass(getString(R.string.tree_26_name)
                , getString(R.string.tree_26_des), R.drawable.black_locust));

        treeList.add(new OrganismClass(getString(R.string.tree_27_name)
                , getString(R.string.tree_27_des), R.drawable.flowering_dogwood));

        treeList.add(new OrganismClass(getString(R.string.tree_28_name)
                , getString(R.string.tree_28_des), R.drawable.silky_dogwood));

        treeList.add(new OrganismClass(getString(R.string.tree_29_name)
                , getString(R.string.tree_29_des), R.drawable.bladdernut));

        treeList.add(new OrganismClass(getString(R.string.tree_30_name)
                , getString(R.string.tree_30_des), R.drawable.ohio_buckeye));

        treeList.add(new OrganismClass(getString(R.string.tree_31_name)
                , getString(R.string.tree_31_des), R.drawable.sugar_maple));

        treeList.add(new OrganismClass(getString(R.string.tree_32_name)
                , getString(R.string.tree_32_des), R.drawable.black_maple));

        treeList.add(new OrganismClass(getString(R.string.tree_33_name)
                , getString(R.string.tree_33_des), R.drawable.red_maple));

        treeList.add(new OrganismClass(getString(R.string.tree_34_name)
                , getString(R.string.tree_34_des), R.drawable.silver_maple));

        treeList.add(new OrganismClass(getString(R.string.tree_35_name)
                , getString(R.string.tree_35_des), R.drawable.box_elder));

        treeList.add(new OrganismClass(getString(R.string.tree_36_name)
                , getString(R.string.tree_36_des), R.drawable.white_ash));

        treeList.add(new OrganismClass(getString(R.string.tree_37_name)
                , getString(R.string.tree_37_des), R.drawable.green_ash));

        treeList.add(new OrganismClass(getString(R.string.tree_38_name)
                , getString(R.string.tree_38_des), R.drawable.pumpkin_ash));

        treeList.add(new OrganismClass(getString(R.string.tree_39_name)
                , getString(R.string.tree_39_des), R.drawable.black_ash));

        treeList.add(new OrganismClass(getString(R.string.tree_40_name)
                , getString(R.string.tree_40_des), R.drawable.buttonbush));

        treeList.add(new OrganismClass(getString(R.string.tree_41_name)
                , getString(R.string.tree_41_des), R.drawable.arrowwood));

        treeList.add(new OrganismClass(getString(R.string.tree_42_name)
                , getString(R.string.tree_42_des), R.drawable.sweet_viburnum));



        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(treeList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
