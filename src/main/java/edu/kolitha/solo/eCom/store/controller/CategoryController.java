package edu.kolitha.solo.eCom.store.controller;

import edu.kolitha.solo.eCom.store.model.Category;
import edu.kolitha.solo.eCom.store.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop/category")
public class CategoryController {
    @Autowired
    CategoryServiceImpl categoryService;

    @GetMapping("/all")
    public List<Category> getCategoryList(){
        return categoryService.getCategoryList();
    }

    @PostMapping("/add")
    public String addCategory(@RequestBody Category categoryName){
        return categoryService.addCategory(categoryName);
    }

    @PutMapping("/update")
    public String updateCategory(@RequestBody Long id, @RequestBody String categoryName){
        return id + ": " + categoryName;
    }

    @DeleteMapping("/delete/{id}")
    public String removeCategory(@PathVariable Long id){
        return "Category removed!";
    }
}
