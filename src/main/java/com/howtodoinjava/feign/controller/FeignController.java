package com.howtodoinjava.feign.controller;

import com.howtodoinjava.feign.client.AccountFeignClient;
import com.howtodoinjava.feign.client.PostsFeignClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import org.springframework.beans.factory.annotation.Autowired;

//TODO : declare a rest controller
public class FeignController {

  private PostsFeignClient postsFeignClient;

  @Autowired
  private AccountFeignClient accountFeignClient;

  @Autowired
  public FeignController() {
    this.postsFeignClient = Feign.builder().decoder(new GsonDecoder())
        .target(PostsFeignClient.class,
            "https://jsonplaceholder.typicode.com/");
  }

  //TODO expose users data retrieved in Interface here using GetMapping
  //TODO expose photos retrieved in Interface here using GetMapping
  //TODO expose users by Id (filter) retrieved in Interface here using GetMapping


}
