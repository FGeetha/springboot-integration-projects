package com.mq.consumer;
	import javax.jms.Connection;
	import javax.jms.ConnectionFactory;
	import javax.jms.Message;
	import javax.jms.MessageConsumer;
	import javax.jms.Session;
	import javax.jms.TextMessage;
	import javax.jms.Queue;

	import org.apache.activemq.ActiveMQConnectionFactory;

	public class MQConsumer {

	    public static void main(String[] args) {

	        String brokerURL = "tcp://localhost:61616"; // Default ActiveMQ port
	        String queueName = "MY.TEST.QUEUE";

	        try {
	            // 1. Create Connection Factory
	            ConnectionFactory factory = new ActiveMQConnectionFactory("admin", "admin", brokerURL);

	            // 2. Create Connection
	            Connection connection = factory.createConnection();
	            connection.start();

	            // 3. Create Session
	            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

	            // 4. Create Queue
	            Queue queue = session.createQueue(queueName);

	            // 5. Create Consumer
	            MessageConsumer consumer = session.createConsumer(queue);

	            System.out.println("Consumer1 Waiting for messages from queue: " + queueName);

	            // 6. Receive message
	            while (true) {
	                Message message = consumer.receive();

	                if (message instanceof TextMessage) {
	                    TextMessage textMessage = (TextMessage) message;
	                    System.out.println("Received: " + textMessage.getText());
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


