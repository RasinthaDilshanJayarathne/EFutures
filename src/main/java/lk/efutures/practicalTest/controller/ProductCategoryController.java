package lk.efutures.practicalTest.controller;

import lk.efutures.practicalTest.dto.ProductCategoryDTO;
import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.service.ProductCategoryService;
import lk.efutures.practicalTest.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/productCategory")
@CrossOrigin
public class ProductCategoryController {

    @Autowired
    ProductCategoryService productCategoryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllProduct(){
        return new ResponseUtil(200,"Successfully Loaded",productCategoryService.getAllProductCategory());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveProduct(@ModelAttribute ProductCategoryDTO productCategory){
        productCategoryService.saveProductCategory(productCategory);
        return new ResponseUtil(200,"Saved",null);
    }
}
