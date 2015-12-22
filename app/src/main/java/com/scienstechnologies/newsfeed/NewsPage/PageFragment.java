package com.scienstechnologies.newsfeed.NewsPage;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.scienstechnologies.newsfeed.R;
import com.scienstechnologies.newsfeed.ShareActivity;

import java.util.zip.Inflater;

/**
 * Created by vamsitallapudi on 21-Dec-15.
 */
public class PageFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_page, container, false);


        ImageView ivPageImage = (ImageView) rootView.findViewById(R.id.iv_page_image);

        ivPageImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ShareActivity.class);
                startActivity(i);
            }
        });

        return rootView;
    }

}
