package sk.dominanz.kontaktnyFormular.service;

public interface EmailSenderService {
    void sendEmail(String email, String subject, String message, String phone, String name);
}
