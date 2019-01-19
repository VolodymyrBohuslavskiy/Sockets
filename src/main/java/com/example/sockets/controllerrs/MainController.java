package com.example.sockets.controllerrs;

import com.example.sockets.models.InputModel;
import com.example.sockets.models.OutputModel;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @MessageMapping("msg")// it is "/allDestinationPrefix/msg"
    @SendTo("/chanelNameForListening")
    public OutputModel greeting(InputModel inputModel) {
        return new OutputModel(inputModel);
    }
}

