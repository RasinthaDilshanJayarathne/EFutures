package lk.efutures.practicalTest.service.impl;

import lk.efutures.practicalTest.dto.ProductCategoryDTO;
import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.entity.ProductCategory;
import lk.efutures.practicalTest.exception.NotFoundException;
import lk.efutures.practicalTest.repo.ProductCategoryRepo;
import lk.efutures.practicalTest.repo.ProductRepo;
import lk.efutures.practicalTest.service.ProductCategoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.tags.Param;

import java.util.Optional;

@Service
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public ProductCategoryDTO searchProductCategory(String name) {
        if (productCategoryRepo.existsByName(name)){
            String product = productCategoryRepo.findByName(name).getName();
            return modelMapper.map(product, ProductCategoryDTO.class);
        }else{
            throw new NotFoundException("No Product For "+ name +" ..!");
        }
    }
}
