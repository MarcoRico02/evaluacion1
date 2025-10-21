package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tvWelcome = findViewById(R.id.tvWelcome);

        // Recibir usuario del login
        String user = getIntent().getStringExtra("USERNAME");
        tvWelcome.setText("¡Bienvenido, " + user + "!");
    }

    // Ir al dashboard/perfil
    public void goToProfile(View v) {
        startActivity(new Intent(this, ProfileActivity.class));
        finish();
    }
}
