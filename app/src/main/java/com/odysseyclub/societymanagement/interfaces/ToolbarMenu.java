package com.odysseyclub.societymanagement.interfaces;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import com.odysseyclub.societymanagement.R;
import com.odysseyclub.societymanagement.classes.UserHome;

/**
 * Created by Sidhartha Priya on 8/4/2017.
 */

public interface ToolbarMenu {
    public boolean onOptionsItemSelected(MenuItem item, Context context);

    class ToolbarMenuListener implements ToolbarMenu {
        public boolean onOptionsItemSelected(MenuItem item, Context context) {
            switch (item.getItemId()) {
                case R.id.menu_Settings:
                    //Toast.makeText(this, "Setting Clicked", Toast.LENGTH_SHORT).show();
                    Toast.makeText(context,"Setting Clicked in Interface", Toast.LENGTH_SHORT).show();
                    Log.i("I am","here");
            }
            return true;

        }
    }
}
