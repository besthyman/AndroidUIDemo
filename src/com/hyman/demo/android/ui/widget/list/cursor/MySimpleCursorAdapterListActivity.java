package com.hyman.demo.android.ui.widget.list.cursor;

import android.app.ListActivity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class MySimpleCursorAdapterListActivity extends ListActivity {
	private DictionaryOpenHelper dbHelper;
	private Cursor mCursor;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		dbHelper = new DictionaryOpenHelper(this);
		initDatabase();
		mCursor = queryDatabase();
		startManagingCursor(mCursor);
		// Now create a new list adapter bound to the cursor.
		// SimpleListAdapter is designed for binding to a Cursor.
		ListAdapter adapter = new SimpleCursorAdapter(this, // Context.
				android.R.layout.two_line_list_item, // Specify the row template
														// to use (here, two
														// columns bound to the
														// two retrieved cursor
														// rows).
				mCursor, // Pass in the cursor to bind to.
				// Array of cursor columns to bind to.
				new String[] { DictionaryOpenHelper.KEY_WORD,
						DictionaryOpenHelper.KEY_DEFINITION },
				// Parallel array of which template objects to bind to those
				// columns.
				new int[] { android.R.id.text1, android.R.id.text2 });

		// Bind to our new adapter.
		setListAdapter(adapter);
	}

	private Cursor queryDatabase() {
		SQLiteDatabase readableDatabase = dbHelper.getReadableDatabase();
		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
		qb.setTables(DictionaryOpenHelper.DICTIONARY_TABLE_NAME);
		Cursor c = qb.query(readableDatabase, null, null, null, null, null,
				null);
		return c;
	}

	private void initDatabase() {
		SQLiteDatabase db = dbHelper.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(DictionaryOpenHelper.KEY_WORD, "Love");
		values.put(DictionaryOpenHelper.KEY_DEFINITION, "Where is Love?");
		db.insert(DictionaryOpenHelper.DICTIONARY_TABLE_NAME,
				null, values);
	}

	@Override
	protected void onDestroy() {
		if (mCursor != null) {
			mCursor.close();
		}
		super.onDestroy();
	}
}
