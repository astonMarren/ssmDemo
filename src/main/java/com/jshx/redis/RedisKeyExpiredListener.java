package com.jshx.redis;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class RedisKeyExpiredListener implements MessageListener {
	public void onMessage(Message message, byte[] pattern) {
		System.out.println("channel:" + new String(message.getChannel()) + ",message:" + new String(message.getBody()));
	}
}
