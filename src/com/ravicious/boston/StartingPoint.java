package com.ravicious.boston;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity {

	int counter;
	Button add, sub;
	TextView display;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starting_point);
		counter = 0;
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tvDisplay);
		add.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				counter++;
				display.setText(" " + counter);
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				counter--;
				display.setText(" " + counter);
			}
		});
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_starting_point, menu);
		return true;
	}
	*/
}
