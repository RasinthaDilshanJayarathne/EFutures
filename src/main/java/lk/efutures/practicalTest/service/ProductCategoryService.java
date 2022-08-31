package lk.efutures.practicalTest.service;


import lk.efutures.practicalTest.dto.ProductCategoryDTO;
import lk.efutures.practicalTest.dto.ProductDTO;

import java.util.List;

public interface ProductCategoryService {

    public void saveProductCategory(ProductCategoryDTO dto);

    public List<ProductCategoryDTO> getAllProductCategory();

    public ProductCategoryDTO searchProductCategory(String name);
}
