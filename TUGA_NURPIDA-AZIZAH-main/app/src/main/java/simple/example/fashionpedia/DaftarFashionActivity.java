package simple.example.fashionpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.BreakIterator;
import java.util.List;

import simple.example.fashionpedia.model.Fashion;
import simple.example.fashionpedia.model.Gamis;
import simple.example.fashionpedia.model.Hijab;
import simple.example.fashionpedia.model.Mukenah;

public class DaftarFashionActivity extends AppCompatActivity {
    public final static String FASHION_TERPILIH ="fashion_obj_key";
    List<Fashion> fashions;
    ListView listView;
    String modelfashion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_fashion);
        Intent intent = getIntent();
       modelfashion = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
       fashions = DataProvider.getFashionsByTipe(this, modelfashion);
        TextView txModelkList = findViewById(R.id.text_title_daftar);
        String judul="";
        if (fashions.get(0) instanceof Gamis) {
            judul = getString(R.string.daftar_model_gamis);
        } else if (fashions.get(0) instanceof Hijab) {
            judul = getString(R.string.daftar_model_hijab);
        } else if (fashions.get(0) instanceof Mukenah) {
            judul = getString(R.string.daftar_model_mukenah);
        }

        txModelkList.setText(judul);
        setupListView();
    }


    private void setupListView() {
        listView = findViewById(R.id.listview_daftar_fashion);
        DaftarFashionAdapter adapter = new DaftarFashionAdapter(this,fashions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Fashion terpilih = fashions.get(position);
            bukaProfileFashion(terpilih);
        }
    };

    private void bukaProfileFashion(Fashion fashionTerpilih) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this,ProfilActivity.class);
        intent.putExtra(FASHION_TERPILIH, fashionTerpilih);
        startActivity(intent);
    }


}