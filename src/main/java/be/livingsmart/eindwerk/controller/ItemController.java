package be.livingsmart.eindwerk.controller;

import be.livingsmart.eindwerk.repository.ItemJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    
    //@Autowired
    //private ItemJpaRepository itemRepo;
    
    @RequestMapping("/item")
    public String getItem(){
        return "test";
    }
}

