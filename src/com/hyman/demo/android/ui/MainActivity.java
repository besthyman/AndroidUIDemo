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
				}
			}
        	
        });
    }
}