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

public class CitiesFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.guide_info_list,container,false);
        ArrayList<GuideInfo> guideInfo =new ArrayList<GuideInfo>();
        guideInfo.add(new GuideInfo(getString(R.string.cairo),getString(R.string.egypt),R.drawable.cairo));
        guideInfo.add(new GuideInfo(getString(R.string.alex),getString(R.string.egypt),R.drawable.alex));
        guideInfo.add(new GuideInfo(getString(R.string.aswan),getString(R.string.egypt),R.drawable.aswan));
        guideInfo.add(new GuideInfo(getString(R.string.luxor),getString(R.string.egypt),R.drawable.luxor));

        GuideInfoAdapter guideInfoAdapter = new GuideInfoAdapter(getActivity(),guideInfo);
        ListView listView =rootView.findViewById(R.id.list);
        listView.setAdapter(guideInfoAdapter);

        return rootView;
    }

    public CitiesFragment() {

    }
}
