package com.example.tablayout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BatteryLife extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		TextView textView= new TextView(this);
		textView.setText("Battery Life");
		setContentView(textView);
	}
}
