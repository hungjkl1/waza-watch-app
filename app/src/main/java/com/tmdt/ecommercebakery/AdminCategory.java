package com.tmdt.ecommercebakery;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class AdminCategory extends AppCompatActivity {

    private ImageView imgCake,  imgCrossant;
    private ImageView imgLightmeal, imgDessert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }


        imgCake = (ImageView) findViewById(R.id.imgCake);
        imgCrossant = (ImageView)findViewById(R.id.imgCrossant);
        imgLightmeal= (ImageView)findViewById(R.id.imgLightmeal);
        imgDessert = (ImageView)findViewById(R.id.imgDessert);

        imgCake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Cake");
                startActivity(intent);
            }
        });
        imgCrossant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Crossant");
                startActivity(intent);
            }
        });
        imgLightmeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "LightMeal");
                startActivity(intent);
            }
        });
        imgDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategory.this, AdminAddNewProduct.class);
                intent.putExtra("category", "Dessert");
                startActivity(intent);
            }
        });
    }

}
