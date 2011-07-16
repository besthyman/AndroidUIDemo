package com.hyman.demo.android.ui.dialog.custom;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.hyman.demo.android.ui.R;

public class CustomDialogActivity extends Activity {

	private static final String TAG = "CustomDialogActivity";

	static final int DIALOG_CUSTOM_ID = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_custom);
	}

	private void initListener(Dialog dialog) {

		if (dialog != null) {
			Log.d(TAG, dialog.toString());
			dialog.setOnCancelListener(new DialogInterface.OnCancelListener() {

				@Override
				public void onCancel(DialogInterface dialog) {
					Log.d(TAG, "onCancel");
					Log.d(TAG, dialog.toString());
				}

			});
			dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {

				@Override
				public void onDismiss(DialogInterface dialog) {
					Log.d(TAG, "onDismiss");
					Log.d(TAG, dialog.toString());
				}

			});
			dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {

				@Override
				public boolean onKey(DialogInterface dialog, int keyCode,
						KeyEvent event) {
					Log.d(TAG, "onKey");
					Log.d(TAG, dialog.toString());
					return false;
				}

			});
			dialog.setOnShowListener(new DialogInterface.OnShowListener() {

				@Override
				public void onShow(DialogInterface dialog) {
					Log.d(TAG, "onShow");
					Log.d(TAG, dialog.toString());
				}

			});
		}
	}

	protected Dialog onCreateDialog(int id) {
		Dialog dialog = null;
		switch (id) {
		case DIALOG_CUSTOM_ID: {
			dialog = new Dialog(this);
			final Dialog mydialog = dialog;

			dialog.setContentView(R.layout.dialog_custom_dialog);
			dialog.setTitle("Custom Dialog");

			TextView text = (TextView) dialog.findViewById(R.id.text);
			text.setText("Hello, this is a custom dialog!");

			ImageView image = (ImageView) dialog.findViewById(R.id.image);
			image.setImageResource(R.drawable.icon);

			Button dismissButton = (Button) dialog
					.findViewById(R.id.dismissButton);
			dismissButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Log.d(TAG, "dismissButton onClick");
					mydialog.dismiss();
				}
			});

			Button cancelButton = (Button) dialog
					.findViewById(R.id.cancelButton);
			cancelButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					Log.d(TAG, "cancelButton onClick");
					mydialog.cancel();
				}
			});

			initListener(dialog);
		}
		}
		return dialog;
	}

	public void showCustomDialog(View src) {
		showDialog(DIALOG_CUSTOM_ID);
	}

	public void onPrepareDialog(int id, Dialog dialog) {
		Log.d(TAG, "onPrepareDialog");
		Log.d(TAG, dialog.toString());
	}

	public void removeCustomDialog(View src) {
		Log.d(TAG, "removeCustomDialog");
		removeDialog(DIALOG_CUSTOM_ID);
	}

	public void dismissCustomDialog(View src) {
		Log.d(TAG, "dismissCustomDialog");
		dismissDialog(DIALOG_CUSTOM_ID);
	}
}
