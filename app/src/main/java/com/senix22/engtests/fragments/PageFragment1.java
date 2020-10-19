package com.senix22.engtests.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;
import static com.senix22.engtests.MainActivity.countAnsw;
import com.senix22.engtests.MainActivity;
import com.senix22.engtests.R;

public class PageFragment1 extends Fragment implements View.OnClickListener {
    private final String TAG = PageFragment1.class.getName();
    int count = 0;
    boolean trueAnsw = false;
    private Button btnAns1,btnAns2,btnAns3;
    TextView textQue;
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView =(ViewGroup)inflater.inflate(R.layout.test_1,container,false);
        btnAns1 = (Button)rootView.findViewById(R.id.btnFisrtAnsw);
        btnAns2 = (Button)rootView.findViewById(R.id.btnSecondAnsw);
        btnAns3 = (Button)rootView.findViewById(R.id.btnThirdAnsw);
        textQue = (TextView) rootView.findViewById(R.id.textView);
        btnAns1.setOnClickListener(this);
        btnAns2.setOnClickListener(this);
        btnAns3.setOnClickListener(this);
        return rootView;

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnFisrtAnsw:
                Toast.makeText(getContext(),"U are right",Toast.LENGTH_LONG).show();
                countAnsw++;
                trueAnsw = true;
                Log.v(TAG,"DONE");
                break;


            case R.id.btnSecondAnsw:
                Toast.makeText(getContext(),"U are worinf",Toast.LENGTH_LONG).show();
                trueAnsw = false;
                Log.v(TAG,"worng");
                break;
            case R.id.btnThirdAnsw:
                Toast.makeText(getContext(),"WRONG",Toast.LENGTH_LONG).show();
                trueAnsw = false;
                Log.v(TAG,"wrong");
                break;
        }
    }


}
