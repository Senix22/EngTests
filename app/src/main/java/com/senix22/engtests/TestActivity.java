package com.senix22.engtests;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class TestActivity extends FragmentStatePagerAdapter {
    private List<Fragment> listFrag;
    public TestActivity(FragmentManager fm, List<Fragment>fragmentList) {
        super(fm);
        this.listFrag = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return listFrag.get(position);
    }

    @Override
    public int getCount() {
        return listFrag.size();
    }
}
