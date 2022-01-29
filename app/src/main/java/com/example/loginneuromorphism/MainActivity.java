package com.example.loginneuromorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView img_logo, img_bottom;
    private TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Utils.blackIconStatusBar(MainActivity.this, R.color.light_Background);
        img_logo = findViewById(R.id.img_logo);
        img_bottom = findViewById(R.id.img_bottom);
        title = findViewById(R.id.title);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,
                        Pair.create(img_logo, "logo"),
                        Pair.create(img_bottom, "bottom_logo"),
                        Pair.create(title, "title"));
                startActivity(intent, options.toBundle());
            }
        }, 3000);

    }
}