package edu.kolitha.solo.eCom.store.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shop/category")
public class CategoryController {
    private List<String> categoryList = new ArrayList<>();

    @GetMapping("/all")
    public List<String> getCategoryList(){
        return categoryList;
    }

    @PostMapping("/add")
    public String addCategory(@RequestBody String categoryName){
        return "Category added successfully!";
    }

    @PutMapping("/update")
    public String updateCategory(@RequestBody String categoryName){
        return "Category updated!";
    }

    @DeleteMapping("/{id}")
    public String removeCategory(@PathVariable Long id){
        return "Category removed!";
    }
}
