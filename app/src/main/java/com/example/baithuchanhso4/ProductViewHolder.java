package com.example.baithuchanhso4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView price;
    private ImageView image;



    public TextView getName() {
        return name;
    }

    public void setName(TextView name) {
        this.name = name;
    }

    public TextView getPrice() {
        return price;
    }

    public void setPrice(TextView price) {
        this.price = price;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
        this.setName(itemView.findViewById(R.id.name));
        this.setPrice(itemView.findViewById(R.id.price));
        this.setImage(itemView.findViewById(R.id.image));
    }

}
