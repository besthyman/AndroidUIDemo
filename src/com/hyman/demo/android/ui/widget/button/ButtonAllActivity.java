package com.hyman.demo.android.ui.widget.button;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import com.hyman.demo.android.ui.R;

public class ButtonAllActivity extends Activity {
	private static final String TAG = "ButtonAllActivity";
	
	@Override 
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
		setContentView(R.layout.widget_button_all);
	}
	
	public void onCheckboxClick(View src) {
		Log.d(TAG, "onCheckboxClick");
		CheckBox chekbox = (CheckBox) findViewById(R.id.checkbox);
		Log.d(TAG, "" + chekbox.isChecked());
	}
	
	public void onRadioClick(View src) {
		Log.d(TAG, "onRadioClick");
		RadioButton radio = (RadioButton) src;
		Log.d(TAG, "" + radio.getId());
		Log.d(TAG, "" + radio.getText());
	}
	
	public void onToggleClick(View src) {
		Log.d(TAG, "onToggleClick");
		ToggleButton toggle = (ToggleButton) src;
		Log.d(TAG, "" + toggle.getId());
		Log.d(TAG, "" + toggle.getText());
		Log.d(TAG, "" + toggle.isChecked());
	}
}
