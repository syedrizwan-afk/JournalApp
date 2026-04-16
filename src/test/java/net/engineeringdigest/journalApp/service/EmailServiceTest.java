package net.engineeringdigest.journalApp.service;

import org.springframework.boot.test.context.SpringBootTest;
import net.engineeringdigest.journalApp.Service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail (){
        emailService.sendEmail(
                "rizz62411@gmail.com",
                "Testing Java Mail sender",
                "Sab Changa Siii??"
                );
    }
}
