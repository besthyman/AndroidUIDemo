package com.hyman.demo.android.ui.widget.list;

import com.hyman.demo.android.ui.R;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MyLayoutListActivity  extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.widget_list_full);
		// Create an array of Strings, that will be put to our ListActivity
		String[] names = new String[] { "Linux", "Windows7", "Eclipse", "Suse",
				"Ubuntu", "Solaris", "Android", "iPhone", "Linux", "Windows7",
				"Eclipse", "Suse", "Ubuntu", "Solaris", "Android", "iPhone" };
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_single_choice,
				android.R.id.text1, names));

	}
}