package baitap.ute.th_the_coffee_house.TinTuc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

//import baitap.ute.th_the_coffee_house.Category.CategoryAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import baitap.ute.th_the_coffee_house.Category.Category;
import baitap.ute.th_the_coffee_house.Category.CategoryAdapter;
import baitap.ute.th_the_coffee_house.Category.uudai;
import baitap.ute.th_the_coffee_house.Coupon;
import baitap.ute.th_the_coffee_house.Dathang.DathangFragment;
import baitap.ute.th_the_coffee_house.Login;
import baitap.ute.th_the_coffee_house.R;
import baitap.ute.th_the_coffee_house.Reward;
import baitap.ute.th_the_coffee_house.TaiKhoan.MyaccountFragment;
import baitap.ute.th_the_coffee_house.Thongbaochuong;
import baitap.ute.th_the_coffee_house.Tichdiem;


public class TinTucFragment extends Fragment {
    private ViewPager viewPager;
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    ViewFlipper viewFlipper;
    LinearLayout tichdiem_126;
    LinearLayout dathang_126;
    LinearLayout coupon_126;
    LinearLayout rewards_126;
    Context context;
    private View root;

    @SuppressLint("WrongViewCast")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView ( inflater, container, savedInstanceState );
        context = getActivity ();
        root = inflater.inflate ( R.layout.fragment_tin_tuc, container, false );


        //chuyển trang thông báo
        ImageView thongbao = (ImageView)root.findViewById(R.id.chuongthongbao);
        thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDiaChi();
            }
        });

//        });
//

        rcvCategory = root.findViewById ( R.id.rcv_category );
        categoryAdapter = new CategoryAdapter(TinTucFragment.this.getActivity ());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(TinTucFragment.this.getActivity (), RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData ( getListCategory () );
        rcvCategory.setAdapter(categoryAdapter);
//
        dathang_126 = (LinearLayout) root.findViewById ( R.id.lldathang_126 );
        dathang_126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendathang();
            }
        });
//
        tichdiem_126 = (LinearLayout)root.findViewById(R.id.lltichdiem_126);
        tichdiem_126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentichdiem();
            }
        });
        coupon_126 = (LinearLayout) root.findViewById ( R.id.llcoupon_126 );
        coupon_126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencoupon();
            }
        });
////
        rewards_126 = (LinearLayout) root.findViewById ( R.id.rewards_126 );
        rewards_126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opencrewards();
            }
        });

        return root;
    }

    private void opencrewards() {
        Intent intent=new Intent(TinTucFragment.this.getActivity(), Reward.class);
        startActivity(intent);
    }

    private void opencoupon() {
        Intent intent=new Intent(TinTucFragment.this.getActivity(), Coupon.class);
        startActivity(intent);
    }

    private void opendathang() {
        Intent intent=new Intent(TinTucFragment.this.getActivity(), DathangFragment.class);
        startActivity(intent);
    }

    private void opentichdiem() {
        Intent intent=new Intent(TinTucFragment.this.getActivity(), Tichdiem.class);
        startActivity(intent);
    }


    private List<Category> getListCategory(){
        List<Category> listCategory = new ArrayList<> ();
        List<uudai> listUuDai = new ArrayList<>();
        List<uudai> listUuDai1 = new ArrayList<>();
        List<uudai> listUuDai2 = new ArrayList<>();
        listUuDai.add(new uudai(R.drawable.anh1, "Giảm 50% thèm gì gọi nhé Nhà mang tới liền\n" +
                "    Hòa vào không khí siêu sale cuối năm, mời team nghỉ tay gọi món..."));
        listUuDai.add(new uudai(R.drawable.anh1_1, "Nhà mời cà phê đậm đà, chỉ 12K\n" + " Tuần mới chỉ thật sự hứng khởi khi có 1 tách cafe"));
        listUuDai.add(new uudai(R.drawable.anh1_2, "Nhà mời 20%, PICKUP nha" +
                "Trải nghiệm ngay tính năng với nhiều ưu đãi" ));
        listUuDai.add(new uudai(R.drawable.anh1_3, "Bánh ngon Nhà mời, chỉ 19.000d!" +
                "Cuối năm bận rộn thi cử, chạy số, chiến" +"dealline...."));
        listUuDai1.add(new uudai(R.drawable.anh2, "Nhà Reverisde Vũ Tông Phan - Hà Nội vui khai trương...\n" +
                "Người ta dậy thì thành công còn chúng mình dậy thì nhớ mang chiếc áo đủ ấm ..."));
        listUuDai1.add(new uudai(R.drawable.anh2_1, "Taste of Xmas - Chạm vị Giáng sinh .\n"+
                "Năm nay tại Nhà vị Giáng Sinh mà bạn yêu thích" ));
        listUuDai1.add(new uudai(R.drawable.anh2_2, "Trời se lạnh, thưởng thức ngay những món nóng của nhà....\n" +
                "Chớm đầu Đông, những cơn mưa bất chợt làm trời se lạnh..... "));
        listUuDai1.add(new uudai(R.drawable.anh2_3, "Khám phá không gian nhà mới"+
                "Mô hình thiest kế mới tại Nhà mang đến không khí vui nhộn....."));
        listUuDai2.add(new uudai(R.drawable.anh3, "Bản Sắc Nơi Đất Trồng\n" +
                "Cùng Nhà bắt đầu hành trình đầu tiên cùng Travel blogger..."));
        listUuDai2.add(new uudai(R.drawable.anh3_3, "Hương vị Cà Phê mới tại Nhà Signature."+
                "Nhà Signauter - nơi những hương vị nguyên bản tạo nên trải nghiệm mới..."));
        listUuDai2.add(new uudai(R.drawable.anh3_1, "Cảm ơn bạn, vì đã luôn là 1 nguyên bản....." +
                "Tạo khác biệt từ chất nguyên bản Thước phim." ));
        listUuDai2.add(new uudai(R.drawable.anh3, "Bản Sắc Nơi Đất Trồng\n" +
                "Cùng Nhà bắt đầu hành trình đầu tiên cùng Travel blogger..."));
        listCategory.add(new Category("Ưu Đãi Đặc Biệt", listUuDai));
        listCategory.add(new Category("Cập Nhập Từ Nhà", listUuDai1));
        listCategory.add(new Category("CoffeeLover", listUuDai2));
        return listCategory;
    }

    private void openDiaChi() {
    }
//    public void flipperImages(int image){
//        ImageView imageView = new ImageView(this);
//        imageView.setBackgroundResource(image);
//
//        viewFlipper.addView(imageView);
//        viewFlipper.setFlipInterval(4000);
//        viewFlipper.setAutoStart(true);
//        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
//        viewFlipper.setInAnimation(this, android.R.anim.slide_out_right);
//
//    }
}