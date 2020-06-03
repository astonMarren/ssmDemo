package com.jshx.selfTest.io;

import java.net.Socket;
import java.util.Date;

/**
 * 
* @ClassName: IOClient
* @Description: IO客户端
* @author Wangjiteng
* @date 2020年4月7日 下午4:33:26
*
 */
public class IOClient {
	public static void main(String[] args) {
		new Thread(()->{
			try {
				Socket socket = new Socket("127.0.0.1", 6379);
				while(true){
					socket.getOutputStream().write((new Date() + ": james nb").getBytes());
					Thread.sleep(2000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
	}
}
