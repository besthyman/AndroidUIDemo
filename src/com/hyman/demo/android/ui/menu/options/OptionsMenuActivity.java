package com.hyman.demo.android.ui.menu.options;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ToggleButton;

import com.hyman.demo.android.ui.R;

public class OptionsMenuActivity extends Activity {
	private static final String TAG = "OptionsMenuActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_options);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.options_menu, menu);
		// Create an Intent that describes the requirements to fulfill, to be
		// included
		// in our menu. The offering app must include a category value of
		// Intent.CATEGORY_ALTERNATIVE.
		Intent intent = new Intent("android.intent.action.ACTION_MENU_INTENT");
		intent.addCategory(Intent.CATEGORY_ALTERNATIVE);

		// Search and populate the menu with acceptable offering applications.
		menu.addIntentOptions(R.id.intent_group, // Menu group to which new
													// items will be added
				0, // Unique item ID (none)
				0, // Order for the items (none)
				this.getComponentName(), // The current activity name
				null, // Specific items to place first (none)
				intent, // Intent created above that describes our requirements
				0, // Additional flags to control items (none)
				null); // Array of MenuItems that correlate to specific items
						// (none)

		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		Log.d(TAG, "onOptionsItemSelected");
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.new_game:
			Log.d(TAG, "new_game");
			return true;
		case R.id.help:
			Log.d(TAG, "help");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		Log.d(TAG, "onPrepareOptionsMenu:" + menu.size());
		menu.add("menu" + (menu.size() + 1));
		ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
		menu.setGroupVisible(R.id.group1, toggle.isChecked());
		return super.onPrepareOptionsMenu(menu);
	}
}
