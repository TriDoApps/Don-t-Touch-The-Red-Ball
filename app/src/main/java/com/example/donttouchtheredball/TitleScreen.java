package com.example.donttouchtheredball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Title screen for Don't Touch The Red Ball.
 */
public class TitleScreen extends AppCompatActivity {

    private static final String TAG = "DTTRB:Title";

    /**
     * Run when this activity comes to the foreground.
     *
     * @param savedInstanceState unused
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        Log.d(TAG, "Entering title screen");

        final Button play = findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Clicked Play");
                Intent intent = new Intent(TitleScreen.this, DontTouchTheRedBall.class);
                startActivity(intent);
            }
        });

        final Button controls = findViewById(R.id.controls);

        controls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Clicked How To Play");
                Intent intent = new Intent(TitleScreen.this, Controls.class);
                startActivity(intent);
            }
        });
    }


}
