package com.hyman.demo.android.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

import com.hyman.demo.android.ui.dialog.alert.AlertDialogActivity;
import com.hyman.demo.android.ui.dialog.date.DatePickerActivity;
import com.hyman.demo.android.ui.dialog.date.TimePickerActivity;
import com.hyman.demo.android.ui.layout.absolute.AbsoluteLayoutActivity;
import com.hyman.demo.android.ui.layout.frame.FrameLayoutActivity;
import com.hyman.demo.android.ui.layout.linear.LinearLayoutActivity;
import com.hyman.demo.android.ui.layout.linear.LinearLayoutNestedActivity;
import com.hyman.demo.android.ui.layout.relative.RelativeLayout2Activity;
import com.hyman.demo.android.ui.layout.relative.RelativeLayoutActivity;
import com.hyman.demo.android.ui.layout.table.TableLayoutActivity;
import com.hyman.demo.android.ui.widget.button.ButtonAllActivity;
import com.hyman.demo.android.ui.widget.button.ButtonStatesActivity;
import com.hyman.demo.android.ui.widget.list.ListViewActivity;
import com.hyman.demo.android.ui.widget.list.MyHeaderFooterListActivity;
import com.hyman.demo.android.ui.widget.list.MyLayoutListActivity;
import com.hyman.demo.android.ui.widget.list.MyListActivity;
import com.hyman.demo.android.ui.widget.list.MyListRowActivity;
import com.hyman.demo.android.ui.widget.list.adapter.MyListAdapterActivity;
import com.hyman.demo.android.ui.widget.list.adapter.MyListImprovedAdapterActivity;
import com.hyman.demo.android.ui.widget.list.cursor.MySimpleCursorAdapterListActivity;
import com.hyman.demo.android.ui.widget.list.model.ModelListActivity;
import com.hyman.demo.android.ui.widget.list.selection.MySingleListActivity;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onLayoutButtonClick(View src) {
		Spinner spinner = (Spinner) this.findViewById(R.id.layoutspinner);
		String value = spinner.getSelectedItem().toString();
		if ("absolute layout".equals(value)) {
			Intent intent = new Intent(this, AbsoluteLayoutActivity.class);
			this.startActivity(intent);
		} else if ("frame layout".equals(value)) {
			Intent intent = new Intent(this, FrameLayoutActivity.class);
			this.startActivity(intent);
		} else if ("linear layout".equals(value)) {
			Intent intent = new Intent(this, LinearLayoutActivity.class);
			this.startActivity(intent);
		} else if ("linear layout nested".equals(value)) {
			Intent intent = new Intent(this, LinearLayoutNestedActivity.class);
			this.startActivity(intent);
		} else if ("relative layout".equals(value)) {
			Intent intent = new Intent(this, RelativeLayoutActivity.class);
			this.startActivity(intent);
		} else if ("relative layout 2".equals(value)) {
			Intent intent = new Intent(this, RelativeLayout2Activity.class);
			this.startActivity(intent);
		} else if ("table layout".equals(value)) {
			Intent intent = new Intent(this, TableLayoutActivity.class);
			this.startActivity(intent);
		}
	}

	public void onWidgetButtonButtonClick(View src) {
		Spinner spinner = (Spinner) this.findViewById(R.id.widgetbuttonspinner);
		String value = spinner.getSelectedItem().toString();
		if ("Button States".equals(value)) {
			Intent intent = new Intent(this, ButtonStatesActivity.class);
			this.startActivity(intent);
		} else if ("Button All".equals(value)) {
			Intent intent = new Intent(this, ButtonAllActivity.class);
			this.startActivity(intent);
		}
	}

	public void onWidgetListButtonClick(View src) {
		Spinner spinner = (Spinner) this.findViewById(R.id.widgetlistspinner);
		String value = spinner.getSelectedItem().toString();
		if ("List Activity".equals(value)) {
			Intent intent = new Intent(this, MyListActivity.class);
			this.startActivity(intent);
		} else if ("MyLayoutListActivity".equals(value)) {
			Intent intent = new Intent(this, MyLayoutListActivity.class);
			this.startActivity(intent);
		} else if ("List Row Activity".equals(value)) {
			Intent intent = new Intent(this, MyListRowActivity.class);
			this.startActivity(intent);
		} else if ("List Adapter Activity".equals(value)) {
			Intent intent = new Intent(this, MyListAdapterActivity.class);
			this.startActivity(intent);
		} else if ("List Improved Adapter Activity".equals(value)) {
			Intent intent = new Intent(this, MyListImprovedAdapterActivity.class);
			this.startActivity(intent);
		} else if ("Model List Activity".equals(value)) {
			Intent intent = new Intent(this, ModelListActivity.class);
			this.startActivity(intent);
		} else if ("List Single Activity".equals(value)) {
			Intent intent = new Intent(this, MySingleListActivity.class);
			this.startActivity(intent);
		}  else if ("List HeaderFooter Activity".equals(value)) {
			Intent intent = new Intent(this, MyHeaderFooterListActivity.class);
			this.startActivity(intent);
		} else if ("List View".equals(value)) {
			Intent intent = new Intent(this, ListViewActivity.class);
			this.startActivity(intent);
		} else if ("Cursor Adapter".equals(value)) {
			Intent intent = new Intent(this, MySimpleCursorAdapterListActivity.class);
			this.startActivity(intent);
		}
	}

	public void onDialogButtonClick(View src) {
		Spinner spinner = (Spinner) this.findViewById(R.id.dialogspinner);
		String value = spinner.getSelectedItem().toString();
		if ("Alert".equals(value)) {
			Intent intent = new Intent(this, AlertDialogActivity.class);
			this.startActivity(intent);
		} else if ("Date".equals(value)) {
			Intent intent = new Intent(this, DatePickerActivity.class);
			this.startActivity(intent);
		} else if ("Time".equals(value)) {
			Intent intent = new Intent(this, TimePickerActivity.class);
			this.startActivity(intent);
		}
	}
}