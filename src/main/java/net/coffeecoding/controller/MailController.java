package net.coffeecoding.controller;

import net.coffeecoding.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MailController {

   /* @Autowired
    public JavaMailSender emailSender;

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";
    }

   /* @GetMapping("/demo")
    public String showContactForm(Model model) {
        model.addAttribute("mail", new Mail());
        return "contact-form";
    }

    @PostMapping("/demo")
    public String sendMail(@ModelAttribute("mail") Mail mail, Model model) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(mail.getRecipient());
            message.setSubject(mail.getSubject());
            message.setText(mail.getContent());
            emailSender.send(message);
            model.addAttribute("success", "Your message has been sent.");
        } catch (Exception e) {
            model.addAttribute("error", "Some error occured.");
        }
        return "contact-form";
    }*/

    @GetMapping("/error")
    public String showErrorPage() {
        return "error-page";
    }
}