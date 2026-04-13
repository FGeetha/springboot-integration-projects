package com.mq.consumer2;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MQProducer2 {

    public static void main(String[] args) {

        String brokerURL = "tcp://localhost:61616";
        String queueName = "MY.TEST.QUEUE";

        Connection connection = null;
        Session session = null;
        MessageProducer producer = null;

        try {

            ConnectionFactory factory =
                    new ActiveMQConnectionFactory("admin", "admin", brokerURL);

            connection = factory.createConnection();

            // NOTE: Producer does NOT require connection.start()

            session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

            Queue queue = session.createQueue(queueName);

            producer = session.createProducer(queue);

            TextMessage message =
                    session.createTextMessage("Message from Producer");

            producer.send(message);

            System.out.println("Message Sent Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (producer != null) producer.close(); } catch (Exception e) {}
            try { if (session != null) session.close(); } catch (Exception e) {}
            try { if (connection != null) connection.close(); } catch (Exception e) {}
        }
    }
}




