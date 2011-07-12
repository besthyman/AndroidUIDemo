package com.hyman.demo.android.ui.widget.button;

import com.hyman.demo.android.ui.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ButtonStatesActivity extends Activity {
	private static final String TAG = "ButtonStatesActivity";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.widget_button_states);
		Log.d(TAG, "onCreate");
	}
}
