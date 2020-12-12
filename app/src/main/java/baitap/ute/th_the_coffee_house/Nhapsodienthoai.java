package baitap.ute.th_the_coffee_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import baitap.ute.th_the_coffee_house.TinTuc.TinTucFragment;

public class Nhapsodienthoai extends AppCompatActivity {
    ImageView quaylai_126;
    EditText nhapsdt_126;
    Button btntieptuc_126,bqua_126;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_nhapsodienthoai );

        bqua_126 =(Button) findViewById ( R.id.boqua_126 );
        bqua_126.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                onpenTinTuc();
            }
        } );

        quaylai_126 = (ImageView) findViewById ( R.id.quaylai_126 );
        quaylai_126.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                openLogin ();
            }
        } );
        nhapsdt_126 = (EditText) findViewById ( R.id.nhapsdt_126 );
        btntieptuc_126 = (Button) findViewById ( R.id.btntieptuc_126 );
        btntieptuc_126.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                String str1 = nhapsdt_126.getText ().toString ();
                if (str1.length () == 0) {
                    Toast.makeText ( Nhapsodienthoai.this, "Bạn chưa điền. Mời nhập lại", Toast.LENGTH_LONG ).show ();
                } else if (str1.length () > 10) {
                    Toast.makeText ( Nhapsodienthoai.this, "Không được nhập trên 10 kí tự", Toast.LENGTH_LONG ).show ();
                } else {
                    Toast.makeText ( Nhapsodienthoai.this, "Tiếp tục", Toast.LENGTH_LONG ).show ();
                    openNhapMaXacThuc ();
                }
//
            }
        } );
    }

    private void onpenTinTuc() {
        Intent intent = new Intent ( this, TinTucFragment.class );
        startActivity ( intent );
        finish ();
    }

    public void openLogin() {
        Intent intent = new Intent ( this, Login.class );
        startActivity ( intent );
        finish ();
    }

    public void openNhapMaXacThuc() {
        Intent intent = new Intent ( this, Nhapmaxacthuc.class );
        startActivity ( intent );
        finish ();
    }
}
