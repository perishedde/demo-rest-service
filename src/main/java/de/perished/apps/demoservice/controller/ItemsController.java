package de.perished.apps.demoservice.controller;

import de.perished.apps.demoservice.domain.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemsController {

    private List<Item> items = new ArrayList<>();

    @PostConstruct
    private void createDemoData() {
        items.add(new Item("foo", "bar"));
        items.add(new Item("do", "it"));
        items.add(new Item("all", "your base are belong to us"));
    }

    @GetMapping(path = "/items")
    public ResponseEntity<List<Item>> all() {
        return ResponseEntity.ok(items);
    }

}
