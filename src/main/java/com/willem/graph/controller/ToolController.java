package com.willem.graph.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: willem
 * @create: 2020/11/28 02:33
 * @description:
 */
@RestController
@RequestMapping("/tool")
public class ToolController {

    @GetMapping("")
    public Object test(){
        return "ok";
    }
}
