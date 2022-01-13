package simple.example.fashionpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton btnGamis,btnHijab,btnMukenah;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnGamis = findViewById(R.id.btn_buka_merek_gamis);
        btnHijab = findViewById(R.id.btn_buka_merek_hijab);
        btnMukenah = findViewById(R.id.btn_buka_merek_mukenah);

        btnGamis.setOnClickListener(view -> bukaGaleri("Gamis"));
        btnHijab.setOnClickListener(view -> bukaGaleri("Hijab"));
        btnMukenah.setOnClickListener(view -> bukaGaleri("Mukenah"));
    }

    private void bukaGaleri(String jenisFashion) {
        Log.d("MAIN","Buka activity fashon");
        Intent intent = new Intent(this, DaftarFashionActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisFashion);
        startActivity(intent);
    }
    public void MyProfile(View view) {
        Intent intent = new Intent(MainActivity.this, MyProfile.class);
        startActivity(intent);
    }

}