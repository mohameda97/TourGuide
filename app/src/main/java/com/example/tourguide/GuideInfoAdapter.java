package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class GuideInfoAdapter extends ArrayAdapter<GuideInfo> {
    public GuideInfoAdapter(Context context, ArrayList<GuideInfo> guideInfoArrayList) {
        super(context, 0,guideInfoArrayList);
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null ){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.guid_info_list_items,parent,false);
        }
        GuideInfo guideInfo = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.name);
        TextView locationTextView = listItemView.findViewById(R.id.location);
        ImageView imageView = listItemView.findViewById(R.id.image);

        nameTextView.setText(guideInfo.getName());
        locationTextView.setText(guideInfo.getLocation());
        // Set background color
        imageView.setImageResource(guideInfo.getImageResource());

        return listItemView;
    }
}
