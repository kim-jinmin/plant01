package com.example.plant01.store;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class store_categoryadapter extends FragmentPagerAdapter {
    public store_categoryadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //프레그먼트 교체를 보여주는 처리를 구현한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0 :
                return store.newInstance();
            case 1 :
                return store_recommendgoods.newInstance();
            default :
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    // 상단의 탭 레이아웃 인디케이터 쪽에 텍스트를 선언해주는 곳
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0 :
                return "메인";
            case 1 :
                return "추천상품";
            default:
                return null;
        }
    }
}
