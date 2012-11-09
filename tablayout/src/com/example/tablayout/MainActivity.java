package com.example.tablayout;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
	private TabHost mTabHost;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        mTabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;
        
        // Accelerometer Tab 
        intent = new Intent(this, Accelerometer.class);
        spec=mTabHost.newTabSpec("Accelerometer")
        		.setIndicator("Accelerometer")
        		.setContent(intent);     
        mTabHost.addTab(spec);
        
        // Battery Tab
        intent = new Intent(this, BatteryLife.class);
        spec=mTabHost.newTabSpec("BatteryLife")
        		.setIndicator("BatteryLife")
        		.setContent(intent);
        mTabHost.addTab(spec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
