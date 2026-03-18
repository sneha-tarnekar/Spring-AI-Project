package com.spring.ai.demo.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ollama")
public class OllamaController {

    private ChatClient chatClient;

    public OllamaController(ChatClient.Builder builder,
                            @Qualifier("ollamaChatModel") ChatModel chatModel) {
        this.chatClient = ChatClient.create(chatModel);
    }

    @GetMapping("/chat")
    public ResponseEntity<String> chat(@RequestParam("query") String query) {
        String response = this.chatClient.prompt(query).call().content();
        return ResponseEntity.ok(response);
    }

}
