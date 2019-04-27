package com.example.developer.musicalstracture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import static android.R.attr.onClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView song=(ImageView)findViewById(R.id.musicImage);
        ImageView album=(ImageView)findViewById(R.id.albumImage);
        ImageView payment=(ImageView)findViewById(R.id.paymentImage);
        ImageView loved=(ImageView)findViewById(R.id.lovedImage);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, Songs.class);
                startActivity(intent);
            }
        });

        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, album.class);
                startActivity(intent);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, payment.class);
                startActivity(intent);
            }
        });

        loved.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this, favourite.class);
                startActivity(intent);

            }

        });


    }
}
