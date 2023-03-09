package sk.dominanz.kontaktnyFormular.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import sk.dominanz.kontaktnyFormular.model.EmailMessage;
import sk.dominanz.kontaktnyFormular.service.EmailSenderService;

@RestController
public class EmailController {

    private final EmailSenderService emailSenderService;

    public EmailController(EmailSenderService emailSenderService) {
        this.emailSenderService = emailSenderService;
    }

    @CrossOrigin
    @PostMapping("/send-email")
    public ResponseEntity sendEmail(@RequestBody EmailMessage emailMessage) {
        this.emailSenderService.sendEmail(emailMessage.getEmail(), emailMessage.getSubject(), emailMessage.getMessage(), emailMessage.getPhone(),emailMessage.getName());
        return ResponseEntity.ok("Success");
    }
}