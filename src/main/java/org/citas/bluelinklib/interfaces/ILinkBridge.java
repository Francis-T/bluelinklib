package org.citas.bluelinklib.interfaces;

public interface ILinkBridge extends IFeatureBridge {
	public int STATUS_FAILED = -1;
	public int STATUS_OK = 0;

	public int initialize(Object initObject);
	public int connectByAddress(String address);
	public int connectByName(String name);
	public int broadcast(byte[] data);
	public int destroy();
	public int setEventHandler(BluetoothEventHandler eventHandler);
}
