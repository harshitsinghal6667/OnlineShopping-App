package com.example.onlineshoopingapp.ui.home;

import static android.widget.Toast.makeText;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.onlineshoopingapp.R;
import com.example.onlineshoopingapp.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    //    private FragmentHomeBinding binding;
    ListView lv;
    CustomListAdapter adapter;
    Context Context;
    public ArrayList<HomeViewModel> arr_bean;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        HomeViewModel homeViewModel =
//                new ViewModelProvider(this).get(HomeViewModel.class);
//
//        binding = FragmentHomeBinding.inflate(inflater, container, false);
//        View root = binding.getRoot();
//
//        final ListView listView = binding.list;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
//        return root;
//    }
//
//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        binding = null;
        return inflater.inflate(R.layout.fragment_home, container,false);
    }

    @Override
    public void onViewCreated(View view,@NonNull Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lv = (ListView)view.findViewById(R.id.list);
        arr_bean = new ArrayList<HomeViewModel>();

        arr_bean.add(new HomeViewModel(R.drawable.shirt,"Levis \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Rs.1050\nMen t-shirt",R.drawable.ic_baseline_shopping_cart));
        arr_bean.add(new HomeViewModel(R.drawable.bottle,"Cello \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Rs.2000\n Water Bottle",R.drawable.ic_baseline_shopping_cart));
        arr_bean.add(new HomeViewModel(R.drawable.bowl,"Pigeon \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Rs.200\n Rice Bowl",R.drawable.ic_baseline_shopping_cart));
        arr_bean.add(new HomeViewModel(R.drawable.cbook,"Tech \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Rs.1800\n C Programming Book",R.drawable.ic_baseline_shopping_cart));
        arr_bean.add(new HomeViewModel(R.drawable.oven,"Samsung \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Rs.2000\n Oven",R.drawable.ic_baseline_shopping_cart));

        adapter = new CustomListAdapter(arr_bean,this);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(Color.GREEN);
            }
        });

    }

}