package org.citas.bluelinklib.android;

import android.content.Context;

import org.citas.bluelinklib.util.DemoLogger;

public abstract class AndroidBridgeImpl {
	protected static final DemoLogger OLog = DemoLogger.getInstance();
	protected Context _context = null;
	// Override-able
	public boolean isReady() {
		if (_context == null) {
			return false;
		}
		return true;
	}
}
