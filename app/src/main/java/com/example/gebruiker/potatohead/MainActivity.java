package com.example.gebruiker.potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        ImageView eyes = (ImageView) findViewById(R.id.eyes);
        ImageView arms = (ImageView) findViewById(R.id.arms);
        ImageView ears = (ImageView) findViewById(R.id.ears);
        ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
        ImageView glasses = (ImageView) findViewById(R.id.glasses);
        ImageView hat= (ImageView) findViewById(R.id.hat);
        ImageView mouth = (ImageView) findViewById(R.id.mouth);
        ImageView mustache = (ImageView) findViewById(R.id.mustache);
        ImageView nose = (ImageView) findViewById(R.id.nose);
        ImageView shoes = (ImageView) findViewById(R.id.shoes);
        switch (view.getId()) {
            case R.id.check_arms:
                if (checked) {
                    arms.setVisibility(View.VISIBLE);
                } else {
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_eyes:
                if (checked) {
                    eyes.setVisibility(View.VISIBLE);
                } else {
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_shoes:
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                } else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_nose:
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                } else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_mustache:
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                } else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_mouth:
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                } else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_hat:
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                } else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_glasses:
                if (checked) {
                    glasses.setVisibility(View.VISIBLE);
                } else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_eyebrows:
                if (checked) {
                    eyebrows.setVisibility(View.VISIBLE);
                } else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.check_ears:
                if (checked) {
                    ears.setVisibility(View.VISIBLE);
                } else {
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }}
