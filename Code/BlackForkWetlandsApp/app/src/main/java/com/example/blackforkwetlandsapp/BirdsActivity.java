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
                , getString(R.string.bird_1_des), R.drawable.bird_1_img));

        birdList.add(new OrganismClass(getString(R.string.bird_2_name)
                , getString(R.string.bird_2_des), R.drawable.bird_2_img));

        birdList.add(new OrganismClass(getString(R.string.bird_3_name)
                , getString(R.string.bird_3_des), R.drawable.bird_3_img));

        birdList.add(new OrganismClass(getString(R.string.bird_4_name)
                , getString(R.string.bird_4_des), R.drawable.bird_4_img));

        birdList.add(new OrganismClass(getString(R.string.bird_5_name)
                , getString(R.string.bird_5_des), R.drawable.bird_5_img));

        birdList.add(new OrganismClass(getString(R.string.bird_6_name)
                , getString(R.string.bird_6_des), R.drawable.bird_6_img));

        birdList.add(new OrganismClass(getString(R.string.bird_7_name)
                , getString(R.string.bird_7_des), R.drawable.bird_7_img));

        birdList.add(new OrganismClass(getString(R.string.bird_8_name)
                , getString(R.string.bird_8_des), R.drawable.bird_8_img));

        birdList.add(new OrganismClass(getString(R.string.bird_9_name)
                , getString(R.string.bird_9_des), R.drawable.bird_2_img));

        birdList.add(new OrganismClass(getString(R.string.bird_10_name)
                , getString(R.string.bird_10_des), R.drawable.bird_10_img));

        birdList.add(new OrganismClass(getString(R.string.bird_11_name)
                , getString(R.string.bird_11_des), R.drawable.bird_11_img));

        birdList.add(new OrganismClass(getString(R.string.bird_12_name)
                , getString(R.string.bird_12_des), R.drawable.bird_12_img));

        birdList.add(new OrganismClass(getString(R.string.bird_13_name)
                , getString(R.string.bird_13_des), R.drawable.bird_13_img));

        birdList.add(new OrganismClass(getString(R.string.bird_14_name)
                , getString(R.string.bird_14_des), R.drawable.bird_14_img));

        birdList.add(new OrganismClass(getString(R.string.bird_15_name)
                , getString(R.string.bird_15_des), R.drawable.bird_15_img));

        birdList.add(new OrganismClass(getString(R.string.bird_16_name)
                , getString(R.string.bird_16_des), R.drawable.bird_16_img));

        birdList.add(new OrganismClass(getString(R.string.bird_17_name)
                , getString(R.string.bird_17_des), R.drawable.bird_17_img));

        birdList.add(new OrganismClass(getString(R.string.bird_18_name)
                , getString(R.string.bird_18_des), R.drawable.bird_18_img));

        birdList.add(new OrganismClass(getString(R.string.bird_19_name)
                , getString(R.string.bird_19_des), R.drawable.bird_19_img));

        birdList.add(new OrganismClass(getString(R.string.bird_20_name)
                , getString(R.string.bird_20_des), R.drawable.bird_20_img));

        birdList.add(new OrganismClass(getString(R.string.bird_21_name)
                , getString(R.string.bird_21_des), R.drawable.bird_21_img));

        birdList.add(new OrganismClass(getString(R.string.bird_22_name)
                , getString(R.string.bird_22_des), R.drawable.bird_22_img));

        birdList.add(new OrganismClass(getString(R.string.bird_23_name)
                , getString(R.string.bird_23_des), R.drawable.bird_23_img));

        birdList.add(new OrganismClass(getString(R.string.bird_24_name)
                , getString(R.string.bird_24_des), R.drawable.bird_24_img));

        birdList.add(new OrganismClass(getString(R.string.bird_25_name)
                , getString(R.string.bird_25_des), R.drawable.bird_25_img));

        birdList.add(new OrganismClass(getString(R.string.bird_26_name)
                , getString(R.string.bird_26_des), R.drawable.bird_26_img));

        birdList.add(new OrganismClass(getString(R.string.bird_27_name)
                , getString(R.string.bird_27_des), R.drawable.bird_27_img));

        birdList.add(new OrganismClass(getString(R.string.bird_28_name)
                , getString(R.string.bird_28_des), R.drawable.bird_28_img));

        birdList.add(new OrganismClass(getString(R.string.bird_29_name)
                , getString(R.string.bird_29_des), R.drawable.bird_29_img));

        birdList.add(new OrganismClass(getString(R.string.bird_30_name)
                , getString(R.string.bird_30_des), R.drawable.bird_30_img));

        birdList.add(new OrganismClass(getString(R.string.bird_31_name)
                , getString(R.string.bird_31_des), R.drawable.bird_31_img));

        birdList.add(new OrganismClass(getString(R.string.bird_32_name)
                , getString(R.string.bird_32_des), R.drawable.bird_32_img));

        birdList.add(new OrganismClass(getString(R.string.bird_33_name)
                , getString(R.string.bird_33_des), R.drawable.bird_33_img));

        birdList.add(new OrganismClass(getString(R.string.bird_34_name)
                , getString(R.string.bird_34_des), R.drawable.bird_34_img));

        birdList.add(new OrganismClass(getString(R.string.bird_35_name)
                , getString(R.string.bird_35_des), R.drawable.bird_35_img));

        birdList.add(new OrganismClass(getString(R.string.bird_36_name)
                , getString(R.string.bird_36_des), R.drawable.bird_36_img));

        birdList.add(new OrganismClass(getString(R.string.bird_37_name)
                , getString(R.string.bird_37_des), R.drawable.bird_37_img));

        birdList.add(new OrganismClass(getString(R.string.bird_38_name)
                , getString(R.string.bird_38_des), R.drawable.bird_38_img));


        birdList.add(new OrganismClass(getString(R.string.bird_39_name)
                , getString(R.string.bird_39_des), R.drawable.bird_39_img));

        birdList.add(new OrganismClass(getString(R.string.bird_40_name)
                , getString(R.string.bird_40_des), R.drawable.bird_40_img));

        birdList.add(new OrganismClass(getString(R.string.bird_41_name)
                , getString(R.string.bird_41_des), R.drawable.bird_41_img));

        birdList.add(new OrganismClass(getString(R.string.bird_42_name)
                , getString(R.string.bird_42_des), R.drawable.bird_42_img));

        birdList.add(new OrganismClass(getString(R.string.bird_43_name)
                , getString(R.string.bird_43_des), R.drawable.bird_43_img));

        birdList.add(new OrganismClass(getString(R.string.bird_44_name)
                , getString(R.string.bird_44_des), R.drawable.bird_44_img));

        birdList.add(new OrganismClass(getString(R.string.bird_45_name)
                , getString(R.string.bird_45_des), R.drawable.bird_45_img));

        birdList.add(new OrganismClass(getString(R.string.bird_46_name)
                , getString(R.string.bird_46_des), R.drawable.bird_46_img));

        birdList.add(new OrganismClass(getString(R.string.bird_47_name)
                , getString(R.string.bird_47_des), R.drawable.bird_47_img));

        birdList.add(new OrganismClass(getString(R.string.bird_48_name)
                , getString(R.string.bird_48_des), R.drawable.bird_48_img));

        birdList.add(new OrganismClass(getString(R.string.bird_49_name)
                , getString(R.string.bird_49_des), R.drawable.bird_49_img));

        birdList.add(new OrganismClass(getString(R.string.bird_50_name)
                , getString(R.string.bird_50_des), R.drawable.bird_50_img));

        birdList.add(new OrganismClass(getString(R.string.bird_51_name)
                , getString(R.string.bird_51_des), R.drawable.bird_51_img));

        birdList.add(new OrganismClass(getString(R.string.bird_52_name)
                , getString(R.string.bird_52_des), R.drawable.bird_52_img));

        birdList.add(new OrganismClass(getString(R.string.bird_53_name)
                , getString(R.string.bird_53_des), R.drawable.bird_53_img));

        birdList.add(new OrganismClass(getString(R.string.bird_54_name)
                , getString(R.string.bird_54_des), R.drawable.bird_54_img));

        birdList.add(new OrganismClass(getString(R.string.bird_55_name)
                , getString(R.string.bird_55_des), R.drawable.bird_55_img));

        birdList.add(new OrganismClass(getString(R.string.bird_56_name)
                , getString(R.string.bird_56_des), R.drawable.bird_56_img));

        birdList.add(new OrganismClass(getString(R.string.bird_57_name)
                , getString(R.string.bird_57_des), R.drawable.bird_57_img));

        birdList.add(new OrganismClass(getString(R.string.bird_58_name)
                , getString(R.string.bird_58_des), R.drawable.bird_58_img));

        birdList.add(new OrganismClass(getString(R.string.bird_59_name)
                , getString(R.string.bird_59_des), R.drawable.bird_59_img));

        birdList.add(new OrganismClass(getString(R.string.bird_60_name)
                , getString(R.string.bird_60_des), R.drawable.bird_60_img));

        birdList.add(new OrganismClass(getString(R.string.bird_61_name)
                , getString(R.string.bird_61_des), R.drawable.bird_61_img));

        birdList.add(new OrganismClass(getString(R.string.bird_62_name)
                , getString(R.string.bird_62_des), R.drawable.bird_62_img));

        birdList.add(new OrganismClass(getString(R.string.bird_63_name)
                , getString(R.string.bird_63_des), R.drawable.bird_63_img));

        birdList.add(new OrganismClass(getString(R.string.bird_64_name)
                , getString(R.string.bird_64_des), R.drawable.bird_64_img));

        birdList.add(new OrganismClass(getString(R.string.bird_65_name)
                , getString(R.string.bird_65_des), R.drawable.bird_65_img));

        birdList.add(new OrganismClass(getString(R.string.bird_66_name)
                , getString(R.string.bird_66_des), R.drawable.bird_66_img));

        birdList.add(new OrganismClass(getString(R.string.bird_67_name)
                , getString(R.string.bird_67_des), R.drawable.bird_67_img));

        birdList.add(new OrganismClass(getString(R.string.bird_68_name)
                , getString(R.string.bird_68_des), R.drawable.bird_68_img));

        birdList.add(new OrganismClass(getString(R.string.bird_69_name)
                , getString(R.string.bird_69_des), R.drawable.bird_69_img));

        birdList.add(new OrganismClass(getString(R.string.bird_70_name)
                , getString(R.string.bird_70_des), R.drawable.bird_70_img));

        birdList.add(new OrganismClass(getString(R.string.bird_71_name)
                , getString(R.string.bird_71_des), R.drawable.bird_71_img));

        birdList.add(new OrganismClass(getString(R.string.bird_72_name)
                , getString(R.string.bird_72_des), R.drawable.bird_72_img));

        birdList.add(new OrganismClass(getString(R.string.bird_73_name)
                , getString(R.string.bird_73_des), R.drawable.bird_73_img));

        birdList.add(new OrganismClass(getString(R.string.bird_74_name)
                , getString(R.string.bird_74_des), R.drawable.bird_74_img));

        birdList.add(new OrganismClass(getString(R.string.bird_75_name)
                , getString(R.string.bird_75_des), R.drawable.bird_75_img));

        birdList.add(new OrganismClass(getString(R.string.bird_76_name)
                , getString(R.string.bird_76_des), R.drawable.bird_76_img));

        birdList.add(new OrganismClass(getString(R.string.bird_77_name)
                , getString(R.string.bird_77_des), R.drawable.bird_77_img));

        birdList.add(new OrganismClass(getString(R.string.bird_78_name)
                , getString(R.string.bird_78_des), R.drawable.bird_78_img));

        birdList.add(new OrganismClass(getString(R.string.bird_79_name)
                , getString(R.string.bird_79_des), R.drawable.bird_79_img));

        birdList.add(new OrganismClass(getString(R.string.bird_80_name)
                , getString(R.string.bird_80_des), R.drawable.bird_80_img));

        birdList.add(new OrganismClass(getString(R.string.bird_81_name)
                , getString(R.string.bird_81_des), R.drawable.bird_81_img));

        birdList.add(new OrganismClass(getString(R.string.bird_82_name)
                , getString(R.string.bird_82_des), R.drawable.bird_82_img));

        birdList.add(new OrganismClass(getString(R.string.bird_83_name)
                , getString(R.string.bird_83_des), R.drawable.bird_83_img));

        birdList.add(new OrganismClass(getString(R.string.bird_84_name)
                , getString(R.string.bird_84_des), R.drawable.bird_84_img));

        birdList.add(new OrganismClass(getString(R.string.bird_85_name)
                , getString(R.string.bird_85_des), R.drawable.bird_85_img));

        birdList.add(new OrganismClass(getString(R.string.bird_86_name)
                , getString(R.string.bird_86_des), R.drawable.bird_86_img));

        birdList.add(new OrganismClass(getString(R.string.bird_87_name)
                , getString(R.string.bird_87_des), R.drawable.bird_87_img));

        birdList.add(new OrganismClass(getString(R.string.bird_88_name)
                , getString(R.string.bird_88_des), R.drawable.bird_88_img));

        birdList.add(new OrganismClass(getString(R.string.bird_89_name)
                , getString(R.string.bird_89_des), R.drawable.bird_89_img));

        birdList.add(new OrganismClass(getString(R.string.bird_90_name)
                , getString(R.string.bird_90_des), R.drawable.bird_90_img));

        birdList.add(new OrganismClass(getString(R.string.bird_91_name)
                , getString(R.string.bird_91_des), R.drawable.bird_91_img));

        birdList.add(new OrganismClass(getString(R.string.bird_92_name)
                , getString(R.string.bird_92_des), R.drawable.bird_92_img));

        birdList.add(new OrganismClass(getString(R.string.bird_93_name)
                , getString(R.string.bird_93_des), R.drawable.bird_93_img));

        birdList.add(new OrganismClass(getString(R.string.bird_94_name)
                , getString(R.string.bird_94_des), R.drawable.bird_94_img));

        birdList.add(new OrganismClass(getString(R.string.bird_95_name)
                , getString(R.string.bird_95_des), R.drawable.bird_95_img));

        birdList.add(new OrganismClass(getString(R.string.bird_96_name)
                , getString(R.string.bird_96_des), R.drawable.bird_96_img));

        birdList.add(new OrganismClass(getString(R.string.bird_97_name)
                , getString(R.string.bird_97_des), R.drawable.bird_97_img));

        birdList.add(new OrganismClass(getString(R.string.bird_98_name)
                , getString(R.string.bird_98_des), R.drawable.bird_98_img));

        birdList.add(new OrganismClass(getString(R.string.bird_99_name)
                , getString(R.string.bird_99_des), R.drawable.bird_99_img));

        birdList.add(new OrganismClass(getString(R.string.bird_100_name)
                , getString(R.string.bird_100_des), R.drawable.bird_100_img));

        birdList.add(new OrganismClass(getString(R.string.bird_101_name)
                , getString(R.string.bird_101_des), R.drawable.bird_101_img));

        birdList.add(new OrganismClass(getString(R.string.bird_102_name)
                , getString(R.string.bird_102_des), R.drawable.bird_102_img));

        birdList.add(new OrganismClass(getString(R.string.bird_103_name)
                , getString(R.string.bird_103_des), R.drawable.bird_103_img));

        birdList.add(new OrganismClass(getString(R.string.bird_104_name)
                , getString(R.string.bird_104_des), R.drawable.bird_104_img));

        birdList.add(new OrganismClass(getString(R.string.bird_105_name)
                , getString(R.string.bird_105_des), R.drawable.bird_105_img));

        birdList.add(new OrganismClass(getString(R.string.bird_106_name)
                , getString(R.string.bird_106_des), R.drawable.bird_106_img));

        birdList.add(new OrganismClass(getString(R.string.bird_107_name)
                , getString(R.string.bird_107_des), R.drawable.bird_107_img));

        birdList.add(new OrganismClass(getString(R.string.bird_108_name)
                , getString(R.string.bird_108_des), R.drawable.bird_108_img));

        birdList.add(new OrganismClass(getString(R.string.bird_109_name)
                , getString(R.string.bird_109_des), R.drawable.bird_109_img));

        birdList.add(new OrganismClass(getString(R.string.bird_110_name)
                , getString(R.string.bird_110_des), R.drawable.bird_110_img));

        birdList.add(new OrganismClass(getString(R.string.bird_111_name)
                , getString(R.string.bird_111_des), R.drawable.bird_111_img));

        birdList.add(new OrganismClass(getString(R.string.bird_112_name)
                , getString(R.string.bird_112_des), R.drawable.bird_112_img));

        birdList.add(new OrganismClass(getString(R.string.bird_113_name)
                , getString(R.string.bird_113_des), R.drawable.bird_113_img));

        birdList.add(new OrganismClass(getString(R.string.bird_114_name)
                , getString(R.string.bird_114_des), R.drawable.bird_114_img));

        birdList.add(new OrganismClass(getString(R.string.bird_115_name)
                , getString(R.string.bird_115_des), R.drawable.bird_115_img));

        birdList.add(new OrganismClass(getString(R.string.bird_116_name)
                , getString(R.string.bird_116_des), R.drawable.bird_116_img));

        birdList.add(new OrganismClass(getString(R.string.bird_117_name)
                , getString(R.string.bird_117_des), R.drawable.bird_117_img));

        birdList.add(new OrganismClass(getString(R.string.bird_118_name)
                , getString(R.string.bird_118_des), R.drawable.bird_118_img));

        birdList.add(new OrganismClass(getString(R.string.bird_119_name)
                , getString(R.string.bird_119_des), R.drawable.bird_119_img));

        birdList.add(new OrganismClass(getString(R.string.bird_120_name)
                , getString(R.string.bird_120_des), R.drawable.bird_120_img));

        birdList.add(new OrganismClass(getString(R.string.bird_121_name)
                , getString(R.string.bird_121_des), R.drawable.bird_121_img));

        birdList.add(new OrganismClass(getString(R.string.bird_122_name)
                , getString(R.string.bird_122_des), R.drawable.bird_122_img));

        birdList.add(new OrganismClass(getString(R.string.bird_123_name)
                , getString(R.string.bird_123_des), R.drawable.bird_123_img));

        birdList.add(new OrganismClass(getString(R.string.bird_124_name)
                , getString(R.string.bird_124_des), R.drawable.bird_124_img));

        birdList.add(new OrganismClass(getString(R.string.bird_125_name)
                , getString(R.string.bird_125_des), R.drawable.bird_125_img));

        birdList.add(new OrganismClass(getString(R.string.bird_126_name)
                , getString(R.string.bird_126_des), R.drawable.bird_126_img));

        birdList.add(new OrganismClass(getString(R.string.bird_127_name)
                , getString(R.string.bird_127_des), R.drawable.bird_127_img));

        birdList.add(new OrganismClass(getString(R.string.bird_128_name)
                , getString(R.string.bird_128_des), R.drawable.bird_128_img));

        birdList.add(new OrganismClass(getString(R.string.bird_129_name)
                , getString(R.string.bird_129_des), R.drawable.bird_129_img));

        birdList.add(new OrganismClass(getString(R.string.bird_130_name)
                , getString(R.string.bird_130_des), R.drawable.bird_130_img));

        birdList.add(new OrganismClass(getString(R.string.bird_131_name)
                , getString(R.string.bird_131_des), R.drawable.bird_131_img));

        birdList.add(new OrganismClass(getString(R.string.bird_132_name)
                , getString(R.string.bird_132_des), R.drawable.bird_132_img));

        birdList.add(new OrganismClass(getString(R.string.bird_133_name)
                , getString(R.string.bird_133_des), R.drawable.bird_133_img));

        birdList.add(new OrganismClass(getString(R.string.bird_134_name)
                , getString(R.string.bird_134_des), R.drawable.bird_134_img));

        birdList.add(new OrganismClass(getString(R.string.bird_135_name)
                , getString(R.string.bird_135_des), R.drawable.bird_135_img));

        birdList.add(new OrganismClass(getString(R.string.bird_136_name)
                , getString(R.string.bird_136_des), R.drawable.bird_136_img));

        birdList.add(new OrganismClass(getString(R.string.bird_137_name)
                , getString(R.string.bird_137_des), R.drawable.bird_137_img));

        birdList.add(new OrganismClass(getString(R.string.bird_138_name)
                , getString(R.string.bird_138_des), R.drawable.bird_138_img));

        birdList.add(new OrganismClass(getString(R.string.bird_139_name)
                , getString(R.string.bird_139_des), R.drawable.bird_139_img));

        birdList.add(new OrganismClass(getString(R.string.bird_140_name)
                , getString(R.string.bird_140_des), R.drawable.bird_140_img));

        birdList.add(new OrganismClass(getString(R.string.bird_141_name)
                , getString(R.string.bird_141_des), R.drawable.bird_141_img));




        OrganismRecyclerAdapter recyclerAdapter = new OrganismRecyclerAdapter(birdList);
        recyclerView.setAdapter(recyclerAdapter);
    }
}
