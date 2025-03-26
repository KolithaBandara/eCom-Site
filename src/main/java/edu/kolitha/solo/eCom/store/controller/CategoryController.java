package edu.kolitha.solo.eCom.store.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {
    private List<String> categoryList = new ArrayList<>();

    @GetMapping("/shop/category/all")
    public List<String> getCategoryList(){
        return categoryList;
    }

    @PostMapping("/shop/category/add")
    public String addCategory(@RequestBody String categoryName){
        return "Category added successfully!";
    }

    @PutMapping("/shop/category/update")
    public String updateCategory(@RequestBody String categoryName){
        return "Category updated!";
    }

    @DeleteMapping("/shop/category/{id}")
    public String removeCategory(@PathVariable Long id){
        return "Category removed!";
    }
}
