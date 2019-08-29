package com.example.togglebutton;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageSwitcher;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
ImageSwitcher imageSwitcher;
MediaPlayer mediaPlayer;
ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton=findViewById(R.id.toggleButton);
        mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.music);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    mediaPlayer.start();
                }else {
                    mediaPlayer.pause();
                }
            }
        });
    }
}
