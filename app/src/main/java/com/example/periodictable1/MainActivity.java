package com.example.periodictable1;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MediaPlayer my_song;



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hideNavigationBar();

        my_song = MediaPlayer.create(MainActivity.this, R.raw.audio);
        my_song.setLooping(true);
        my_song.start();

        AudioManager audioManager = (AudioManager) getApplicationContext().getSystemService(this.AUDIO_SERVICE);

        Button buttonHydrogen = findViewById(R.id.button_hydrogen);
        buttonHydrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHydrogen();
            }
        });

        Button buttonHelium = findViewById(R.id.button_helium);
        buttonHelium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHelium();
            }
        });

        Button buttonLithium = findViewById(R.id.button_Lithium);
        buttonLithium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLithium();
            }
        });

        Button buttonBeryllium = findViewById(R.id.button_Beryllium);
        buttonBeryllium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toBeryllium();
            }
        });

        Button buttonBoron = findViewById(R.id.button_Boron);
        buttonBoron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toBoron();
            }
        });

        Button buttonCarbon = findViewById(R.id.button_Carbon);
        buttonCarbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCarbon();
            }
        });

        Button buttonNitrogen = findViewById(R.id.button_Nitrogen);
        buttonNitrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toNitrogen();
            }
        });

        Button buttonOxygen = findViewById(R.id.button_Oxygen);
        buttonOxygen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toOxygen();
            }
        });

        Button buttonFluorine = findViewById(R.id.button_Fluorine);
        buttonFluorine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toFluorine();
            }
        });

        Button buttonNeon = findViewById(R.id.button_Neon);
        buttonNeon	.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toNeon();
            }
        });

        Button buttonSodium = findViewById(R.id.button_Sodium);
        buttonSodium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSodium();
            }
        });

        Button buttonMagnesium = findViewById(R.id.button_Magnesium);
        buttonMagnesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMagnesium();
            }
        });

        Button buttonAluminum = findViewById(R.id.button_Aluminum);
        buttonAluminum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toAluminum();
            }
        });

        Button buttonSilicon = findViewById(R.id.button_Silicon);
        buttonSilicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSilicon();
            }
        });

        Button buttonPhosphorus = findViewById(R.id.button_Phosphorus);
        buttonPhosphorus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toPhosphorus();
            }
        });

        Button buttonSulfur = findViewById(R.id.button_Sulfur);
        buttonSulfur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSulfur();
            }
        });

        Button buttonChlorine = findViewById(R.id.button_Chlorine);
        buttonChlorine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toChlorine();
            }
        });

        Button buttonArgon = findViewById(R.id.button_Argon);
        buttonArgon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toArgon();
            }
        });

        ImageButton buttonMute = findViewById(R.id.imageButton_mute);
        buttonMute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audioManager.adjustVolume(AudioManager.ADJUST_TOGGLE_MUTE, AudioManager.FLAG_PLAY_SOUND);


                int icon;

                if (muted) {
                    muted = false;
                    icon = R.drawable.ic_mute;
                }
                else{
                    muted = true;
                    icon = R.drawable.ic_unmute;
                }
                buttonMute.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), icon));
            }
        });

        

    }

    private void toHydrogen(){
        Intent intent = new Intent(MainActivity.this , Hydrogen.class );
        startActivity(intent);
    }

    private void toHelium(){
        Intent intent = new Intent(MainActivity.this , Helium.class );
        startActivity(intent);
    }

    private void toLithium(){
        Intent intent = new Intent(MainActivity.this , Lithium.class );
        startActivity(intent);
    }

    private void toBeryllium(){
        Intent intent = new Intent(MainActivity.this , Beryllium.class );
        startActivity(intent);
    }

    private void toBoron(){
        Intent intent = new Intent(MainActivity.this , Boron.class );
        startActivity(intent);
    }

    private void toCarbon(){
        Intent intent = new Intent(MainActivity.this , Carbon.class );
        startActivity(intent);
    }

    private void toNitrogen(){
        Intent intent = new Intent(MainActivity.this , Nitrogen.class );
        startActivity(intent);
    }

    private void toOxygen(){
        Intent intent = new Intent(MainActivity.this , Oxygen.class );
        startActivity(intent);
    }

    private void toFluorine(){
        Intent intent = new Intent(MainActivity.this , Fluorine.class );
        startActivity(intent);
    }

    private void toNeon(){
        Intent intent = new Intent(MainActivity.this , Neon.class );
        startActivity(intent);
    }

    private void toSodium(){
        Intent intent = new Intent(MainActivity.this , Sodium.class );
        startActivity(intent);
    }

    private void toMagnesium(){
        Intent intent = new Intent(MainActivity.this , Magnesium.class );
        startActivity(intent);
    }

    private void toAluminum(){
        Intent intent = new Intent(MainActivity.this , Aluminum.class );
        startActivity(intent);
    }

    private void toSilicon(){
        Intent intent = new Intent(MainActivity.this , Silicon.class );
        startActivity(intent);
    }

    private void toPhosphorus(){
        Intent intent = new Intent(MainActivity.this , Phosphorus.class );
        startActivity(intent);
    }

    private void toSulfur(){
        Intent intent = new Intent(MainActivity.this , Sulfur.class );
        startActivity(intent);
    }

    private void toChlorine(){
        Intent intent = new Intent(MainActivity.this , Chlorine.class );
        startActivity(intent);
    }

    private void toArgon(){
        Intent intent = new Intent(MainActivity.this , Argon.class );
        startActivity(intent);
    }


    private boolean muted = false;

    private void hideNavigationBar() {
        this.getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_FULLSCREEN |
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|
                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN|
                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION|
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE);

    }

    protected void onStop(){
        super.onStop();
        //your code for stopping the sound
    }


}

