package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding3);
    }

    // Ir al login
    public void goToLogin(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
