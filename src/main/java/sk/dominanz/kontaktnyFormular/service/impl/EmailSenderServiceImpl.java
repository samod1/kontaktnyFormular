package sk.dominanz.kontaktnyFormular.service.impl;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import sk.dominanz.kontaktnyFormular.service.EmailSenderService;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

    private final JavaMailSender mailSender;

    public EmailSenderServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(String email,String subject, String message, String phone, String name) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom("no-reply@samod.sk");
        simpleMailMessage.setTo("samuel.domin@dominanz.sk");
        simpleMailMessage.setReplyTo(email);
        simpleMailMessage.setSubject("Kontaktny formular doMail - " + subject);
        simpleMailMessage.setText("Meno: "+ name + "\nEmailova adresa: " + email +"\nTelefonne cislo: "+ phone  +  "\nSprava: "+ message);

        this.mailSender.send(simpleMailMessage);
    }
}