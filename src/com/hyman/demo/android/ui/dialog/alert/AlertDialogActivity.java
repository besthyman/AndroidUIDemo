package com.hyman.demo.android.ui.dialog.alert;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import com.hyman.demo.android.ui.R;

public class AlertDialogActivity extends Activity {
	static final int DIALOG_PAUSED_ID = 0;
	static final int DIALOG_GAMEOVER_ID = 1;
	static final int DIALOG_ALERT_LIST_ID = 2;
	static final int DIALOG_ALERT_CHECKBOX_ID = 3;
	static final int DIALOG_ALERT_RADIO_ID = 4;
	static final int DIALOG_ALERT_MESSAGE_ID = 5;
	private static final String TAG = "AlertDialogActivity";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_alert);
	}

	protected Dialog onCreateDialog(int id) {
		Dialog dialog;
		switch (id) {
		case DIALOG_PAUSED_ID: {
			Log.d(TAG, "DIALOG_PAUSED_ID");
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setMessage("Are you sure you want to exit?")
					.setCancelable(false)
					.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									AlertDialogActivity.this.finish();
								}
							})
					.setNegativeButton("No",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
										int id) {
									dialog.cancel();
								}
							});
			AlertDialog alert = builder.create();
			dialog = alert;
		}
			break;
		case DIALOG_ALERT_LIST_ID: {
			final CharSequence[] items = { "Red", "Green", "Blue" };
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Pick a color");
			builder.setItems(items, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int which) {
					Log.d(TAG, "DIALOG_ALERT_LIST_ID, " + items[which].toString());
				}
			});
			AlertDialog alert = builder.create();
			dialog = alert;
		}
			break;
		case DIALOG_ALERT_CHECKBOX_ID: {
			final CharSequence[] items = {"Red", "Green", "Blue"};
			boolean[] checkeds = {true, false, true};

			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Pick a color");
			builder.setMultiChoiceItems(items, checkeds, new DialogInterface.OnMultiChoiceClickListener() {
				@Override
				public void onClick(DialogInterface dialog, int which,
						boolean isChecked) {
					Log.d(TAG, "DIALOG_ALERT_CHECKBOX_ID, " + items[which].toString() + "," + isChecked);
					
				}
			});
			builder.setPositiveButton("Yes",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int id) {
							dialog.dismiss();
						}
					})
			.setNegativeButton("No",
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int id) {
							dialog.cancel();
						}
					});
			AlertDialog alert = builder.create();
			dialog = alert;
		}
			break;
		case DIALOG_ALERT_RADIO_ID: {
			final CharSequence[] items = {"Red", "Green", "Blue"};

			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("Pick a color");
			builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
			    public void onClick(DialogInterface dialog, int which) {
					Log.d(TAG, "DIALOG_ALERT_RADIO_ID, " + items[which].toString());
			    }
			});
			AlertDialog alert = builder.create();
			dialog = alert;
		}
			break;
			 case DIALOG_ALERT_MESSAGE_ID:{
				 AlertDialog.Builder builder = new AlertDialog.Builder(this);
					builder.setTitle("Pick a color");
					builder.setMessage("Message....");
					AlertDialog alert = builder.create();
					dialog = alert;
			 }
			 break;
		// case DIALOG_GAMEOVER_ID:
		// // do the work to define the game over Dialog
		// break;
		default:
			dialog = null;
		}
		if (dialog != null) {
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
		return dialog;
	}


	public void showAlertDialog(View src) {
		showDialog(DIALOG_PAUSED_ID);
	}
	
	public void showAlertListDialog(View src) {
		showDialog(DIALOG_ALERT_LIST_ID);
	}

	public void showAlertCheckboxDialog(View src) {
		showDialog(DIALOG_ALERT_CHECKBOX_ID);
	}

	public void showAlertRadioDialog(View src) {
		showDialog(DIALOG_ALERT_RADIO_ID);
	}

	public void showAlertMessageDialog(View src) {
		showDialog(DIALOG_ALERT_MESSAGE_ID);
	}
	
	public void onPrepareDialog(int id, Dialog dialog) {
		Log.d(TAG, "onPrepareDialog");
		Log.d(TAG, dialog.toString());
	}

}
