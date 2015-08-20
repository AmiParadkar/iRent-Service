package com.wrox.beginspring.pix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AppController {
	 @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String NewFile() {
        return "greeting";
    }
}
