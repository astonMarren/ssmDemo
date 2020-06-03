package com.jshx.selfTest.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 
* @ClassName: IOServer
* @Description: IO服务端
* @author Wangjiteng
* @date 2020年4月7日 下午4:38:33
*
 */
public class IOServer {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(3333);
		new Thread(()->{
			while(true){
				try {
					//阻塞方法获取新的连接
					 Socket	socket = serverSocket.accept();
					// 每一个新的连接都创建一个线程，负责读取数据
					 new Thread(()->{
						 int len;
					     byte[] data = new byte[1024];
					     try {
							InputStream inputStream = socket.getInputStream();
							// 按字节流方式读取数据
					        while ((len = inputStream.read(data)) != -1) {
					            System.out.println(new String(data, 0, len));
					        }
						} catch (IOException e) {
							e.printStackTrace();
						}

					 }).start();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

}
