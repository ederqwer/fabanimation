package com.example.ederqwer.myapplication;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public class MainActivity extends AppCompatActivity {
    boolean click = false;
    FloatingActionButton fab1;
    FloatingActionButton fab2;
    FloatingActionButton fab3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab1 = findViewById(R.id.fawater);
        fab2 = findViewById(R.id.faapple);
        fab3 = findViewById(R.id.farun);

        fab1.setScaleX(0);
        fab1.setScaleY(0);

        fab2.setScaleX(0);
        fab2.setScaleY(0);

        fab3.setScaleX(0);
        fab3.setScaleY(0);

    }

    public void menu_action(View v){
        click=!click;
        Interpolator interpolator = AnimationUtils.loadInterpolator(getBaseContext(),
                android.R.interpolator.fast_out_slow_in);
        v.animate()
                .rotation(click?45f:0)
                .setInterpolator(interpolator)
                .start();


        fab1.animate()
                .setInterpolator(interpolator)
                .scaleX(click?1:0)
                .scaleY(click?1:0)
                .setDuration(600)
                .setStartDelay(click?0:200);

        fab2.animate()
                .setInterpolator(interpolator)
                .scaleX(click?1:0)
                .scaleY(click?1:0)
                .setDuration(600)
                .setStartDelay(100);

        fab3.animate()
                .setInterpolator(interpolator)
                .scaleX(click?1:0)
                .scaleY(click?1:0)
                .setDuration(600)
                .setStartDelay(click?200:0);
    }
}
