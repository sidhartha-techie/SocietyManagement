package com.odysseyclub.societymanagement;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Sidhartha Priya on 8/1/2017.
 */

public class Fragment1 extends Fragment implements View.OnClickListener{
    private View rootView;
    private EditText et;
    private String str;
    @Nullable

    activitycallback mcallback;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView=inflater.inflate(R.layout.frag1,container,false);
        Button frag1_but=(Button)rootView.findViewById(R.id.frag1_but);
        et=(EditText)rootView.findViewById(R.id.frag1_Edittext);
        frag1_but.setOnClickListener(this);
        return rootView;
    }
    public void onAttach(Activity activity){
        super.onAttach(activity);
        try
        {
            mcallback=(activitycallback)activity;
        }
        catch(Exception ex)
        {
        }
    }
    @Override
    public void onClick(View v) {
        str = et.getText().toString();
        mcallback.btnprs(str);
    }


    public interface activitycallback{
         void btnprs(String str);
    }
}
