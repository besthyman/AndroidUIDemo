package com.hyman.demo.android.ui.widget.list;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hyman.demo.android.ui.R;

public class MyHeaderFooterListActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Create an array of Strings, that will be put to our ListActivity
		String[] names = new String[] { "Linux", "Windows7", "Eclipse", "Suse",
				"Ubuntu", "Solaris", "Android", "iPhone", "Linux", "Windows7",
				"Eclipse", "Suse", "Ubuntu", "Solaris", "Android", "iPhone" };
		View header = getLayoutInflater().inflate(R.layout.widget_list_header, null);
		View footer = getLayoutInflater().inflate(R.layout.widget_list_footer, null);
		ListView listView = getListView();
		listView.addHeaderView(header);
		listView.addFooterView(footer);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_single_choice,
				android.R.id.text1, names));

	}
}
