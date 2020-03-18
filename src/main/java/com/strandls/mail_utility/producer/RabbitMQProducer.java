package com.strandls.mail_utility.producer;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;

public class RabbitMQProducer {

	private Channel channel;

	public RabbitMQProducer(Channel channel) {
		this.channel = channel;
	}

	public void produceMail(String exchange, String routingKey, BasicProperties properties, String message)
			throws IOException, TimeoutException {
		channel.basicPublish(exchange, routingKey, properties, message.getBytes("UTF-8"));
	}
	
	public void produceNotification(String exchange, String routingKey, BasicProperties properties, String message)
			throws IOException, TimeoutException {
		channel.basicPublish(exchange, routingKey, properties, message.getBytes("UTF-8"));
	}

}
