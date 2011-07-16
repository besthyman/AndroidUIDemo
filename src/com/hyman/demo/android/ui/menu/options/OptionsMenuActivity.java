package com.hyman.demo.android.ui.menu.options;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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
		inflater.inflate(R.menu.game_menu, menu);
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
		return super.onPrepareOptionsMenu(menu);
	}
}
