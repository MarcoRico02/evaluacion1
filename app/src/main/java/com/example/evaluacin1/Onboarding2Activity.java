package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Onboarding2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding2);
    }

    public void goNext(View v) {
        startActivity(new Intent(this, Onboarding3Activity.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void skip(View v) {
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }
}
