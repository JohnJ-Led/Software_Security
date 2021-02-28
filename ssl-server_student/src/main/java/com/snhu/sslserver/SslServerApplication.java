package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{
    @RequestMapping("/hash")
    public String myHash(){
    	//Set Value
    	String data = "John Ledbetter";
    	//Initiate Hash Class
    	HashCheck myCheck = new HashCheck(data);
    	//return output
        return myCheck.getMessage();
    }
}
