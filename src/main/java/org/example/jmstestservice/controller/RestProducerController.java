package org.example.jmstestservice.controller;

import lombok.AllArgsConstructor;
import org.example.jmstestservice.dto.MessageDTO;
import org.example.jmstestservice.dto.TopUpDTO;
import org.example.jmstestservice.dto.WriteOffDTO;
import org.example.jmstestservice.dto.DifficultObject;
import org.example.jmstestservice.service.ProducerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class RestProducerController {
    private ProducerService producerService;

    @PostMapping("/sendText")
    public ResponseEntity<?> sendText(@RequestParam String text) {
        Map<String, String> response = new HashMap<>();

        producerService.sendText(text);

        response.put("result", "Сообщение отправлено");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/sendObject")
    public ResponseEntity<?> sendObject(@RequestBody DifficultObject difficultObject) {
        Map<String, String> response = new HashMap<>();

        producerService.sendObject(difficultObject);

        response.put("result", "Сообщение отправлено");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/sendTopUp")
    public ResponseEntity<?> sendTopUp(@RequestBody TopUpDTO topUpDTO) {
        Map<String, String> response = new HashMap<>();

        producerService.sendTopUp(topUpDTO);

        response.put("result", "Сообщение отправлено");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/sendWriteOff")
    public ResponseEntity<?> sendWriteOff(@RequestBody WriteOffDTO writeOffDTO) {
        Map<String, String> response = new HashMap<>();

        producerService.sendWriteOff(writeOffDTO);

        response.put("result", "Сообщение отправлено");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/sendNotification")
    public ResponseEntity<?> sendNotification(@RequestBody MessageDTO messageDTO) {
        Map<String, String> response = new HashMap<>();

        producerService.sendNotification(messageDTO);

        response.put("result", "Сообщение отправлено");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
