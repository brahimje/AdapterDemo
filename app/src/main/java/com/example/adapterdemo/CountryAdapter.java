package com.example.adapterdemo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends ArrayAdapter<Country> {
    Activity activity;
    int itemResourceId;
    List<Country> items;
    int textViewResourceId;

    public CountryAdapter(Activity activity, int itemResourceId, int textViewResourceId, List<Country> items) {
        super(activity, itemResourceId, textViewResourceId, items);
        this.activity = activity;
        this.itemResourceId = itemResourceId;
        this.textViewResourceId = textViewResourceId;
        this.items = items;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    private View getCustomView(int position, View convertView, ViewGroup parent) {
        View layout = convertView;
        if (convertView == null) {
            LayoutInflater inflater = activity.getLayoutInflater();
            layout = inflater.inflate(itemResourceId, parent, false);
        }
        TextView nameTV = layout.findViewById(R.id.nameTV);
        ImageView flagIV = layout.findViewById(R.id.flagIV);
        nameTV.setText(items.get(position).name);
        flagIV.setImageResource(items.get(position).flagResourceId);
        return layout;
    }




}
