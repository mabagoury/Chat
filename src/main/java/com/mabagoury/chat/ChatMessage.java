package com.mabagoury.chat;

public class ChatMessage {

    private String user;
    private String text;
    private String type;

    public ChatMessage(String user, String text, String type) {
        this.user = user;
        if(type=="Shout")
            this.text=text.toUpperCase();
        else if(type=="Whisper")
            this.text=text.toLowerCase();
        else
            this.text = text;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
