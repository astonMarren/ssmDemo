package com.jshx.selfTest.io;

import java.net.Socket;
import java.util.Date;

public class Client {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("127.0.0.1", 6379);
		socket.getOutputStream().write((new Date() + ": james nb").getBytes());
		socket.close();
	}
}
