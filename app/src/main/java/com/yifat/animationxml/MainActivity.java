package com.yifat.animationxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewSun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewSun = (ImageView) findViewById(R.id.imageViewSun);
    }

    public void button_onClick(View view) {

        AnimationSet animationSet = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.animation_set);
        imageViewSun.startAnimation(animationSet);
    }
}
