package com.example.middaymeal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





         }

    public void addfood(View view) {
        Intent i = new Intent(this, food_items.class);
        startActivity(i);
    }
}

