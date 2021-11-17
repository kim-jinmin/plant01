package com.example.plant01.store;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.plant01.R;


public class store_recommendgoods extends Fragment {
    private View view;

    public static  store_recommendgoods newInstance(){
        store_recommendgoods storeRecommendgoods = new store_recommendgoods();
        return storeRecommendgoods;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.store_recommendgoods, container, false);

        return view;
    }
}
