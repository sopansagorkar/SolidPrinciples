package com.test.dip;

public class MyMessanger {

	TCPProtocolHandler handler = new TCPProtocolHandler();

	public void send(String to, String message) {
		handler.sendMessage("Message to " + message);
	}

}
