package org.example.jmstestservice.service;

import org.example.jmstestservice.dto.MessageDTO;
import org.example.jmstestservice.dto.TopUpDTO;
import org.example.jmstestservice.dto.WriteOffDTO;
import org.example.jmstestservice.dto.DifficultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendText(String text) {
        jmsTemplate.convertAndSend("Notifications", text);
    }

    public void sendObject(DifficultObject difficultObject) {
        jmsTemplate.convertAndSend("Payments", difficultObject);
    }

    public void sendTopUp(TopUpDTO topUpDTO) {
        jmsTemplate.convertAndSend("topUpQueue", topUpDTO);
    }

    public void sendWriteOff(WriteOffDTO writeOffDTO) {
        jmsTemplate.convertAndSend("writeOffQueue", writeOffDTO);
    }

    public void sendNotification(MessageDTO messageDTO) {
        jmsTemplate.convertAndSend("notificationQueue", messageDTO);
    }
}
