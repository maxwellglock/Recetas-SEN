package sen.calfit.mobileapps.comsen.cat.com.activities;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.Objects;

import sen.calfit.mobileapps.comsen.cat.com.R;
import sen.calfit.mobileapps.comsen.cat.com.adapters.ReceptesRecyclerViewAdapter3;

public class Rpostres extends AppCompatActivity {
    private ReceptaBBDD3 receptaBBDD3 = ReceptaBBDD3.getInstance();
    private ReceptesRecyclerViewAdapter3 adapter;
    private RecyclerView recView;
    private RecyclerView.LayoutManager lm;
    private TextView title;
    private AdView mAdView3;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpostres);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        title = findViewById(R.id.textView_titol);
        mAdView3 = findViewById(R.id.adView3);
        recView = findViewById(R.id.data_list3);
        recView.setHasFixedSize(true);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView3.loadAd(adRequest);

        adapter = new ReceptesRecyclerViewAdapter3(receptaBBDD3, this);
        recView.setAdapter(adapter);

        if (getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE) {
            lm = new LinearLayoutManager(this);
        } else {
            lm = new GridLayoutManager(this, 2);
        }
        recView.setLayoutManager(lm);

        recView.setClickable(true);



    }


    public void viewRecepta (int position) {
        Intent intent = new Intent(this, ReceptaActivity3.class);
        intent.putExtra("position", position);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
            finish();
            return true;
    }
    int id = item.getItemId();
    if (id == R.id.Masapps) {
        Intent e = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=4669107337991770253"));
        startActivity(e);
    } else if (id == R.id.CalificarItem){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getPackageName()));
        startActivity(i);
    } else if (id == R.id.Compartirapp) {
        Intent intentShare = new Intent(Intent.ACTION_SEND);
        intentShare.setType("text/plain");
        String shareBody = "Te quiero compartir la siguiente App de Recetas saludables, veganas y fitness: \n https://play.google.com/store/apps/details?id=sen.calfit.mobileapps.comsen.cat.com";
        intentShare.putExtra(Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(intentShare, "Compartir usando"));
    }
    return super.onOptionsItemSelected(item);
  }
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
