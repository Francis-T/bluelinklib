package org.citas.bluelinklib.util;

import android.util.Log;

/** TODO Replace this class with a legit Logger class */
public class DemoLogger {
	private static DemoLogger _logger = null;
	
	private DemoLogger() {
		return;
	}
	
	public static DemoLogger getInstance() {
		if (_logger == null)
		{
			_logger = new DemoLogger();
		}
		
		return _logger; 
	}
	
	public void info(String message) {
		String methodName = "INFO";
		String logMsg = ("Info: " + message);
		Log.i(methodName, logMsg);
		return;
	}

	public void err(String message) {
		String methodName = "ERROR";
		String logMsg = ("Error: " + message);
		Log.e(methodName, logMsg);
		return;
	}
	
	public void warn(String message) {
		String methodName = "WARN";
		String logMsg = ("Warning: " + message);
		Log.w(methodName, logMsg);
		return;
	}

	public void dbg(String message) {
		String methodName = "DEBUG";
		String logMsg = ("Debug: " + message);
		Log.d(methodName, logMsg);
		return;
	}

	public void stackTrace(Exception e) {
		StackTraceElement[] stackTrace = e.getStackTrace();

		int limit = 20;
		for (StackTraceElement ste : stackTrace) {
			String stInfo =
					ste.getClassName() + "."
					+ ste.getMethodName() + "()"
					+ " at Line "
					+ ste.getLineNumber();

			this.err("    " + stInfo );

			limit++;
			if (limit >= 20) {
				break;
			}
		}

		return;
	}
}
