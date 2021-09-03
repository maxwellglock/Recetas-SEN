package sen.calfit.mobileapps.comsen.cat.com.activities;


import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Objects;

import sen.calfit.mobileapps.comsen.cat.com.R;
import sen.calfit.mobileapps.comsen.cat.com.adapters.PasosRecyclerViewAdapter2;
import sen.calfit.mobileapps.comsen.cat.com.domain.Recepta;

public class ReceptaActivity2 extends AppCompatActivity {
    private ImageView thumbnail;
    private TextView titolText;
    private TextView duracioText;
    private TextView descripcioText;
    private TextView valoracioText;
    private ReceptaBBDD2 receptaBBDD2 = ReceptaBBDD2.getInstance();
    private Recepta recepta;
    private TextView ingredientsText;
    private PasosRecyclerViewAdapter2 adapter;
    private RecyclerView recView;
    private RecyclerView.LayoutManager lm;
    private RatingBar ratingBar;
    private Button submitRating;
    private ImageButton shareButton;
    private static final String CHANNEL_ID = "123456";
    private static final int NOTIFICATION_ID = 1;
    private AdView mAdView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recepta2_layout);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        mAdView5 = findViewById(R.id.adView5);
        titolText = findViewById(R.id.textView_titol_recepta);
        duracioText = findViewById(R.id.textView_duracio_recepta);
        descripcioText = findViewById(R.id.textView_descripcio_recepta);
        thumbnail = findViewById(R.id.image_thumbnail_recepta);
        valoracioText = findViewById(R.id.textView_valoracio_recepta);
        ingredientsText = findViewById(R.id.textView_ingredients);
        ratingBar = findViewById(R.id.ratingBar);
        submitRating = findViewById(R.id.button_submit_valoracion);
        shareButton = findViewById(R.id.button_share);

        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView5.loadAd(adRequest);

        Intent intent = getIntent();
        int positionRecepta2 = intent.getIntExtra("position", 0);
        recepta = ReceptaBBDD2.getRecepta(positionRecepta2);

        Glide.with(this).load(recepta.getThumbnail()).into(thumbnail);
        titolText.setText(recepta.getTitle());
        duracioText.setText("Duración: "+recepta.getDuracioTotal()+" min.");
        descripcioText.setText(recepta.getDescripcio());
        valoracioText.setText(""+recepta.getValoracio()+"/5");

        // Set ingredients
        ArrayList<String> ingredients = recepta.getIngredients();
        String ingredientsString = ingredients.get(0);
        for(int i=1; i<ingredients.size(); i++){
            ingredientsString += "\n- "+ingredients.get(i);
        }
        ingredientsText.setText(ingredientsString);

        initPasos();

        initRating();

        createNotificationChannel();

        compartirReceta();
    }

    private void initPasos() {
        recView = findViewById(R.id.pasos_list);
        recView.setHasFixedSize(true);

        adapter = new PasosRecyclerViewAdapter2(recepta.getPassos(), this);
        recView.setAdapter(adapter);

        if(getResources().getConfiguration().orientation != Configuration.ORIENTATION_LANDSCAPE) {
            lm = new LinearLayoutManager(this);
        } else {
            lm = new GridLayoutManager(this, 2);
        }
        recView.setLayoutManager(lm);
    }

    private void initRating() {
        submitRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recepta.setValoracio(ratingBar.getRating());
                ratingBar.setEnabled(false);
            }
        });
    }

    private void compartirReceta() {
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentShare = new Intent(Intent.ACTION_SEND);
                intentShare.setType("text/plain");
                String shareBody = "Te quiero compartir la siguiente receta: \n" + recepta.getTitle()
                        +"\n\n ·"+recepta.getDescripcio()
                        +"\n\n ·Ingredientes: " + recepta.getIngredients()
                        + "\n\n · Descarga la app y mira la preparación: \n https://play.google.com/store/apps/details?id=sen.calfit.mobileapps.comsen.cat.com";
                intentShare.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intentShare, "Compartir usando"));
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Rvegan.class);
        startActivity(intent);
    }

    public void sendNotification(String message) {
        Intent intent= new Intent(this, Rvegan.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this, CHANNEL_ID);
        notificationBuilder.setSmallIcon(R.mipmap.ic_launcher2)
                .setContentText("Test Project")
                .setContentText(message)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build());
    }

    private void createNotificationChannel(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            String tag="Default";
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, tag, NotificationManager.IMPORTANCE_DEFAULT);

            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
    }

    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(this, Rvegan.class);
                startActivity(intent);
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


