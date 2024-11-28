package br.edu.utfpr.componenteprodutos.controller;

import br.edu.utfpr.componenteprodutos.dto.ProductDTO;
import br.edu.utfpr.componenteprodutos.dto.create.ProductCreateDTO;
import br.edu.utfpr.componenteprodutos.model.Product;
import br.edu.utfpr.componenteprodutos.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getAll")
    public List<ProductDTO> listAll() {
        return productService.findAll();
    }

    @PostMapping("/add")
    public ProductDTO create(@RequestBody ProductCreateDTO product) {
        return productService.create(product);
    }

}
