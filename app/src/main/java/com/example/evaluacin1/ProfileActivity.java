package com.example.evaluacin1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
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
