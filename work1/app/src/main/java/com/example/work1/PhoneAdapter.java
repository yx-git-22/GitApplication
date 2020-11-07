package com.example.work1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PhoneAdapter extends ArrayAdapter<Phone> {
    private int resourceId;

    public PhoneAdapter(Context context, int textViewResourceId,
                        List<Phone> object){
        super(context, textViewResourceId, object);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Phone phone = getItem(position);
        View view;
        ViewHolder viewHolder;
        if(convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.phoneImage = (ImageView) view.findViewById(R.id.phone_image);
            viewHolder.phoneName = (TextView) view.findViewById(R.id.phone_name);
            view.setTag(viewHolder);
        }else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.phoneImage.setImageResource(phone.getImageId());
        viewHolder.phoneName.setText(phone.getName());
        return view;
    }

    public class ViewHolder{
        ImageView phoneImage;
        TextView phoneName;
    }
}
