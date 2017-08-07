package com.odysseyclub.societymanagement.classes;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.odysseyclub.societymanagement.R;
import com.odysseyclub.societymanagement.interfaces.ToolbarDesign;
import com.odysseyclub.societymanagement.interfaces.ToolbarMenu;


public class UserHome extends Navigation_Drawer implements ToolbarMenu, ToolbarDesign {

    //Class Variables
    String TOOLBAR_TITLE = "Home";
    int TOOLBAR_COLOR = Color.WHITE;
    DrawerLayout drawerLayout;
    Toolbar UpperToolbar;

    //Interface Inner Class Objects
    ToolbarMenuListener TOOLBAR_MENU_LISTENER = new ToolbarMenu.ToolbarMenuListener();
    ToolbarDesignListener TOOLBAR_DESIGN_LISTENER = new ToolbarDesign.ToolbarDesignListener();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeuser);
        UpperToolbar = (Toolbar) findViewById(R.id.home_tbupper);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerlayout);

        //Method Calls
        setToolbar(new UserHome(),this, drawerLayout, UpperToolbar, TOOLBAR_TITLE, TOOLBAR_COLOR);
    }

    { /*
        private void replacefragment(android.app.Fragment fragment) {
            android.app.FragmentManager manager = getFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fragmentcontainer, fragment);
            transaction.commit();
        }
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        TOOLBAR_MENU_LISTENER.onOptionsItemSelected(item, this);
        return true;
    }

    //Dummy Implementation, keep it empty
    public boolean onOptionsItemSelected(MenuItem item, Context context) {
        return true;
    }

    public void setToolbar(Activity ob,Context context, DrawerLayout drawerLayout, Toolbar tb, String title, int color) {
        TOOLBAR_DESIGN_LISTENER.setToolbar(ob,context, drawerLayout, tb, title, color);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TOOLBAR_MENU_LISTENER = null;
        TOOLBAR_DESIGN_LISTENER = null;
    }


}