package com.strandls.mail_utility.producer;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.rabbitmq.client.AMQP.BasicProperties;
import com.rabbitmq.client.Channel;

public class RabbitMQProducer {

	private Channel channel;

	public RabbitMQProducer(Channel channel) {
		this.channel = channel;
	}

	public void produceMail(String exchange, String routingKey, BasicProperties properties, String message)
			throws IOException {
		channel.basicPublish(exchange, routingKey, properties, message.getBytes(StandardCharsets.UTF_8));
	}
	
	public void produceNotification(String exchange, String routingKey, BasicProperties properties, String message)
			throws IOException {
		channel.basicPublish(exchange, routingKey, properties, message.getBytes(StandardCharsets.UTF_8));
	}

}
