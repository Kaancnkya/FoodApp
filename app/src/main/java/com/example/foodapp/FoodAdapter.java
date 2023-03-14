package com.example.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private final ArrayList<FoodModel> foodModelArrayList;
    private final LayoutInflater inflator;

    private FoodItemClickListener foodItemClickListener;


    public FoodAdapter(Context context, ArrayList<FoodModel> foodModelArrayList, FoodItemClickListener foodItemClickListener) {
        this.foodModelArrayList = foodModelArrayList;
        this.inflator = LayoutInflater.from(context);
        this.foodItemClickListener = foodItemClickListener;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflator.inflate(R.layout.activity_row, parent,false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodModel foodModel = foodModelArrayList.get(position);
        holder.name.setText(foodModel.getName());
        holder.time.setText(foodModel.getTime());
        holder.imageView.setImageResource(foodModel.getFoodImage());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodItemClickListener.onItemClicked(foodModel);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodModelArrayList.size();
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView time;
        ImageView imageView;
        CardView cardView;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_text_View);
            time = itemView.findViewById(R.id.time_View);
            imageView = itemView.findViewById(R.id.image_view);
            cardView = itemView.findViewById(R.id.card_view);
        }

    }
    public interface FoodItemClickListener{
        void onItemClicked (FoodModel foodModel);
    }
}
