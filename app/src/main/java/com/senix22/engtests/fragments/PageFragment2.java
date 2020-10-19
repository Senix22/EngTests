package com.senix22.engtests.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.senix22.engtests.R;
import com.senix22.engtests.ResultActivity;

import static com.senix22.engtests.MainActivity.countAnsw;

public class PageFragment2 extends Fragment implements View.OnClickListener {
    private final String TAG = PageFragment1.class.getName();
    int count = 0;
    boolean trueAnsw = false;
    private Button btnAns1_2, btnAns2_2, btnAns3_2;
    TextView textQue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.test_2, container, false);
        btnAns1_2 = (Button) rootView.findViewById(R.id.btnFisrtAnsw_2);
        btnAns2_2 = (Button) rootView.findViewById(R.id.btnSecondAnsw_2);
        btnAns3_2 = (Button) rootView.findViewById(R.id.btnThirdAnsw_2);
        textQue = (TextView) rootView.findViewById(R.id.textView2);
        btnAns1_2.setOnClickListener(this);
        btnAns2_2.setOnClickListener(this);
        btnAns3_2.setOnClickListener(this);
        return rootView;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnFisrtAnsw_2:
                Toast.makeText(getContext(), "WRONG", Toast.LENGTH_LONG).show();
                trueAnsw = false;
                Log.v(TAG, "DONE");
                break;


            case R.id.btnSecondAnsw_2:
                Toast.makeText(getContext(), "Correct", Toast.LENGTH_LONG).show();
                trueAnsw = true;
                countAnsw++;
                Log.v(TAG, "Correct");


                break;
            case R.id.btnThirdAnsw_2:
                Toast.makeText(getContext(), "Wrong", Toast.LENGTH_LONG).show();
                trueAnsw = false;
                Log.v(TAG, "wrong");
                break;
        }
    }
}
