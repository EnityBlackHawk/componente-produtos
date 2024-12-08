package br.edu.utfpr.componenteprodutos.controller;

import br.edu.utfpr.componenteprodutos.dto.ProductDTO;
import br.edu.utfpr.componenteprodutos.dto.create.ProductCreateDTO;
import br.edu.utfpr.componenteprodutos.dto.update.UpdateProductDTO;
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

    @GetMapping("/{id}")
    public ProductDTO getById(@PathVariable Long id) {
        return productService.findById(id);
    }

    @PutMapping("/{id}")
    public ProductDTO update(@PathVariable Long id, @RequestBody UpdateProductDTO product) {
        return productService.update(id, product);
    }

}
