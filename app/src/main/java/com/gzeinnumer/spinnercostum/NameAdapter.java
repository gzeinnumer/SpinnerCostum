package com.gzeinnumer.spinnercostum;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

//todo 3
public class NameAdapter extends ArrayAdapter<NameItem> {

    public NameAdapter(Context context, ArrayList<NameItem> list){
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    private View initView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
        }

        TextView fname = convertView.findViewById(R.id.fName);
        TextView lname = convertView.findViewById(R.id.lName);
        NameItem currentItem = getItem(position);

        if(currentItem != null){
            fname.setText(currentItem.getfName());
            lname.setText(currentItem.getlName());
        }

        return convertView;
    }
}
