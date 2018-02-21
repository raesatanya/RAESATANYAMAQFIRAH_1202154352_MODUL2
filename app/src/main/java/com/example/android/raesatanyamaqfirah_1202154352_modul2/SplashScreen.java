package com.example.android.raesatanyamaqfirah_1202154352_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends Activity {

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Toast.makeText(this, "RAESA TANYA MAQFIRAH_1202154352", Toast.LENGTH_SHORT).show(); //akan menampilkan pesan RAESA TANYA MAQFIRAH_1202154352
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MenuUtama.class));
                finish();
            }
        }, 5000L); //5000 L = 5 detik
    }
}
