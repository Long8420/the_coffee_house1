package baitap.ute.th_the_coffee_house.TaiKhoan;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import baitap.ute.th_the_coffee_house.Adapter;
import baitap.ute.th_the_coffee_house.Contact;
import baitap.ute.th_the_coffee_house.Login;
import baitap.ute.th_the_coffee_house.Nhapmaxacthuc;
import baitap.ute.th_the_coffee_house.Nhapsodienthoai;
import baitap.ute.th_the_coffee_house.R;
import baitap.ute.th_the_coffee_house.TaiKhoan.listtaikhoan.CaiDatActivity;
import baitap.ute.th_the_coffee_house.TaiKhoan.listtaikhoan.GiupdoActivity;
import baitap.ute.th_the_coffee_house.TaiKhoan.listtaikhoan.LichsudonhangActivity;
import baitap.ute.th_the_coffee_house.TaiKhoan.listtaikhoan.ThongtincanhanActivity;
import baitap.ute.th_the_coffee_house.TaiKhoan.listtaikhoan.ThongtinthanhvienActivity;


public class MyaccountFragment extends Fragment {
    private ListView lvContact;
    private TabLayout tablayout;
    private ViewPager viewPaper;
    Context context;

    //    private ViewPaperAdapter_thanhvien adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context = getActivity ();
        View root = inflater.inflate ( R.layout.fragment_myaccount, container, false );
        Button btn = (Button) root.findViewById ( R.id.btn_logout_126 );
        btn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                openLogout ();
            }
        } );
        lvContact = (ListView) root.findViewById(R.id.lv_profile);
        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(MyaccountFragment.this.getActivity (), ThongtinthanhvienActivity.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent(MyaccountFragment.this.getActivity (), ThongtincanhanActivity.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent(MyaccountFragment.this.getActivity (), Nhapmaxacthuc.class);
                    startActivity(intent);
                }
                if(position==3){
                    Intent intent = new Intent(MyaccountFragment.this.getActivity (), LichsudonhangActivity.class);
                    startActivity(intent);
                }
                if(position==4){
                    Intent intent = new Intent(MyaccountFragment.this.getActivity (), GiupdoActivity.class);
                    startActivity(intent);
                }
                if(position==5){
                    Intent intent = new Intent(MyaccountFragment.this.getActivity (), CaiDatActivity.class);
                    startActivity(intent);
                }
            }
        });
        ArrayList<Contact> arrayList = new ArrayList<Contact>();

        Contact contact1 = new Contact(R.drawable.best, "The Coffee House Rewards");
        Contact contact2 = new Contact(R.drawable.user, "Thông Tin Tài Khoản");
        Contact contact3 = new Contact(R.drawable.music, "Nhạc đang phát");
        Contact contact4 = new Contact(R.drawable.scroll, "Lịch sử");
        Contact contact5 = new Contact(R.drawable.question, "Giúp đỡ");
        Contact contact6 = new Contact(R.drawable.setting, "Cài đặt");

        arrayList.add(contact1);
        arrayList.add(contact2);
        arrayList.add(contact3);
        arrayList.add(contact4);
        arrayList.add(contact5);
        arrayList.add(contact6);

        Adapter customAdapter = new Adapter(MyaccountFragment.this.getActivity (), R.layout.row_item, arrayList);
        lvContact.setAdapter(customAdapter);
        return root;
    }

    private void openLogout() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder ( MyaccountFragment.this.getActivity () );
        alertDialogBuilder.setMessage ( "Bạn có muốn đăng xuất?" );
        alertDialogBuilder.setPositiveButton ( "Có", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent ( MyaccountFragment.this.getActivity (), Login.class );
                startActivity ( intent );
            }
        } );
        alertDialogBuilder.setNegativeButton ( "Không", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        } );
        alertDialogBuilder.show ();
    }

}

