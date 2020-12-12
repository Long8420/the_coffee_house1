package baitap.ute.th_the_coffee_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Nhapmaxacthuc extends AppCompatActivity {
    ImageView quaylai_126;
    EditText nhapma_126;
    Button btnmaxacthuc_126;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_nhapmaxacthuc );
        //1. Nút quay lại
        ImageView quaylai2_nhapsodienthoai_118 = (ImageView) findViewById ( R.id.quaylai_126 );
        quaylai2_nhapsodienthoai_118.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai ();
            }
        } );
        //2. Nút button
        nhapma_126 = (EditText) findViewById ( R.id.nhapma_126 );
        btnmaxacthuc_126 = (Button) findViewById ( R.id.btntieptuc_126 );
        btnmaxacthuc_126.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String str2 = nhapma_126.getText ().toString ();
                if (str2.length () == 0) {
                    Toast.makeText ( Nhapmaxacthuc.this, "Bạn chưa điền. Mời nhập lại", Toast.LENGTH_LONG ).show ();
                } else {
                    Toast.makeText ( Nhapmaxacthuc.this, "Tiếp tục", Toast.LENGTH_LONG ).show ();
                    openMainActivity ();
                }
            }
        } );

    }

    //1.
    public void openNhapSoDienThoai() {
        Intent intent = new Intent ( this, Nhapsodienthoai.class );
        startActivity ( intent );
        finish ();
    }

    //2.
    public void openMainActivity() {
        Intent intent = new Intent ( this, MainActivity.class );
        startActivity ( intent );
        finish ();
    }
}
