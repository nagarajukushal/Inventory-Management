package com.example.Inventory.Management.controllers;

import com.example.Inventory.Management.entities.Items;
import com.example.Inventory.Management.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<Items> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping
    public Items addItems(@RequestBody Items items){
        return itemService.addItems(items);
    }

    @GetMapping("/{id}")
    public Items getItemById(@PathVariable Long id){
        return itemService.getItemById(id);
    }

    @PutMapping("/{id}")
    public Items updateItemsById(@PathVariable Long id, @RequestBody Items items){
        items.setId(id);
        return itemService.updateItemsById(items);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id){
        itemService.deleteItem(id);
    }
}
