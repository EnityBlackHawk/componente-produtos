package br.edu.utfpr.componenteprodutos.service;

import br.edu.utfpr.componenteprodutos.dto.ProductDTO;
import br.edu.utfpr.componenteprodutos.dto.create.ProductCreateDTO;
import br.edu.utfpr.componenteprodutos.model.Product;
import br.edu.utfpr.componenteprodutos.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends GenericService<Product, Long, ProductRepository, ProductDTO, ProductCreateDTO> {

    public ProductService(ProductRepository repository) {
        super(repository, Product.class, ProductDTO.class, ProductCreateDTO.class);
    }
}
