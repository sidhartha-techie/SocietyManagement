package com.odysseyclub.societymanagement.interfaces;

import android.app.Activity;
import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.odysseyclub.societymanagement.R;

/**
 * Created by Sidhartha Priya on 8/5/2017.
 */

public interface ToolbarDesign {
    public void setToolbar(Activity ob, Context context, DrawerLayout drawerLayout, Toolbar tb, String title, int color);

    class ToolbarDesignListener implements ToolbarDesign {
        @Override
        public void setToolbar(Activity ob,Context context, DrawerLayout drawerLayout, Toolbar tb, String title, int color) {
            tb.setTitle(title);
            tb.setTitleTextColor(color);
            ((AppCompatActivity)context).setSupportActionBar(tb);
            ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(ob, drawerLayout, tb, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

            drawerLayout.addDrawerListener(drawerToggle);

            drawerToggle.syncState();
        }
    }
}

