package com.example.donttouchtheredball;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

/**
 * Logo screen for Don't Touch The Red Ball.
 */
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DTTRB:Main";

    /**
     * Run when this activity comes to the foreground.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "Opened app Don't Touch The Red Ball");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, TitleScreen.class);

                startActivity(intent);

                finish();
            }
        }, 5000);
    }
}
