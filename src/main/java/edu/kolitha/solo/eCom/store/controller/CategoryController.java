package edu.kolitha.solo.eCom.store.controller;

import edu.kolitha.solo.eCom.store.model.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shop/category")
public class CategoryController {
    private List<Category> categoryList = new ArrayList<>();
    private Long categoryId = 0L;

    @GetMapping("/all")
    public List<Category> getCategoryList(){
        return categoryList;
    }

    @PostMapping("/add")
    public String addCategory(@RequestBody Category categoryName){
        categoryId++;
        categoryName.setId(categoryId);
        categoryList.add(categoryName);
        return "Category ID : "+categoryId+"  Category Name : "+ categoryName.getName() +"  -->  added successfully!";
    }

    @PutMapping("/update")
    public String updateCategory(@RequestBody Long id, @RequestBody String categoryName){
        return id + ": " + categoryName;
    }

    @DeleteMapping("/{id}")
    public String removeCategory(@PathVariable Long id){
        return "Category removed!";
    }
}
