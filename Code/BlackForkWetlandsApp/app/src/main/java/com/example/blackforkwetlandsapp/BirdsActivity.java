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

        birdList.add(new OrganismClass(getString(R.string.bird_2_name)
                , getString(R.string.bird_2_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_3_name)
                , getString(R.string.bird_3_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_4_name)
                , getString(R.string.bird_4_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_5_name)
                , getString(R.string.bird_5_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_6_name)
                , getString(R.string.bird_6_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_7_name)
                , getString(R.string.bird_7_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_8_name)
                , getString(R.string.bird_8_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_9_name)
                , getString(R.string.bird_9_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_10_name)
                , getString(R.string.bird_10_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_11_name)
                , getString(R.string.bird_11_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_12_name)
                , getString(R.string.bird_12_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_13_name)
                , getString(R.string.bird_13_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_14_name)
                , getString(R.string.bird_14_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_15_name)
                , getString(R.string.bird_15_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_16_name)
                , getString(R.string.bird_16_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_17_name)
                , getString(R.string.bird_17_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_18_name)
                , getString(R.string.bird_18_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_19_name)
                , getString(R.string.bird_19_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_20_name)
                , getString(R.string.bird_20_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_21_name)
                , getString(R.string.bird_21_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_22_name)
                , getString(R.string.bird_22_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_23_name)
                , getString(R.string.bird_23_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_24_name)
                , getString(R.string.bird_24_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_25_name)
                , getString(R.string.bird_25_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_26_name)
                , getString(R.string.bird_26_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_27_name)
                , getString(R.string.bird_27_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_28_name)
                , getString(R.string.bird_28_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_29_name)
                , getString(R.string.bird_29_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_30_name)
                , getString(R.string.bird_30_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_31_name)
                , getString(R.string.bird_31_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_32_name)
                , getString(R.string.bird_32_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_33_name)
                , getString(R.string.bird_33_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_34_name)
                , getString(R.string.bird_34_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_35_name)
                , getString(R.string.bird_35_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_36_name)
                , getString(R.string.bird_36_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_37_name)
                , getString(R.string.bird_37_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_38_name)
                , getString(R.string.bird_38_des), R.drawable.ic_android2));


        birdList.add(new OrganismClass(getString(R.string.bird_39_name)
                , getString(R.string.bird_39_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_40_name)
                , getString(R.string.bird_40_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_41_name)
                , getString(R.string.bird_41_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_42_name)
                , getString(R.string.bird_42_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_43_name)
                , getString(R.string.bird_43_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_44_name)
                , getString(R.string.bird_44_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_45_name)
                , getString(R.string.bird_45_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_46_name)
                , getString(R.string.bird_46_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_47_name)
                , getString(R.string.bird_47_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_48_name)
                , getString(R.string.bird_48_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_49_name)
                , getString(R.string.bird_49_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_50_name)
                , getString(R.string.bird_50_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_51_name)
                , getString(R.string.bird_51_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_52_name)
                , getString(R.string.bird_52_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_53_name)
                , getString(R.string.bird_53_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_54_name)
                , getString(R.string.bird_54_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_55_name)
                , getString(R.string.bird_55_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_56_name)
                , getString(R.string.bird_56_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_57_name)
                , getString(R.string.bird_57_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_58_name)
                , getString(R.string.bird_58_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_59_name)
                , getString(R.string.bird_59_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_60_name)
                , getString(R.string.bird_60_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_61_name)
                , getString(R.string.bird_61_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_62_name)
                , getString(R.string.bird_62_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_63_name)
                , getString(R.string.bird_63_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_64_name)
                , getString(R.string.bird_64_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_65_name)
                , getString(R.string.bird_65_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_66_name)
                , getString(R.string.bird_66_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_67_name)
                , getString(R.string.bird_67_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_68_name)
                , getString(R.string.bird_68_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_69_name)
                , getString(R.string.bird_69_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_70_name)
                , getString(R.string.bird_70_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_71_name)
                , getString(R.string.bird_71_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_72_name)
                , getString(R.string.bird_72_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_73_name)
                , getString(R.string.bird_73_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_74_name)
                , getString(R.string.bird_74_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_75_name)
                , getString(R.string.bird_75_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_76_name)
                , getString(R.string.bird_76_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_77_name)
                , getString(R.string.bird_77_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_78_name)
                , getString(R.string.bird_78_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_79_name)
                , getString(R.string.bird_79_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_80_name)
                , getString(R.string.bird_80_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_81_name)
                , getString(R.string.bird_81_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_82_name)
                , getString(R.string.bird_82_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_83_name)
                , getString(R.string.bird_83_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_84_name)
                , getString(R.string.bird_84_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_85_name)
                , getString(R.string.bird_85_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_86_name)
                , getString(R.string.bird_86_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_87_name)
                , getString(R.string.bird_87_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_88_name)
                , getString(R.string.bird_88_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_89_name)
                , getString(R.string.bird_89_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_90_name)
                , getString(R.string.bird_90_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_91_name)
                , getString(R.string.bird_91_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_92_name)
                , getString(R.string.bird_92_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_93_name)
                , getString(R.string.bird_93_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_94_name)
                , getString(R.string.bird_94_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_95_name)
                , getString(R.string.bird_95_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_96_name)
                , getString(R.string.bird_96_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_97_name)
                , getString(R.string.bird_97_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_98_name)
                , getString(R.string.bird_98_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_99_name)
                , getString(R.string.bird_99_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_100_name)
                , getString(R.string.bird_100_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_101_name)
                , getString(R.string.bird_101_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_102_name)
                , getString(R.string.bird_102_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_103_name)
                , getString(R.string.bird_103_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_104_name)
                , getString(R.string.bird_104_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_105_name)
                , getString(R.string.bird_105_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_106_name)
                , getString(R.string.bird_106_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_107_name)
                , getString(R.string.bird_107_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_108_name)
                , getString(R.string.bird_108_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_109_name)
                , getString(R.string.bird_109_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_110_name)
                , getString(R.string.bird_110_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_111_name)
                , getString(R.string.bird_111_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_112_name)
                , getString(R.string.bird_112_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_113_name)
                , getString(R.string.bird_113_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_114_name)
                , getString(R.string.bird_114_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_115_name)
                , getString(R.string.bird_115_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_116_name)
                , getString(R.string.bird_116_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_117_name)
                , getString(R.string.bird_117_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_118_name)
                , getString(R.string.bird_118_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_119_name)
                , getString(R.string.bird_119_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_120_name)
                , getString(R.string.bird_120_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_121_name)
                , getString(R.string.bird_121_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_122_name)
                , getString(R.string.bird_122_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_123_name)
                , getString(R.string.bird_123_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_124_name)
                , getString(R.string.bird_124_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_125_name)
                , getString(R.string.bird_125_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_126_name)
                , getString(R.string.bird_126_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_127_name)
                , getString(R.string.bird_127_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_128_name)
                , getString(R.string.bird_128_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_129_name)
                , getString(R.string.bird_129_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_130_name)
                , getString(R.string.bird_130_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_131_name)
                , getString(R.string.bird_131_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_132_name)
                , getString(R.string.bird_132_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_133_name)
                , getString(R.string.bird_133_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_134_name)
                , getString(R.string.bird_134_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_135_name)
                , getString(R.string.bird_135_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_136_name)
                , getString(R.string.bird_136_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_137_name)
                , getString(R.string.bird_137_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_138_name)
                , getString(R.string.bird_138_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_139_name)
                , getString(R.string.bird_139_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_140_name)
                , getString(R.string.bird_140_des), R.drawable.ic_android2));

        birdList.add(new OrganismClass(getString(R.string.bird_141_name)
                , getString(R.string.bird_141_des), R.drawable.ic_android2));




        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(birdList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
