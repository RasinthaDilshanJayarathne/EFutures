package lk.efutures.practicalTest.service.impl;

import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.entity.Product;
import lk.efutures.practicalTest.entity.ProductCategory;
import lk.efutures.practicalTest.exception.DuplicateException;
import lk.efutures.practicalTest.exception.NotFoundException;
import lk.efutures.practicalTest.repo.ProductCategoryRepo;
import lk.efutures.practicalTest.repo.ProductRepo;
import lk.efutures.practicalTest.service.ProductService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private ProductCategoryRepo productCategoryRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void saveProduct(ProductDTO dto) {
        if (!productRepo.existsById(dto.getProduct_id())) {
            productRepo.save(modelMapper.map(dto,Product.class));
        } else {
            throw new DuplicateException("Product Already Exist..!");
        }
    }

    @Override
    public void deleteProduct(int id) {
        if (productRepo.existsById(id)){
            productRepo.deleteById(id);
        }else{
            throw new NotFoundException("Please check the Product ID.. No Such Product..!");
        }
    }

    @Override
    public void updateProduct(ProductDTO dto) {
        if (productRepo.existsById(dto.getProduct_id())){
            Product map = modelMapper.map(dto, Product.class);
            productRepo.save(map);
        }else {
            throw new NotFoundException("No Such a Product..!");
        }
    }

    @Override
    public List<ProductDTO> searchProduct(String name) {
        int id = productCategoryRepo.getCategoryName(name);
        if (id > 0){

//            ArrayList<ProductDTO> productArrayList = new ArrayList<>();
//            for (Product dto : productRepo.getProductsByProductCategoryEquals(new ProductCategory(id))) {
//                productArrayList.add(new ProductDTO(
//                       dto.getProduct_id(),
//                        dto.getName(),
//                        dto.getDescription(),
//                        dto.getPrice(),
//                        dto.getStatus(),
//                        dto.getLaunch_date()
//                ));
//            }
//            return productArrayList;

//            System.out.println(productRepo.getProduct(id));
            return modelMapper.map(productRepo.getProductsByProductCategoryEquals(new ProductCategory(id)), new TypeToken<List<ProductDTO>>() {}.getType());

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
