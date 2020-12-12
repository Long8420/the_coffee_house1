package baitap.ute.th_the_coffee_house.Dathang.Tab.DoUong;

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

import baitap.ute.th_the_coffee_house.R;


public class DoUongFragment extends Fragment {

    Context context;
    RecyclerView gridcaphe,gridthucuongdaxay,gridtratraicay,gridmacchiato,gridchoco;
    List<ListDoUong> listcaphe,listthucuongdaxay,listtratraicay,listmacchiato,listchoco;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreateView(inflater, container, savedInstanceState);
        context=getActivity();
        View root= inflater.inflate(R.layout.fragment_do_uong, container, false);

        //Cà phê
        gridcaphe = root.findViewById(R.id.gridcaphe);
        listcaphe = new ArrayList<> ();

        listcaphe.add(new ListDoUong (R.drawable.caphesuada,"Cà phê sữa đá","32.000đ"));
        listcaphe.add(new ListDoUong (R.drawable.bacxiu,"Bạc xỉu","32.000đ"));
        listcaphe.add(new ListDoUong (R.drawable.caphedaxaylanh,"Cà phê đá xay-lạnh","59.000đ"));
        listcaphe.add(new ListDoUong (R.drawable.latteda,"Latte đá","50.000đ"));
        listcaphe.add(new ListDoUong (R.drawable.coldbrewtt,"Cold Brew truyền thống","45.000đ"));
        listcaphe.add(new ListDoUong (R.drawable.coldbrewst,"Cold Brew sữa tươi","45.000đ"));

        GridLayoutManager manager1 = new GridLayoutManager(DoUongFragment.this.getActivity(),2);
        manager1.setOrientation(GridLayoutManager.VERTICAL);
        gridcaphe.setLayoutManager(manager1);

        DoUongAdapter adaptor1 = new DoUongAdapter (DoUongFragment.this.getActivity(),listcaphe);
        gridcaphe.setAdapter(adaptor1);
        registerForContextMenu(gridcaphe);


        //Thức uống đá xay
        gridthucuongdaxay = root.findViewById(R.id.gridthucuongdaxay);
        listthucuongdaxay = new ArrayList<>();

        listthucuongdaxay.add(new ListDoUong (R.drawable.phucbontudx,"Phúc bồn tử cam đá xay","59.000đ"));
        listthucuongdaxay.add(new ListDoUong (R.drawable.caphedaxaylanh,"Cà phê đá xay - lạnh","59.000đ"));
        listthucuongdaxay.add(new ListDoUong (R.drawable.cookiedaxay,"Cookie đá xay","59.000đ"));
        listthucuongdaxay.add(new ListDoUong (R.drawable.daovietquatdx,"Đào việt quất đá xay","59.000đ"));
        listthucuongdaxay.add(new ListDoUong (R.drawable.chocolatedx,"Chocolate đá xay","59.000đ"));
        listthucuongdaxay.add(new ListDoUong (R.drawable.matchadx,"MatCha đá xay","59.000đ"));
        listthucuongdaxay.add(new ListDoUong (R.drawable.chanhxadx,"Chanh sả đá xay","49.000đ"));

        GridLayoutManager manager2 = new GridLayoutManager(DoUongFragment.this.getActivity(),2);
        manager2.setOrientation(GridLayoutManager.VERTICAL);
        gridthucuongdaxay.setLayoutManager(manager2);

        DoUongAdapter adaptor2 = new DoUongAdapter (DoUongFragment.this.getActivity(),listthucuongdaxay);
        gridthucuongdaxay.setAdapter(adaptor2);

        // Trà  trái cây
        gridtratraicay = root.findViewById(R.id.gridtratraicay);
        listtratraicay = new ArrayList<>();

        listtratraicay.add(new ListDoUong (R.drawable.phucbontudx,"Trà phúc bồn tử","50.000đ"));
        listtratraicay.add(new ListDoUong (R.drawable.tradaocamsada,"Trà đào cam sả - đá","45.000đ"));
        listtratraicay.add(new ListDoUong (R.drawable.trasuamaccatranchautrang,"Trà bưởi mật ong","50.000đ"));
        listtratraicay.add(new ListDoUong (R.drawable.olonghatsenda,"Olong hạt sen - nóng","52.000đ"));
        listtratraicay.add(new ListDoUong (R.drawable.tradaocamsada,"Trà đào cam sả - nóng","52.000đ"));
        listtratraicay.add(new ListDoUong (R.drawable.olonghatsenda,"Olong hạt sen - đá","45.000đ"));


        GridLayoutManager manager3 = new GridLayoutManager(DoUongFragment.this.getActivity(),2);
        manager3.setOrientation(GridLayoutManager.VERTICAL);
        gridtratraicay.setLayoutManager(manager3);

        DoUongAdapter adaptor3 = new DoUongAdapter (DoUongFragment.this.getActivity(),listtratraicay);
        gridtratraicay.setAdapter(adaptor3);

        //Macchiato
        gridmacchiato = root.findViewById(R.id.gridmacchiato);
        listmacchiato = new ArrayList<>();

        listmacchiato.add(new ListDoUong (R.drawable.trasuamaccatranchautrang,"Trà sữa mắc ca trân châu trắng","45.000đ"));
        listmacchiato.add(new ListDoUong (R.drawable.tradaocamsada,"Trà đen macchiato","42.000đ"));
        listmacchiato.add(new ListDoUong (R.drawable.matchadx,"Matcha Macchiato","45.000đ"));
        listmacchiato.add(new ListDoUong (R.drawable.tradaocamsada,"Trà xoài Macchiato đá","50.000đ"));
        listmacchiato.add(new ListDoUong (R.drawable.trasuamaccatranchautrang,"Trà lài Macchiato - lạnh","42.000đ"));
        listmacchiato.add(new ListDoUong (R.drawable.bacxiu,"Trà sữa khoai môn","42.000đ"));

        GridLayoutManager manager4 = new GridLayoutManager(DoUongFragment.this.getActivity(),2);
        manager4.setOrientation(GridLayoutManager.VERTICAL);
        gridmacchiato.setLayoutManager(manager4);

       DoUongAdapter adaptor4 = new DoUongAdapter (DoUongFragment.this.getActivity(),listmacchiato);
        gridmacchiato.setAdapter(adaptor4);

        //Choco - Matcha
        gridchoco = root.findViewById(R.id.gridchocomactcha);
        listchoco = new ArrayList<>();

        listchoco.add(new ListDoUong (R.drawable.socolaluamachda,"Socola lúa mạch đá xay","69.000đ"));
        listchoco.add(new ListDoUong (R.drawable.socolaluamachnong,"Socola lúa mạch nóng","69.000đ"));
        listchoco.add(new ListDoUong (R.drawable.chanhxadx,"Trà Matcha Latte nóng","59.000đ"));
        listchoco.add(new ListDoUong (R.drawable.matchadx,"Trà Matcha Latte đá","59.000đ"));
        listchoco.add(new ListDoUong (R.drawable.socolaluamachda,"Socola đá","59.000đ"));


        GridLayoutManager manager5 = new GridLayoutManager(DoUongFragment.this.getActivity(),2);
        manager5.setOrientation(GridLayoutManager.VERTICAL);
        gridchoco.setLayoutManager(manager5);

        DoUongAdapter adaptor5 = new DoUongAdapter (DoUongFragment.this.getActivity(),listchoco);
        gridchoco.setAdapter(adaptor5);

        return root;
    }


}