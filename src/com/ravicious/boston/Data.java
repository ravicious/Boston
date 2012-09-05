package com.ravicious.boston;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements OnClickListener {

	Button start, startFor;
	EditText editTextSend;
	TextView gotAnswer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		initialize();
	}
	
	private void initialize() {
		start = (Button) findViewById(R.id.buttonStartActivity);
		startFor = (Button) findViewById(R.id.buttonStartActivityForResult);
		editTextSend = (EditText) findViewById(R.id.editTextSend);
		gotAnswer = (TextView) findViewById(R.id.textViewGot);
		
		start.setOnClickListener(this);
		startFor.setOnClickListener(this);
	}

	public void onClick(View v) {
		
	}
}
