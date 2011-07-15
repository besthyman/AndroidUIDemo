package com.hyman.demo.android.ui.dialog.progress;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.hyman.demo.android.ui.R;

public class ProgressActivity extends Activity {
	static final int DIALOG_PROCESS_ID = 1;
	static final int DIALOG_PROCESS__CANCELABLE_ID = 2;
	private static final String TAG = "ProgressActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_process);
	}

	protected Dialog onCreateDialog(int id) {
		Dialog dialog = null;
		switch (id) {
		case DIALOG_PROCESS_ID: {
			ProgressDialog progressDialog;
			progressDialog = new ProgressDialog(this);
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setMessage("Loading...");
			progressDialog.setCancelable(false);
			dialog = progressDialog;
		}
		break;

		case DIALOG_PROCESS__CANCELABLE_ID: {
			ProgressDialog progressDialog;
			progressDialog = new ProgressDialog(this);
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setTitle("title1");
			progressDialog.setMessage("Loading...");
			progressDialog.setCancelable(true);
			progressDialog.setMax(200);
			progressDialog.setProgress(100);
			dialog = progressDialog;
		}
		}
		return dialog;
	}
	
	public void showProcessDialog(View src) {
		Log.d(TAG, "showProcessDialog");
		showDialog(DIALOG_PROCESS_ID);
	}
	
	public void showProcessCancelableDialog(View src) {
		Log.d(TAG, "showProcessCancelableDialog");
		showDialog(DIALOG_PROCESS__CANCELABLE_ID);
	}
}
