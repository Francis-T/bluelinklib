package org.citas.bluelinklib.interfaces;

public interface IFeatureBridge {
	public String getId();
	public String getPlatform();
	public boolean isReady();
	public int initialize(Object initObject);
}
