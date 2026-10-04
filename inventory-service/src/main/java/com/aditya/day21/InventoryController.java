package com.aditya.day21;
import java.util.Map; import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/inventory") public class InventoryController { @GetMapping("/{sku}") public Map<String,Object> get(@PathVariable String sku){return Map.of("service","inventory-service","sku",sku,"available",42,"status","IN_STOCK");} @GetMapping("/demo") public Map<String,String> demo(){return Map.of("service","inventory-service","message","Inventory service discovered successfully");} }
