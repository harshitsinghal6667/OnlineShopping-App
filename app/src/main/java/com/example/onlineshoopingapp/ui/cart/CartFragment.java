package com.example.onlineshoopingapp.ui.cart;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.onlineshoopingapp.R;
import com.example.onlineshoopingapp.databinding.FragmentCartBinding;
import com.example.onlineshoopingapp.ui.cart.CartViewModel;
import com.example.onlineshoopingapp.ui.home.CustomListAdapter;
import com.example.onlineshoopingapp.ui.home.HomeViewModel;

import java.util.ArrayList;

public class CartFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_cart, container, false);

    }
}
