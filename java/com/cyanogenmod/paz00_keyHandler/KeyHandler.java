package com.cyanogenmod.paz00kh;

import android.util.Log;
import android.view.KeyEvent;

import com.android.internal.os.DeviceKeyHandler;


public final class KeyHandler implements DeviceKeyHandler {
	private static final String TAG = "paz00_KeyHandler";

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
