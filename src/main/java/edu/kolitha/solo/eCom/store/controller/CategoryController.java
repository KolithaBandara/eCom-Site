package edu.kolitha.solo.eCom.store.controller;

import edu.kolitha.solo.eCom.store.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shop/category")
public class CategoryController {
    private List<Category> categoryList = new ArrayList<>();

    @GetMapping("/all")
    public List<Category> getCategoryList(){
        return categoryList;
    }

    @PostMapping("/add")
    public String addCategory(@RequestBody Category categoryName){
        categoryList.add(categoryName);
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
