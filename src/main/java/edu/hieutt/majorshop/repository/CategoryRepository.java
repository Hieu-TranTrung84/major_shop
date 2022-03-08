package edu.hieutt.majorshop.repository;

import edu.hieutt.majorshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
