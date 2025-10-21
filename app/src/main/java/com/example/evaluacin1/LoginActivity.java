package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;

    // Credenciales hardcodeadas
    private final String CORREO = "alumno@uabc.edu";
    private final String PASSWORD = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
    }

    // Validación de login
    public void login(View v) {
        String user = etUsername.getText().toString();
        String pass = etPassword.getText().toString();

        if(user.equals(CORREO) && pass.equals(PASSWORD)) {
            // Login correcto → pantalla de bienvenida
            Intent intent = new Intent(this, WelcomeActivity.class);
            intent.putExtra("USERNAME", user);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }

    // Abrir navegador para "Crear nueva cuenta"
    public void createAccount(View v) {
        String url = "https://www.google.com";
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(i);
    }
}
