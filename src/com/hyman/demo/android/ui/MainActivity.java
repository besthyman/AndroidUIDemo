package com.hyman.demo.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

import com.hyman.demo.android.ui.layout.absolute.AbsoluteLayoutActivity;
import com.hyman.demo.android.ui.layout.frame.FrameLayoutActivity;
import com.hyman.demo.android.ui.layout.linear.LinearLayoutActivity;
import com.hyman.demo.android.ui.layout.linear.LinearLayoutNestedActivity;
import com.hyman.demo.android.ui.layout.relative.RelativeLayout2Activity;
import com.hyman.demo.android.ui.layout.relative.RelativeLayoutActivity;
import com.hyman.demo.android.ui.layout.table.TableLayoutActivity;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btnFrameLayout = (Button) this.findViewById(R.id.layoutbutton);
        final Spinner spinner = (Spinner) this.findViewById(R.id.layoutspinner);
        btnFrameLayout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String value = spinner.getSelectedItem().toString();
				if ("absolute layout".equals(value)) {
					Intent intent = new Intent(MainActivity.this, AbsoluteLayoutActivity.class);
					MainActivity.this.startActivity(intent);
				} else if ("frame layout".equals(value)) {
					Intent intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
					MainActivity.this.startActivity(intent);
				} else if ("linear layout".equals(value)) {
					Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
					MainActivity.this.startActivity(intent);
				} else if ("linear layout nested".equals(value)) {
					Intent intent = new Intent(MainActivity.this, LinearLayoutNestedActivity.class);
					MainActivity.this.startActivity(intent);
				} else if ("relative layout".equals(value)) {
					Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
					MainActivity.this.startActivity(intent);
				} else if ("relative layout 2".equals(value)) {
					Intent intent = new Intent(MainActivity.this, RelativeLayout2Activity.class);
					MainActivity.this.startActivity(intent);
				} else if ("table layout".equals(value)) {
					Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
					MainActivity.this.startActivity(intent);
				}
			}
        	
        });
    }
}