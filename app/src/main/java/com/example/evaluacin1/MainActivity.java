package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Primera pantalla de Onboarding
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Avanzar a la segunda pantalla
    public void goNext(View v) {
        startActivity(new Intent(this, Onboarding2Activity.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    // Saltar al login directamente
    public void skip(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
