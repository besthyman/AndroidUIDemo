package com.hyman.demo.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.hyman.demo.android.ui.layout.absolute.AbsoluteLayoutActivity;
import com.hyman.demo.android.ui.layout.frame.FrameLayoutActivity;
import com.hyman.demo.android.ui.layout.linear.LinearLayoutActivity;
import com.hyman.demo.android.ui.layout.linear.LinearLayoutNestedActivity;
import com.hyman.demo.android.ui.layout.relative.RelativeLayout2Activity;
import com.hyman.demo.android.ui.layout.relative.RelativeLayoutActivity;
import com.hyman.demo.android.ui.layout.table.TableLayoutActivity;
import com.hyman.demo.android.ui.widget.button.ButtonAllActivity;
import com.hyman.demo.android.ui.widget.button.ButtonStatesActivity;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onLayoutButtonClick(View src) {
		Spinner spinner = (Spinner) this.findViewById(R.id.layoutspinner);
		String value = spinner.getSelectedItem().toString();
		if ("absolute layout".equals(value)) {
			Intent intent = new Intent(this,
					AbsoluteLayoutActivity.class);
			this.startActivity(intent);
		} else if ("frame layout".equals(value)) {
			Intent intent = new Intent(this,
					FrameLayoutActivity.class);
			this.startActivity(intent);
		} else if ("linear layout".equals(value)) {
			Intent intent = new Intent(this,
					LinearLayoutActivity.class);
			this.startActivity(intent);
		} else if ("linear layout nested".equals(value)) {
			Intent intent = new Intent(this,
					LinearLayoutNestedActivity.class);
			this.startActivity(intent);
		} else if ("relative layout".equals(value)) {
			Intent intent = new Intent(this,
					RelativeLayoutActivity.class);
			this.startActivity(intent);
		} else if ("relative layout 2".equals(value)) {
			Intent intent = new Intent(this,
					RelativeLayout2Activity.class);
			this.startActivity(intent);
		} else if ("table layout".equals(value)) {
			Intent intent = new Intent(this,
					TableLayoutActivity.class);
			this.startActivity(intent);
		}
	}

	public void onWidgetButtonButtonClick(View src) {
		Spinner spinner = (Spinner) this.findViewById(R.id.widgetbuttonspinner);
		String value = spinner.getSelectedItem().toString();
		if ("Button States".equals(value)) {
			Intent intent = new Intent(this,
					ButtonStatesActivity.class);
			this.startActivity(intent);
		} else if ("Button All".equals(value)) {
			Intent intent = new Intent(this,
					ButtonAllActivity.class);
			this.startActivity(intent);
		} 
	}
}