package com.example.guest.alphagrid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] letters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().split("");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/Bitter-BoldItalic.otf");

        gridView = (GridView) findViewById(R.id.baseGridView);
        gridView.setAdapter(new AlphabetAdapter(this, letters));
    }
}
