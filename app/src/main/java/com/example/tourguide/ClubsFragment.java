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

public class ClubsFragment extends Fragment {
    public ClubsFragment() {
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.guide_info_list,container,false);
        ArrayList<GuideInfo> guideInfo =new ArrayList<GuideInfo>();
        guideInfo.add(new GuideInfo(getString(R.string.alahly),getString(R.string.cairo),R.drawable.alahly));
        guideInfo.add(new GuideInfo(getString(R.string.zamalek),getString(R.string.cairo),R.drawable.zamalek));
        guideInfo.add(new GuideInfo(getString(R.string.ismaily),getString(R.string.ismailia),R.drawable.ismaily));
        guideInfo.add(new GuideInfo(getString(R.string.masry),getString(R.string.port_said),R.drawable.al_masry_sc_logo));

        GuideInfoAdapter guideInfoAdapter = new GuideInfoAdapter(getActivity(),guideInfo);
        ListView listView =rootView.findViewById(R.id.list);
        listView.setAdapter(guideInfoAdapter);

        return rootView;
    }
}
