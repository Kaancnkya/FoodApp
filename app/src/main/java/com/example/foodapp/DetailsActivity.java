package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        FoodModel foodModel = (FoodModel) getIntent().getSerializableExtra("MODELS");

        ImageView imageView = findViewById(R.id.imageViewDetails);
        TextView timeDetails = findViewById(R.id.timeDetails);
        TextView contentText = findViewById(R.id.contentDetails);

        imageView.setImageResource(foodModel.getFoodImage());
        timeDetails.setText(foodModel.getTime());
        contentText.setText(foodModel.getPreparation());
    }
}