package baitap.ute.th_the_coffee_house.Dathang.Tab.DoAn;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import baitap.ute.th_the_coffee_house.Dathang.Tab.DoUong.DoUongAdapter;
import baitap.ute.th_the_coffee_house.Dathang.Tab.DoUong.ListDoUong;
import baitap.ute.th_the_coffee_house.R;


public class DoAnFragment  extends Fragment {


    Context context;
    RecyclerView gridcdoan;
    List<ListDoUong> listdoan;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root= inflater.inflate(R.layout.fragment_do_an, container, false);

        gridcdoan = root.findViewById(R.id.gridthucannhe);
        listdoan = new ArrayList<> ();

        listdoan.add(new ListDoUong (R.drawable.maccaphusocola,"Macca Phủ Socola","45.000đ"));
        listdoan.add(new ListDoUong (R.drawable.mitsay,"Mít Sấy","20.000đ"));
        listdoan.add(new ListDoUong (R.drawable.comchaychabong,"Cơm Cháy Chà Bông","35.000đ"));

        GridLayoutManager manager1 = new GridLayoutManager(DoAnFragment.this.getActivity(),2);
        manager1.setOrientation(GridLayoutManager.VERTICAL);
        gridcdoan.setLayoutManager(manager1);

        DoUongAdapter adaptor1 = new DoUongAdapter (DoAnFragment.this.getActivity(),listdoan);
        gridcdoan.setAdapter(adaptor1);

        return root;
    }
}