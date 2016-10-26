package com.wen.canna.nosedive;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class RatingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
    }

    public void oneStarSelected(View view) {
        MediaPlayer.create(this, R.raw.nosedive_1_star).start();
    }

    public void twoStarsSelected(View view) {
        MediaPlayer.create(this, R.raw.nosedive_2_stars).start();
    }

    public void threeStarsSelected(View view) {
        MediaPlayer.create(this, R.raw.nosedive_3_stars).start();
    }

    public void fourStarsSelected(View view) {
        MediaPlayer.create(this, R.raw.nosedive_4_stars).start();
    }

    public void fiveStarsSelected(View view) {
        MediaPlayer.create(this, R.raw.nosedive_5_stars).start();
    }
}
