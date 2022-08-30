package lk.efutures.practicalTest.service;

import lk.efutures.practicalTest.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    public void saveProduct(ProductDTO dto);

    public void deleteProduct(int id);

    public void updateProduct(ProductDTO dto);

    public ProductDTO searchProduct(String name);

    public List<ProductDTO> getAllProduct();
}
