package com.example.anggaa3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;

public class PackageAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);

        Typeface mlight = Typeface.createFromAsset(getAssets(), "fonts/MontserratLight.ttf");
        Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");
        Typeface mregular = Typeface.createFromAsset(getAssets(), "fonts/MontserratRegular.ttf");
    }
}
