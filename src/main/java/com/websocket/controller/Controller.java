package com.websocket.controller;

import com.websocket.server.WebSocketServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * <h3>Controller  Class</h3>
 *
 * @author : YuXiang
 * @date : 2019-08-12 16:59
 **/
@RestController
public class Controller {

    //给客户端推消息
    @GetMapping("/send/{message}")
    public void send(@PathVariable String message){
        try {
            WebSocketServer.sendInfo(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
