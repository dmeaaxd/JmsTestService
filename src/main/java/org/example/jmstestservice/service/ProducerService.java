package org.example.jmstestservice.service;

import jakarta.jms.Queue;
import jakarta.jms.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String text) {
        jmsTemplate.send("queue", s -> s.createTextMessage(text));
    }
}
