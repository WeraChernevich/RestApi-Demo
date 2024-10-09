package ru.chernevich.demo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chernevich.demo.entity.Category;
import ru.chernevich.demo.repository.CategoryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> readAll() {
        return categoryRepository.findAll();
    }

    public Category readById(Long id) {
        return categoryRepository.findById(id).orElseThrow(() ->
                new RuntimeException("Category not found - " + id));
    }
}
