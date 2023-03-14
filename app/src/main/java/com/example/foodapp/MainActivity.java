package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements FoodAdapter.FoodItemClickListener {
    private ArrayList<FoodModel> foodModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        foodModelArrayList = new ArrayList<>();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        foodModelArrayList.add(new FoodModel("Makarna", "30 dk", "4 kişilik bir aile için \n" +
                "1 paket makarna \n" +
                "5 su bardağı su \n" +
                "1 tatlı kaşığı tuz\n" +
                "Sıvı yağ", R.drawable.ic_makarna));


        foodModelArrayList.add(new FoodModel("Tavuk Sote ", "25 dk", "Yarım kg tavuk göğsü\n" +
                "2 yemek kaşığı sıvı yağ\n" +
                "1 tatlı kaşığı domates salçası\n" +
                "2 adet yeşil biber\n" +
                "1 adet kırmızı biber\n" +
                "1 adet soğan\n" +
                "2 diş sarımsak\n" +
                "2 adet domates\n" +
                "Karabiber\n" +
                "Pul biber\n" +
                "Tuz\n" +
                "1 su bardağı su", R.drawable.ic_tavukl_sote));


        foodModelArrayList.add(new FoodModel("Taze Fasulye", "40 dk", "600 gr taze yeşil fasulye (çalı fasulye kullandım)\n" +
                "2 adet domates\n" +
                "1 adet soğan\n" +
                "Yarım çay kaşığı pul biber\n" +
                "Yarım çay kaşığı karabiber\n" +
                "2 çay kaşığı tuz\n" +
                "Yarım çay bardağı zeytinyağı (veya sıvı yağ)\n" +
                "1,5 yemek kaşığı domates salçası\n" +
                "2 su bardağı sıcak su\n", R.drawable.ic_fasulye));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        FoodAdapter foodAdapter = new FoodAdapter(this,foodModelArrayList,this);
        recyclerView.setAdapter(foodAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }

    @Override
    public void onItemClicked(FoodModel foodModel) {
        Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
        intent.putExtra("MODELS", foodModel);
        startActivity(intent);
    }
}