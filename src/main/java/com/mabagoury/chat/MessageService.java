package com.mabagoury.chat;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    public List<ChatMessage> chatMessages;

    public MessageService(List<ChatMessage> chatMessages){
        this.chatMessages=chatMessages;
    }

    public void addMessage(ChatMessage chatMessage){
        chatMessages.add(chatMessage);
    }

    public List<ChatMessage> getMessages(){
        return new ArrayList(this.chatMessages);
    }

}
