package lk.efutures.practicalTest.service;

import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.entity.Product;

import java.util.List;

public interface ProductService {
    public void saveProduct(ProductDTO dto);

    public void deleteProduct(int id);

    public void updateProduct(ProductDTO dto);

    public List<ProductDTO> searchProduct(String name);

    public List<ProductDTO> getAllProduct();
}
