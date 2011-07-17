package com.hyman.demo.android.ui.menu.context;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hyman.demo.android.ui.R;

public class ContextMenuActivity extends Activity {
	private static final String TAG = "ContextMenuActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_context);
		String[] names = new String[] { "Linux", "Windows7", "Eclipse", "Suse",
				"Ubuntu", "Solaris", "Android", "iPhone", "Linux", "Windows7",
				"Eclipse", "Suse", "Ubuntu", "Solaris", "Android", "iPhone" };
		ListView listview = (ListView) findViewById(R.id.listview);
		listview.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_single_choice,
				android.R.id.text1, names));
		registerForContextMenu(listview);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		Log.d(TAG, "onCreateContextMenu, menuInfo:" + menuInfo.toString());
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.context_menu, menu);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item) {
		AdapterContextMenuInfo info = (AdapterContextMenuInfo) item
				.getMenuInfo();
		// info here is the same object with onCreateContextMenu's menuInfo
		Log.d(TAG, "onContextItemSelected, menuInfo:" + info.toString());
		switch (item.getItemId()) {
		case R.id.edit:
			Log.d(TAG, "" + info.id);
			return true;
		case R.id.remove:
			Log.d(TAG, "" + info.id);
			return true;
		default:
			return super.onContextItemSelected(item);
		}
	}
}
