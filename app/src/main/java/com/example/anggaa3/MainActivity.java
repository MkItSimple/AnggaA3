package com.example.anggaa3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView newuser, walletuser, review, network, plugins, myapps, mainmenus, pagetitle, pagesubtitle;

    Button btnguide;
    Animation atg, atgtwo, atgthree;
    ImageView imageView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        atg = AnimationUtils.loadAnimation(this,R.anim.atg);
//        atgtwo = AnimationUtils.loadAnimation(this,R.anim.atgtwo);
//        atgthree = AnimationUtils.loadAnimation(this,R.anim.atgthree);
//
//        nameuser = findViewById(R.id.nameuser);
//        walletuser = findViewById(R.id.walletuser);
//
//        imageView3 = findViewById(R.id.imageView3);
//
//        review = findViewById(R.id.review);
//        network = findViewById(R.id.network);
//        plugins = findViewById(R.id.plugins);
//        myapps = findViewById(R.id.myapps);
//        mainmenus = findViewById(R.id.mainmenus);
//
//        pagetitle = findViewById(R.id.pagetitle);
//        pagesubtitle = findViewById(R.id.pagesubtitle);
//
//        btnguide = findViewById(R.id.btnguide);
//
//        btnguide.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(MainActivity.this, PackageAct.class);
//                startActivity(a);
//            }
//        });
//
//        // Pass an animation
//        imageView3.startAnimation(atg);
//
//        pagetitle.startAnimation(atg);
//        pagesubtitle.startAnimation(atgtwo);
//
//        btnguide.startAnimation(atgthree);

    }
}
