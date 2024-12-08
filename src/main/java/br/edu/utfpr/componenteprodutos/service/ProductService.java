package br.edu.utfpr.componenteprodutos.service;

import br.edu.utfpr.componenteprodutos.dto.ManyProductDTO;
import br.edu.utfpr.componenteprodutos.dto.ProductDTO;
import br.edu.utfpr.componenteprodutos.dto.create.ProductCreateDTO;
import br.edu.utfpr.componenteprodutos.dto.update.UpdateProductDTO;
import br.edu.utfpr.componenteprodutos.model.Product;
import br.edu.utfpr.componenteprodutos.repository.ProductRepository;
import br.edu.utfpr.componenteprodutos.utils.GenericService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService extends GenericService<Product, Long, ProductRepository, ProductDTO, ProductCreateDTO, UpdateProductDTO> {

    public ProductService(ProductRepository repository) {
        super(repository, Product.class, ProductDTO.class, ProductCreateDTO.class, UpdateProductDTO.class);
    }



    public List<ProductDTO> findMany(ManyProductDTO manyProductDTO) {
        var values = repository.findAllById(manyProductDTO.getCodes());
        return values.stream().map(entity -> modelMapper.map(entity, dtoClass)).toList();
    }

    public List<ProductDTO> updateMany(List<UpdateProductDTO> products) {

        var result = repository.saveAll(
                products.stream()
                        .map(dto -> modelMapper.map(dto, entityClass))
                        .toList()
        );
        return result.stream().map(entity -> modelMapper.map(entity, dtoClass)).toList();
    }

}
