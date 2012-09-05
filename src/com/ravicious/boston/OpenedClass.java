package com.ravicious.boston;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener, OnCheckedChangeListener {

	TextView question, test;
	Button returnData;
	RadioGroup selectionList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
	}

	private void initialize() {
		question = (TextView) findViewById(R.id.textViewQuestion);
		test = (TextView) findViewById(R.id.textViewTest);
		returnData = (Button) findViewById(R.id.buttonReturn);
		selectionList = (RadioGroup) findViewById(R.id.radioGroupAnswers);

		returnData.setOnClickListener(this);
		selectionList.setOnCheckedChangeListener(this);

	}

	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.radioCrazy:

			break;
		case R.id.radioSexy:

			break;
		case R.id.radioBoth:

			break;
		}

	}

}
