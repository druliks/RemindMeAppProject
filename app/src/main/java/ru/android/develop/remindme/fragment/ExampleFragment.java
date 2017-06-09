package ru.android.develop.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ru.android.develop.remindme.R;

/**
 * Created by Druli on 09.06.2017.
 */

public class ExampleFragment extends Fragment {

    private View rootView;

    public static ExampleFragment getInstance(){
        Bundle args=new Bundle();
        ExampleFragment exampleFragment=new ExampleFragment();
        exampleFragment.setArguments(args);
        return  exampleFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.fragment_example,container,false);

        return rootView;
    }
}
