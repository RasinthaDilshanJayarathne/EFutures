package lk.efutures.practicalTest.controller;

import lk.efutures.practicalTest.dto.ProductDTO;
import lk.efutures.practicalTest.service.ProductService;
import lk.efutures.practicalTest.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Action;

@RestController
@RequestMapping("v1/product")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllProduct(){
        return new ResponseUtil(200,"Successfully Loaded",productService.getAllProduct());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveProduct(@ModelAttribute ProductDTO product){
        productService.saveProduct(product);
        return new ResponseUtil(200,"Saved",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteProduct(@RequestParam int id) {
        productService.deleteProduct(id);
        return new ResponseUtil(200,"Deleted",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateProduct(@RequestBody ProductDTO product){
        productService.updateProduct(product);
        return new ResponseUtil(200,"Updated",null);
    }

    @GetMapping(path = "/{name}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchProduct(@PathVariable String name) {
        ProductDTO productDTO = productService.searchProduct(name);
        return new ResponseUtil(200,"Found",productDTO);
    }
}
