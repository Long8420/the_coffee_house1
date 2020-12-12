package baitap.ute.th_the_coffee_house;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class Splash_screen extends AppCompatActivity {
    private static  int SPLASH_SCREEN = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);



        new Handler ().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_screen.this, Login.class);
                startActivity(intent);
                finish();

            }
        },SPLASH_SCREEN);
    }
}