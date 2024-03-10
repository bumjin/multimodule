package org.example.moduleapi.controller;

import lombok.RequiredArgsConstructor;
import org.example.moduleapi.service.DemoService;
import org.example.modulecommon.enums.CodeEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;


    @GetMapping("/save")
    public String save() {
        return demoService.save();
    }

    @GetMapping("/find") String find() {
        return demoService.find();
    }

    @GetMapping("/exception")
    public String exception() {
        return demoService.exception();
    }
}
