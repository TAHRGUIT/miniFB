package com.example.minifacebook;


import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> logos;

    LayoutInflater inflter;
    public MyAdapter(Context applicationContext, ArrayList<String> logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return logos.size();
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view == null){

            view = inflter.inflate(R.layout.layout_grid_item, null);

            TextView textView =  view.findViewById(R.id.tv_emp_name);

            textView.setText(logos.get(i));

            Log.d("ook: ",logos.get(i));
        }
        return view;
    }
}
