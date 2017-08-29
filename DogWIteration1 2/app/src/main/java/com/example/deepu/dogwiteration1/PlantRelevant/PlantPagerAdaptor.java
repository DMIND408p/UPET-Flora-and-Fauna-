package com.example.deepu.dogwiteration1.PlantRelevant;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by qingyunhe on 20/08/2017.
 */

public class PlantPagerAdaptor extends FragmentPagerAdapter {
    int mNumOfTabs;
    HouseToxicTabFragment houseToxicTabFragment;
    WildToxicPlantTabFragment wildToxicPlantTabFragment;
    NonToxicPlantTabFragment nonToxicPlantTabFragment;

    public PlantPagerAdaptor(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                houseToxicTabFragment = new HouseToxicTabFragment();
                return houseToxicTabFragment;
            case 1:
                nonToxicPlantTabFragment = new NonToxicPlantTabFragment();
                return nonToxicPlantTabFragment;
            case 2:
                wildToxicPlantTabFragment = new WildToxicPlantTabFragment();
                return wildToxicPlantTabFragment;
            default:
                return null;
        }
    }

//    @Override
//    public Object instantiateItem(ViewGroup container, int position) {
//        Fragment createdFragment = (Fragment) super.instantiateItem(container, position);
//        // save the appropriate reference depending on position
//        switch (position) {
//            case 0:
//                houseToxicTabFragment = (HouseToxicTabFragment) createdFragment;
//                break;
//            case 1:
//                nonToxicPlantTabFragment = (NonToxicPlantTabFragment) createdFragment;
//                break;
//            case 2:
//                wildToxicPlantTabFragment = (WildToxicPlantTabFragment) createdFragment;
//                break;
//        }
//        return createdFragment;
//    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    public HouseToxicTabFragment getHouseToxicTabFragment() {
        return houseToxicTabFragment;
    }

    public void setHouseToxicTabFragment(HouseToxicTabFragment houseToxicTabFragment) {
        this.houseToxicTabFragment = houseToxicTabFragment;
    }

    public WildToxicPlantTabFragment getWildToxicPlantTabFragment() {
        return wildToxicPlantTabFragment;
    }

    public void setWildToxicPlantTabFragment(WildToxicPlantTabFragment wildToxicPlantTabFragment) {
        this.wildToxicPlantTabFragment = wildToxicPlantTabFragment;
    }

    public NonToxicPlantTabFragment getNonToxicPlantTabFragment() {
        return nonToxicPlantTabFragment;
    }

    public void setNonToxicPlantTabFragment(NonToxicPlantTabFragment nonToxicPlantTabFragment) {
        this.nonToxicPlantTabFragment = nonToxicPlantTabFragment;
    }


}
