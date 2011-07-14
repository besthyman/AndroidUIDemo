package com.hyman.demo.android.ui.widget.list;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hyman.demo.android.ui.R;

public class ListViewActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.widget_list_layout);
		String[] names = new String[] { "Linux", "Windows7", "Eclipse", "Suse",
				"Ubuntu", "Solaris", "Android", "iPhone", "Linux", "Windows7",
				"Eclipse", "Suse", "Ubuntu", "Solaris", "Android", "iPhone" };
		ListView listview = (ListView) findViewById(R.id.listview);
		listview.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_single_choice,
				android.R.id.text1, names));
	}
}
