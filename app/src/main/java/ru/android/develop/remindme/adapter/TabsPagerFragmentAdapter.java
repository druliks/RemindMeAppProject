package ru.android.develop.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.android.develop.remindme.fragment.ExampleFragment;

/**
 * Created by Druli on 09.06.2017.
 */

public class TabsPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs=new String[]{
                "Tab 1",
                "Напоминание",
                "Tab 2"
        };
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                return ExampleFragment.getInstance();
            case 1:
                return ExampleFragment.getInstance();
            default:
                return ExampleFragment.getInstance();
        }
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}
