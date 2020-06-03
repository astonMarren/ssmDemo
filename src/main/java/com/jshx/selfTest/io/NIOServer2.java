package com.jshx.selfTest.io;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;

public class NIOServer2 {

	static ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[1024]);
	static ArrayList<SocketChannel> socketList = new ArrayList<SocketChannel>();
	public static void main(String[] args) throws Exception {
		ServerSocketChannel serverSocket = ServerSocketChannel.open();
		SocketAddress socketAddress = new InetSocketAddress("127.0.0.1",6379);
		serverSocket.bind(socketAddress);
		serverSocket.configureBlocking(false); //设置成非阻塞
		while (true) {
			for (SocketChannel socketChannel : socketList) {
				int read = socketChannel.read(byteBuffer);
				if (read > 0) {
					System.out.println("read------" + read);
					byteBuffer.flip();
					byte[] bs = new byte[read];
					byteBuffer.get(bs);
					String content = new String(bs);
					System.out.println(content);
					byteBuffer.flip();
				}
			}
			SocketChannel clientSocket = serverSocket.accept();
			if (clientSocket != null) {
				System.out.println("connection success!");
				clientSocket.configureBlocking(false);
				socketList.add(clientSocket);
				System.out.println("socketList size = " + socketList.size());
			}
		}
	}

}
