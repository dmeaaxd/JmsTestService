package org.example.jmstestservice.service;

import org.example.jmstestservice.enums.Queues;
import org.example.jmstestservice.objects.DifficultObject;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @JmsListener(destination = "Notifications", containerFactory = "jmsListenerContainerFactory")
    public void receiveText(String text) {
        System.out.println("Received text <" + text + ">");
    }

    @JmsListener(destination = "Payments", containerFactory = "jmsListenerContainerFactory")
    public void receiveObject(DifficultObject difficultObject) {
        System.out.println("Received object <" + difficultObject + ">");
    }
}
