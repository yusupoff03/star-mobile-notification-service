package com.example.sofiyanotificationservice.controller;

import com.example.sofiyanotificationservice.controller.dto.MailDto;
import com.example.sofiyanotificationservice.service.MailSendingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class MailSendingController {
    private final MailSendingService mailSendingService;

    @PostMapping("/send-single")
    public void sendMessage(@RequestBody MailDto mailDto){
        mailSendingService.sendMessage(mailDto);
    }
}
