package com.example.dadosjogos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.dadosjogos.fragment.BrasileiroAFragment;
import com.example.dadosjogos.fragment.InglesPremierLeagueFragment;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smartTabLayout = findViewById(R.id.viewPagerTab);
        viewPager      = findViewById(R.id.viewPager);

        //Configurar adapter para as abas
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Brasileiro A", BrasileiroAFragment.class)
                        .add("Inglês(Premier League)", InglesPremierLeagueFragment.class)
                .create()
        );

        //configuração do ViewPager
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);

    }



}