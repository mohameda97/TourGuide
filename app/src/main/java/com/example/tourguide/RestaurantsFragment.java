package com.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.guide_info_list,container,false);

        ArrayList<GuideInfo> guideInfo =new ArrayList<GuideInfo>();
        guideInfo.add(new GuideInfo(getString(R.string.kfc),getString(R.string.cairo),R.drawable.kfc));
        guideInfo.add(new GuideInfo(getString(R.string.burger_king),getString(R.string.alex),R.drawable.burger_king));
        guideInfo.add(new GuideInfo(getString(R.string.hardees),getString(R.string.hardees),R.drawable.hardees));
        guideInfo.add(new GuideInfo(getString(R.string.pizza_hut),getString(R.string.zagaizg),R.drawable.pizza_hut));

        GuideInfoAdapter guideInfoAdapter = new GuideInfoAdapter(getActivity(),guideInfo);
        ListView listView =rootView.findViewById(R.id.list);
        listView.setAdapter(guideInfoAdapter);
        return rootView;
    }
}
