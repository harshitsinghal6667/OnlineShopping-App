
package com.example.onlineshoopingapp.ui.home;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorInt;

import com.example.onlineshoopingapp.R;
import com.example.onlineshoopingapp.ui.cart.CartFragment;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    public ArrayList<HomeViewModel> arraylistListener;
    public ArrayList<HomeViewModel> array;
    private List<HomeViewModel> mListenerList;
    private Context mContext;
    public CustomListAdapter(List<HomeViewModel> mListenerList, HomeFragment context) {


        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<HomeViewModel>();
        this.arraylistListener.addAll(mListenerList);
        this.array = new ArrayList<HomeViewModel>();
        this.array.addAll(mListenerList);
    }


    public class ViewHolder{
        ImageView itempic,cart;
        TextView about;
    }

    @Override
    public int getCount() {
        return mListenerList.size();
    }

    @Override
    public Object getItem(int position) {
        return mListenerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null){

            convertView = LayoutInflater.from(mContext).inflate(R.layout.layout,null);
            holder = new ViewHolder();
            holder.itempic = (ImageView) convertView.findViewById(R.id.tshirt);
            holder.cart = (ImageView) convertView.findViewById(R.id.imageView6);
            holder.about = (TextView) convertView.findViewById(R.id.about);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        try{
            int image1 = mListenerList.get(position).getImage1();
            int image2 = mListenerList.get(position).getImage2();
            holder.itempic.setImageResource(image1);
            holder.cart.setImageResource(image1);
            holder.itempic.setImageResource(image2);
            holder.cart.setImageResource(image2);
            holder.about.setText(mListenerList.get(position).getItemName());

            holder.cart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    v.getContext().startActivity(new Intent(mContext, CartFragment.class));
                    Toast.makeText(mContext,"already in cart",Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception ex){

        }return convertView;
    }
}

