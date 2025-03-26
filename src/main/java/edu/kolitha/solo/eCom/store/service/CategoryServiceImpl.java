package edu.kolitha.solo.eCom.store.service;

import edu.kolitha.solo.eCom.store.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    private List<Category> categoryList = new ArrayList<>();
    private Long categoryId = 0L;

    @Override
    public List<Category> getCategoryList() {
        return categoryList;
    }

    @Override
    public String addCategory(Category categoryName) {
        categoryId++;
        categoryName.setId(categoryId);
        categoryList.add(categoryName);
        return "Category ID : "+categoryId+"  Category Name : "+ categoryName.getName() +"  -->  added successfully!";
    }

    @Override
    public String updateCategory(Long id, String categoryName) {
        for (Category category : categoryList){
           boolean status = category.getId().equals(id);
        }
        return "";
    }

    @Override
    public String removeCategory(Long id) {
        return "";
    }
}
