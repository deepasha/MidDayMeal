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
                new List("Roti", " 297",R.drawable.ic_launcher_background),

        new List("Dal", " 104",R.drawable.ic_launcher_background),
        new List("Idli", " 5",R.drawable.ic_launcher_background),
        new List("Dosa", " 133",R.drawable.ic_launcher_background),
        new List("Chole bhature", " 427", R.drawable.ic_launcher_background),
        new List("Kadhai paneer", " 248",R.drawable.ic_launcher_background),
        new List("Peda", " 82",R.drawable.ic_launcher_background),
        new List("Samosa", " 262",R.drawable.ic_launcher_background),
        new List("Aloo parantha", " 177",R.drawable.ic_launcher_background),
        new List("Poha", " 250",R.drawable.ic_launcher_background),

        //   lists.add(list);

};
        Adapter adapter = new Adapter(Arrays.asList(list), this);
        recyclerView.setAdapter(adapter);
    }

         }


