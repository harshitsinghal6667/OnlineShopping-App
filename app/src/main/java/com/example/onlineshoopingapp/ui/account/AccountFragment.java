package com.example.onlineshoopingapp.ui.account;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.onlineshoopingapp.R;
import com.example.onlineshoopingapp.databinding.FragmentAccountBinding;
import com.example.onlineshoopingapp.ui.account.AccountViewModel;

public class AccountFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_account, container,false);

    }




}
