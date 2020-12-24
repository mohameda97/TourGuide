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

public class TourismFragment extends Fragment {
    public TourismFragment() {
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.guide_info_list,container,false);

        ArrayList<GuideInfo> guideInfo =new ArrayList<GuideInfo>();
        guideInfo.add(new GuideInfo(getString(R.string.cairo_tower),getString(R.string.cairo),R.drawable.cairo_tower));
        guideInfo.add(new GuideInfo(getString(R.string.pyramids),getString(R.string.giza),R.drawable.pyramids));
        guideInfo.add(new GuideInfo(getString(R.string.sphinx),getString(R.string.giza),R.drawable.sphinx));
        guideInfo.add(new GuideInfo(getString(R.string.hatshebsute_temple),getString(R.string.luxor),R.drawable.hatshebsute_temple));

        GuideInfoAdapter guideInfoAdapter = new GuideInfoAdapter(getActivity(),guideInfo);
        ListView listView =rootView.findViewById(R.id.list);
        listView.setAdapter(guideInfoAdapter);

        return rootView;
    }
}
