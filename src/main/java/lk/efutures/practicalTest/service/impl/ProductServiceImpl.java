package lk.efutures.practicalTest.service.impl;

import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.repo.ProductRepo;
import lk.efutures.practicalTest.service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveProduct(ProductDTO dto) {

    }

    @Override
    public void deleteProduct(int id) {

    }

    @Override
    public void updateProduct(ProductDTO dto) {

    }

    @Override
    public ProductDTO searchProduct(String name) {
        return null;
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        return null;
    }
}
