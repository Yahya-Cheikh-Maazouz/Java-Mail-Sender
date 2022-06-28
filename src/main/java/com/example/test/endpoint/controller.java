package com.example.test.endpoint;

import com.example.test.mail.EmailService;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {

    private final EmailService emailService;

    public controller(EmailService emailService) {
        this.emailService = emailService;
    }



    @GetMapping(path = "/confirm")
    public void confirm() {
        String mail= emailService.buildEmail("yahya","http:localhost:22222");
        emailService.sendEmail("yahya9bamba@gmail.com", mail);
    }
}
