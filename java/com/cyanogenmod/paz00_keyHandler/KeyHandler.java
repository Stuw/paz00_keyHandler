package com.cyanogenmod.paz00kh;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;

import com.android.internal.os.DeviceKeyHandler;


public final class KeyHandler implements DeviceKeyHandler {
	private static final String TAG = "paz00_KeyHandler";

	private final Context mContext;
	private final Intent mSettingsIntent;

	public KeyHandler(Context context) {
		mContext = context;

		mSettingsIntent = new Intent(Intent.ACTION_MAIN, null);
		mSettingsIntent.setAction(Settings.ACTION_SETTINGS);
		mSettingsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
				| Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
	}

	@Override
	public boolean handleKeyEvent(KeyEvent event) {

		Log.d(TAG, "KeyEvent: action=" + event.getAction()
				+ ", flags=" + event.getFlags()
				+ ", canceled=" + event.isCanceled()
				+ ", keyCode=" + event.getKeyCode()
				+ ", deviceId=" + event.getDeviceId()
				+ ", scanCode=" + event.getScanCode()
				+ ", metaState=" + event.getMetaState()
				+ ", repeatCount=" + event.getRepeatCount());

		return false;
	}
}
