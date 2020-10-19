package com.senix22.engtests.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.senix22.engtests.R;

import java.net.URISyntaxException;

import static com.senix22.engtests.MainActivity.countAnsw;

public class PageFragment3 extends Fragment {
    TextView textView3;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.test_3, container, false);

        return rootView;//}
    }
}
