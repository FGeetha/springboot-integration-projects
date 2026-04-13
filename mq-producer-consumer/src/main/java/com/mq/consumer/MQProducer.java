package com.mq.consumer;

import javax.jms.ConnectionFactory;
import javax.jms.Connection;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MQProducer {

    public static void main(String[] args) {

        String brokerURL = "tcp://localhost:61616";
        String queueName = "MY.TEST.QUEUE";

        try {
            // 1. Create Connection Factory
            ConnectionFactory factory =
                    new ActiveMQConnectionFactory("admin", "admin", brokerURL);

            // 2. Create Connection
            Connection connection = factory.createConnection();
            connection.start();

            // 3. Create Session
            Session session =
                    connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            // 4. Create Queue
            Queue queue = session.createQueue(queueName);

            // 5. Create Producer
            MessageProducer producer = session.createProducer(queue);

            // 6. Create Message
            TextMessage message =
                    session.createTextMessage("Hello from Producer1 :)");

            // 7. Send Message
            producer.send(message);

            System.out.println("Message Sent Successfully!");

            // 8. Close Resources
            producer.close();
            session.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
