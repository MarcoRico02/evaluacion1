package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvUsername, tvGamesPlayed, tvFavoriteGame, tvAchievements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Referencias
        tvUsername = findViewById(R.id.tvUsername);
        tvGamesPlayed = findViewById(R.id.tvGamesPlayed);
        tvFavoriteGame = findViewById(R.id.tvFavoriteGame);
        tvAchievements = findViewById(R.id.tvAchievements);

        // Datos hardcodeados
        String username = getIntent().getStringExtra("USERNAME");
        if(username == null) username = "Alumno";
        tvUsername.setText("Usuario: " + username);
        tvGamesPlayed.setText("Juegos jugados: 12");
        tvFavoriteGame.setText("Juego favorito: Celeste");
        tvAchievements.setText("Logros desbloqueados: 5/10");
    }

    // Abrir cámara
    public void openCamera(View v) {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }

    // Abrir página web
    public void openWeb(View v) {
        String url = "https://www.indiegames.com";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    // Obtener ubicación (abre Google Maps)
    public void openLocation(View v) {
        String geoUri = "geo:0,0?q=Indie+Games";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(geoUri));
        startActivity(intent);
    }

    // Compartir texto
    public void shareText(View v) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Estoy jugando IndieVerse, ¡únete!");
        startActivity(Intent.createChooser(intent, "Compartir con"));
    }

    // Cerrar sesión → volver al login
    public void logout(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
