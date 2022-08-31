package lk.efutures.practicalTest.service.impl;

import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.entity.Product;
import lk.efutures.practicalTest.exception.DuplicateException;
import lk.efutures.practicalTest.exception.NotFoundException;
import lk.efutures.practicalTest.repo.ProductRepo;
import lk.efutures.practicalTest.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
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
        if (!productRepo.existsById(String.valueOf(dto.getProduct_id()))) {
            Product map = modelMapper.map(dto, Product.class);
            productRepo.save(map);
        } else {
            throw new DuplicateException("Product Already Exist..!");
        }
    }

    @Override
    public void deleteProduct(int id) {
        if (productRepo.existsById(String.valueOf(id))){
            productRepo.deleteById(String.valueOf(id));
        }else{
            throw new NotFoundException("Please check the Customer ID.. No Such Customer..!");
        }
    }

    @Override
    public void updateProduct(ProductDTO dto) {
        if (productRepo.existsById(String.valueOf(dto.getProduct_id()))){
            Product map = modelMapper.map(dto, Product.class);
            productRepo.save(map);
        }else {
            throw new NotFoundException("No Such a Product..!");
        }
    }

    @Override
    public ProductDTO searchProduct(String name) {
        if (productRepo.existsByName(name)){
            String product = productRepo.findByName(name).getName();
            return modelMapper.map(product, ProductDTO.class);
        }else{
            throw new NotFoundException("No Product For "+ name +" ..!");
        }
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        if (!productRepo.findAll().isEmpty()){
            return modelMapper.map(productRepo.findAll(), new TypeToken<List<ProductDTO>>() {}.getType());
        }else {
            throw new NotFoundException("No Product in database..!");
        }
    }
}
