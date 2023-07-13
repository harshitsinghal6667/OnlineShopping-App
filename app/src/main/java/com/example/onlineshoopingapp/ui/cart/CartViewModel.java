package com.example.onlineshoopingapp.ui.cart;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.io.Closeable;

public class CartViewModel extends ViewModel {

    int image1;
    int image2;
    String itemName;

    public CartViewModel(int image1, String itemName,int image2) {
        this.image1 = image1;
        this.itemName = itemName;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


}