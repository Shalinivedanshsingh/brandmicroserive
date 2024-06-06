package com.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{

	List<Brand> findByProductId(Integer id);

}
