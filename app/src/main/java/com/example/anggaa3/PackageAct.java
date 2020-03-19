package com.example.anggaa3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class PackageAct extends AppCompatActivity {

    TextView pagetitle, pagesubtitle;
    ImageView packagePlace;
    SeekBar packageRange;
    Animation atg, packageimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        packageimg = AnimationUtils.loadAnimation(this, R.anim.packageimg);

        pagetitle = findViewById(R.id.pagetitle);
        pagesubtitle = findViewById(R.id.pagesubtitle);
        packagePlace = findViewById(R.id.packagePlace);
        packageRange = findViewById(R.id.packageRange);

        packageRange.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (progress == 35){
                    pagetitle.setText("Starter Guy");
                    pagesubtitle.setText("The simply text be dummies too good  and easier");
                    packagePlace.setImageResource(R.drawable.cartoon1r);

                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                } else if (progress == 75){
                    pagetitle.setText("Business Player");
                    pagesubtitle.setText("The simply text be dummies too good  and easier");
                    packagePlace.setImageResource(R.drawable.cartoon2r);
                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                } else if (progress == 100){
                    pagetitle.setText("Legend of VIP");
                    pagesubtitle.setText("The simply text be dummies too good  and easier");
                    packagePlace.setImageResource(R.drawable.cartoon3r);
                    // pass animation
                    packagePlace.startAnimation(packageimg);
                    pagetitle.startAnimation(atg);
                    pagesubtitle.startAnimation(atg);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}

//    Typeface mlight = Typeface.createFromAsset(getAssets(), "fonts/montserratlight.ttf");
//    Typeface mmedium = Typeface.createFromAsset(getAssets(), "fonts/montserratmedium.ttf");
//    Typeface mregular = Typeface.createFromAsset(getAssets(), "fonts/montserratregular.ttf");