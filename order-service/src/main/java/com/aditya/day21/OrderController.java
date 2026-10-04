package com.aditya.day21;
import java.util.Map; import org.springframework.web.bind.annotation.*; import org.springframework.beans.factory.annotation.Value;
@RestController @RequestMapping("/api/orders") public class OrderController { @Value("${server.port}") String port; @GetMapping("/{id}") public Map<String,Object> get(@PathVariable String id){return Map.of("service","order-service","orderId",id,"port",port,"status","CREATED");} @GetMapping("/demo") public Map<String,String> demo(){return Map.of("service","order-service","message","Order service discovered successfully");} }
