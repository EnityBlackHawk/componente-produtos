package br.edu.utfpr.componenteprodutos.service;

import br.edu.utfpr.componenteprodutos.dto.SupplierDTO;
import br.edu.utfpr.componenteprodutos.dto.create.SupplierCreateDTO;
import br.edu.utfpr.componenteprodutos.model.Supplier;
import br.edu.utfpr.componenteprodutos.repository.SupplierRepository;
import org.springframework.stereotype.Service;

@Service
public class SupplierService extends GenericService<Supplier, Long, SupplierRepository, SupplierDTO, SupplierCreateDTO> {

    public SupplierService(SupplierRepository repository) {
        super(repository, Supplier.class, SupplierDTO.class, SupplierCreateDTO.class);
    }
}