package com.hyman.demo.android.ui.widget.list.adapter;

import android.app.ListActivity;
import android.os.Bundle;

public class MyListImprovedAdapterActivity extends ListActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] names = new String[] { "Linux", "Windows7", "Eclipse", "Suse",
				"Ubuntu", "Solaris", "Android", "iPhone" };
		MySimpleArrayImprovedAdapter adapter = new MySimpleArrayImprovedAdapter(this, names);
		setListAdapter(adapter);
	}
}
