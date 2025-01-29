package com.example.Inventory.Management.services;

import com.example.Inventory.Management.entities.Items;
import com.example.Inventory.Management.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Items> getAllItems(){
        return itemRepository.findAll();
    }

    public Items addItems(Items items){
        return itemRepository.save(items);
    }

    public Items getItemById(Long id) {
        return itemRepository.findById(id).orElse(null);  // Returns item or null if not found
    }

    public Items updateItemsById(Items updateItem){
        if(itemRepository.existsById(updateItem.getId())){
            return itemRepository.save(updateItem);
        }
        throw new RuntimeException("ERROR: Unable to find the item by the gievn Id and update");
    }

    public String deleteItem(Long id){
        itemRepository.deleteById(id);
        return "Item deleted";
    }
}
