package com.example.bootdockerimgviapom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Democontroller {
	
	
	@RequestMapping("/app")
	  public String home() {
	    return "Image created from Maven Build";
	  }

}
