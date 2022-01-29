package com.example.loginneuromorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {
    private LinearLayout layout;
    private Animation animation_fadeIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Utils.blackIconStatusBar(LoginActivity.this, R.color.light_Background);
        layout = findViewById(R.id.layout_main);

        animation_fadeIn = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout.setVisibility(View.VISIBLE);
                layout.setAnimation(animation_fadeIn);
            }
        },1000);

    }
}