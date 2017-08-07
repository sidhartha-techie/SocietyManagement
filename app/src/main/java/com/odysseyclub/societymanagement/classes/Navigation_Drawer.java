package com.odysseyclub.societymanagement.classes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.odysseyclub.societymanagement.R;


/**
 * Created by Sidhartha Priya on 8/1/2017.
 */

public abstract class Navigation_Drawer extends AppCompatActivity implements View.OnClickListener {
    protected void onPostCreate(Bundle savedState) {

        super.onPostCreate(
                savedState);

        Button Btn_Home = (Button) findViewById(R.id.navbar_btn_home);
        Button Btn_Exit = (Button) findViewById(R.id.navbar_btn_exit);
        Btn_Home.setOnClickListener(this);
        Btn_Exit.setOnClickListener(this);

    }



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.navbar_btn_home:
                Toast.makeText(this, "Home Button", Toast.LENGTH_LONG).show();
                break;
            case R.id.navbar_btn_exit:
                Toast.makeText(this, "Exit Button", Toast.LENGTH_LONG).show();
        }
    }


}


