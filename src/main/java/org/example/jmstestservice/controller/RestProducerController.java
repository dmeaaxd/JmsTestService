package org.example.jmstestservice.controller;

import lombok.AllArgsConstructor;
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

    @PostMapping("/send")
    public ResponseEntity<?> send(@RequestParam String text) {
        Map<String, String> response = new HashMap<>();

        producerService.send(text);

        response.put("result", "Сообщение отправлено");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
