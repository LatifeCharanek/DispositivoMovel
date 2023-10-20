package br.com.ecommerce2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import br.com.ecommerce2.MainActivity;
import br.com.ecommerce2.R;

public class SplashActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler(getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
            }
        }, 3000);
    }

}