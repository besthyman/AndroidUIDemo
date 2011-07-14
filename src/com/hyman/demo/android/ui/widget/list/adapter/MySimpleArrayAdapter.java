package com.hyman.demo.android.ui.widget.list.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hyman.demo.android.ui.R;

public class MySimpleArrayAdapter extends ArrayAdapter<String> {
	private final Activity context;
	private final String[] names;

	public MySimpleArrayAdapter(Activity context, String[] names) {
		super(context, R.layout.widget_list_row, names);
		this.context = context;
		this.names = names;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		View rowView = inflater.inflate(R.layout.widget_list_row, null, true);
		TextView textView = (TextView) rowView.findViewById(R.id.label);
		ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
		textView.setText(names[position]);
		// Change the icon for Windows and iPhone
		String s = names[position];
		if (s.startsWith("Windows7") || s.startsWith("iPhone")
				|| s.startsWith("Solaris")) {

			imageView.setImageResource(R.drawable.no);
		} else {
			imageView.setImageResource(R.drawable.ok);
		}

		return rowView;
	}
}

