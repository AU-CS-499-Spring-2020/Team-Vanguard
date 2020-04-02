package com.example.blackforkwetlandsapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BirdsActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<OrganismClass> birdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_layout);


        birdList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        birdList.add(new OrganismClass(getString(R.string.bird_1_name)
                , getString(R.string.bird_1_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_3_name)
                , getString(R.string.bird_3_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_5_name)
                , getString(R.string.bird_5_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_7_name)
                , getString(R.string.bird_7_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_9_name)
                , getString(R.string.bird_9_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_11_name)
                , getString(R.string.bird_11_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_13_name)
                , getString(R.string.bird_13_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_15_name)
                , getString(R.string.bird_15_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_17_name)
                , getString(R.string.bird_17_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_19_name)
                , getString(R.string.bird_19_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_21_name)
                , getString(R.string.bird_21_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_23_name)
                , getString(R.string.bird_23_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_25_name)
                , getString(R.string.bird_25_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_27_name)
                , getString(R.string.bird_27_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_29_name)
                , getString(R.string.bird_29_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_31_name)
                , getString(R.string.bird_31_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_33_name)
                , getString(R.string.bird_33_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_35_name)
                , getString(R.string.bird_35_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_37_name)
                , getString(R.string.bird_37_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_39_name)
                , getString(R.string.bird_39_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_41_name)
                , getString(R.string.bird_41_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_43_name)
                , getString(R.string.bird_43_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_45_name)
                , getString(R.string.bird_45_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_47_name)
                , getString(R.string.bird_47_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_49_name)
                , getString(R.string.bird_49_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_51_name)
                , getString(R.string.bird_51_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_53_name)
                , getString(R.string.bird_53_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_55_name)
                , getString(R.string.bird_55_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_57_name)
                , getString(R.string.bird_57_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_59_name)
                , getString(R.string.bird_59_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_61_name)
                , getString(R.string.bird_61_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_63_name)
                , getString(R.string.bird_63_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_65_name)
                , getString(R.string.bird_65_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_67_name)
                , getString(R.string.bird_67_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_69_name)
                , getString(R.string.bird_69_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_71_name)
                , getString(R.string.bird_71_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_73_name)
                , getString(R.string.bird_73_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_75_name)
                , getString(R.string.bird_75_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_77_name)
                , getString(R.string.bird_77_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_79_name)
                , getString(R.string.bird_79_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_81_name)
                , getString(R.string.bird_81_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_83_name)
                , getString(R.string.bird_83_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_85_name)
                , getString(R.string.bird_85_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_87_name)
                , getString(R.string.bird_87_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_89_name)
                , getString(R.string.bird_89_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_91_name)
                , getString(R.string.bird_91_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_93_name)
                , getString(R.string.bird_93_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_95_name)
                , getString(R.string.bird_95_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_97_name)
                , getString(R.string.bird_97_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_99_name)
                , getString(R.string.bird_99_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_101_name)
                , getString(R.string.bird_101_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_103_name)
                , getString(R.string.bird_103_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_105_name)
                , getString(R.string.bird_105_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_107_name)
                , getString(R.string.bird_107_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_109_name)
                , getString(R.string.bird_109_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_111_name)
                , getString(R.string.bird_111_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_113_name)
                , getString(R.string.bird_113_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_115_name)
                , getString(R.string.bird_115_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_117_name)
                , getString(R.string.bird_117_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_119_name)
                , getString(R.string.bird_119_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_121_name)
                , getString(R.string.bird_121_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_123_name)
                , getString(R.string.bird_123_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_125_name)
                , getString(R.string.bird_125_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_127_name)
                , getString(R.string.bird_127_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_129_name)
                , getString(R.string.bird_129_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_131_name)
                , getString(R.string.bird_131_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_133_name)
                , getString(R.string.bird_133_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_135_name)
                , getString(R.string.bird_135_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_137_name)
                , getString(R.string.bird_137_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_139_name)
                , getString(R.string.bird_139_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_141_name)
                , getString(R.string.bird_141_des), R.drawable.ic_android2));



        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(birdList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
