package com.hyman.demo.android.ui.widget.list.selection;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.hyman.demo.android.ui.R;

/*
 * TODO setChoiceMode seems not effct the ui, still can't select an item by click
 */
public class MySingleListActivity extends ListActivity {
	private static final String TAG = "MySingleListActivity";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] countries = getResources().getStringArray(
				R.array.countries_array);

		setListAdapter(new ArrayAdapter<String>(this,
				R.layout.widget_list_item, countries));

		final ListView listView = getListView();
		listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		listView.setClickable(true);
		listView.setFocusable(true);
		listView.setFocusableInTouchMode(true);
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				listView.setSelection(position);
				Log.d(TAG, "" + position);
			}
		});
	}
}
