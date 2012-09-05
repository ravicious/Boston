package com.ravicious.boston;

import android.app.Activity;
import android.content.Intent;
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
	String gotBread, setData;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();

		//Bundle gotBasket = getIntent().getExtras();
		//gotBread = gotBasket.getString("key");
		//question.setText(gotBread + ":");
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
		Intent person = new Intent();
		Bundle backpack = new Bundle();
		
		backpack.putString("answer", setData);
		person.putExtras(backpack);
		setResult(RESULT_OK, person);
		finish();
	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.radioCrazy:
			setData = "Probably right!";
			break;
		case R.id.radioSexy:
			setData = "Definitely right!";
			break;
		case R.id.radioBoth:
			setData = "Spot on!";
			break;
		}

		test.setText(setData);

	}

}
