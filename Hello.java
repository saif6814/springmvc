package com.cts.Amir;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class Hello {	
	  	     @RequestMapping("/hello")
		 String hello() {
			 return "hello";
		 }
}
