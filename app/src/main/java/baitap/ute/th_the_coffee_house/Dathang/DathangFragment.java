package baitap.ute.th_the_coffee_house.Dathang;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import baitap.ute.th_the_coffee_house.Dathang.Adapter.SectionPagerAdapter;
import baitap.ute.th_the_coffee_house.Dathang.Tab.DoAn.DoAnFragment;
import baitap.ute.th_the_coffee_house.Dathang.Tab.DoUong.DoUongFragment;
import baitap.ute.th_the_coffee_house.Dathang.Tab.PhoBien.PhoBienFragment;
import baitap.ute.th_the_coffee_house.R;


public class DathangFragment extends Fragment {
    private TabLayout tabLayout_126;
    View root_126;
    ViewPager viewPager_126;


    public DathangFragment() {
        // Required empty public constructor
    }

    public static DathangFragment getInstance() {
        return new DathangFragment ();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       root_126 = inflater.inflate(R.layout.fragment_dathang, container, false);
        viewPager_126 = root_126.findViewById(R.id.viewpager);
        tabLayout_126 = root_126.findViewById(R.id.tablayout);
        return root_126;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setUpViewPager(viewPager_126);
        tabLayout_126.setupWithViewPager(viewPager_126);
        tabLayout_126.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    private void setUpViewPager(ViewPager viewPager) {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getChildFragmentManager());

        adapter.addFragment(new PhoBienFragment (), "Phổ biến");
        adapter.addFragment(new DoUongFragment (), "Thức uống");
        adapter.addFragment(new DoAnFragment (), "Đồ ăn");
        viewPager.setAdapter(adapter);
    }

}