package com.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class MyController {

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public String getData1() {
		System.out.println("get default");
		return "hi";
	}

	@GetMapping("/get/{id}")
	public String getData1(@PathVariable("id") String id) {
		System.out.println("get " + id);
		return id.toString();
	}

	@GetMapping("/get?id=10")
	public String getData2(@RequestParam("id") String id) {
		System.out.println("get " + id);
		return id.toString();
	}

	@PostMapping("/post")
	public void postData(@RequestBody String id) {
		System.out.println("post");
	}

	@PutMapping("/put")
	public void putData() {
		System.out.println("put");
	}

	@PatchMapping("/patch")
	public void patchData() {
		System.out.println("patch");
	}

}
