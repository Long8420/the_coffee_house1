package baitap.ute.th_the_coffee_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import baitap.ute.th_the_coffee_house.TinTuc.TinTucFragment;

public class Login extends AppCompatActivity {
    EditText sdt_126;
    Button bqua_126;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sdt_126  = (EditText) findViewById(R.id.nhapsdt_126);
        sdt_126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNhapSoDienThoai();
            }
        });
    }


    public void openNhapSoDienThoai() {
        Intent intent = new Intent(this, Nhapsodienthoai.class);
        startActivity(intent);
        finish();
    }
}