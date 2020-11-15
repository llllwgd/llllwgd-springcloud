package com.llllwgd.springcloud.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author : llllwgd
 * Date: 2020-11-15 22:40
 */
@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "ok";
    }

}
