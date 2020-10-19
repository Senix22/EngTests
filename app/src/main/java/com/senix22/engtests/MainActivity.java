 package com.senix22.engtests;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.senix22.engtests.fragments.PageFragment1;
import com.senix22.engtests.fragments.PageFragment2;
import com.senix22.engtests.fragments.PageFragment3;
//import com.senix22.engtests.fragments.PageFragment3;

import java.util.ArrayList;
import java.util.List;

 public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    static public int countAnsw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new PageFragment1());
        list.add(new PageFragment2());
        list.add(new PageFragment3());


        pager = findViewById(R.id.pager );

        pagerAdapter = new TestActivity(getSupportFragmentManager(),list);
        pager.setAdapter(pagerAdapter);

    }
}