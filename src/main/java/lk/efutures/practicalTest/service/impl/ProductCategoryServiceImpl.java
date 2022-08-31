package lk.efutures.practicalTest.service.impl;

import lk.efutures.practicalTest.dto.ProductCategoryDTO;
import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.entity.Product;
import lk.efutures.practicalTest.entity.ProductCategory;
import lk.efutures.practicalTest.exception.DuplicateException;
import lk.efutures.practicalTest.exception.NotFoundException;
import lk.efutures.practicalTest.repo.ProductCategoryRepo;
import lk.efutures.practicalTest.repo.ProductRepo;
import lk.efutures.practicalTest.service.ProductCategoryService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public void saveProductCategory(ProductCategoryDTO dto) {
        if (!productCategoryRepo.existsById(dto.getProduct_category_id())) {
            ProductCategory map = modelMapper.map(dto, ProductCategory.class);
            productCategoryRepo.save(map);
        } else {
            throw new DuplicateException("Product Already Exist..!");
        }
    }

    @Override
    public List<ProductCategoryDTO> getAllProductCategory() {
        if (!productCategoryRepo.findAll().isEmpty()){
            return modelMapper.map(productCategoryRepo.findAll(), new TypeToken<List<ProductCategoryDTO>>() {}.getType());
        }else {
            throw new NotFoundException("No Product in database..!");
        }
    }

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
