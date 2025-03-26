package edu.kolitha.solo.eCom.store.service;

import edu.kolitha.solo.eCom.store.model.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CategoryService {
    List<Category> getCategoryList();
    String addCategory(@RequestBody Category categoryName);
    String updateCategory(@RequestBody Long id, @RequestBody String categoryName);
    String removeCategory(@PathVariable Long id);
}
