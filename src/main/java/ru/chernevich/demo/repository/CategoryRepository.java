package ru.chernevich.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.chernevich.demo.entity.Category;
import ru.chernevich.demo.entity.Product;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
