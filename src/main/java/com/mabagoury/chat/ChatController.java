package com.mabagoury.chat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {

    private MessageService messageService;

    public ChatController(MessageService messageService){
        this.messageService=messageService;
    }

    @GetMapping("/chat")
    public String getChat(@ModelAttribute("chatForm") ChatForm chatForm, Model model){
        model.addAttribute("messages", messageService.getMessages());
        return "chat";
    }

    @PostMapping("/chat")
    public String postChat(@ModelAttribute("chatForm") ChatForm chatForm, Model model){
        messageService.addMessage(new ChatMessage(chatForm.getUsername(),chatForm.getMessageText(),chatForm.getMessageType()));
        model.addAttribute("messages", messageService.getMessages());
        chatForm.reset();
        return "chat";
    }

}
