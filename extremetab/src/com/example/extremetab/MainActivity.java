package com.example.extremetab;

import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                // TODO Auto-generated method stub
                super.onCreate(savedInstanceState);
                final ActionBar actionBar = getActionBar();

            // Specify that tabs should be displayed in the action bar.
            actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

            // Create a tab listener that is called when the user changes tabs.
            ActionBar.TabListener tabListener = new ActionBar.TabListener() {
                public void onTabSelected(ActionBar.Tab tab,
                        FragmentTransaction ft) { }

                public void onTabUnselected(ActionBar.Tab tab,
                        FragmentTransaction ft) { }

                public void onTabReselected(ActionBar.Tab tab,
                        FragmentTransaction ft) { }
            };

            // Add 2 Tabs
    
            actionBar.addTab(
                    actionBar.newTab()
                            .setText("Accelerometer")
                            .setTabListener(tabListener));
            
            actionBar.addTab(
            		actionBar.newTab()
            				.setText("Battery")
            				.setTabListener(tabListener));
            
        }

}



