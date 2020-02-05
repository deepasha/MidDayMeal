package com.example.middaymeal;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class food_items extends AppCompatActivity {


     private RecyclerView recyclerView;
     private RecyclerView.Adapter adapter;
      private ArrayList<List> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_items);

        recyclerView = (RecyclerView) findViewById(R.id.Recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        List[] list = new List[]{
                new List("Roti", " 297"),

        new List("Dal", " 104"),
        new List("Idli", " 5"),
        new List("Dosa", " 133"),
        new List("Chole bhature", " 427"),
        new List("Kadhai paneer", " 248"),
        new List("Peda", " 82"),
        new List("Samosa", " 262"),
        new List("Aloo parantha", " 177"),
        new List("Poha", " 250"),

        //   lists.add(list);

};
        Adapter adapter = new Adapter(Arrays.asList(list), this);
        recyclerView.setAdapter(adapter);
    }

         }


