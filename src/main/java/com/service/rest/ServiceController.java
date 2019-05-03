package com.service.rest;
import javax.ws.rs.GET;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ServiceController {
	@GET
	@RequestMapping("/microservice")
	@ResponseBody
	public String getZipkin() throws Exception{
		return "Microsevice Up and Running";
	}
}
