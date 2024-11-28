package br.edu.utfpr.componenteprodutos.controller;

import br.edu.utfpr.componenteprodutos.dto.SupplierDTO;
import br.edu.utfpr.componenteprodutos.dto.create.SupplierCreateDTO;
import br.edu.utfpr.componenteprodutos.model.Supplier;
import br.edu.utfpr.componenteprodutos.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("/getAll")
    public List<SupplierDTO> listAll() {
        return supplierService.findAll();
    }

    @PostMapping("/add")
    public SupplierDTO create(@RequestBody SupplierCreateDTO supplier) {
        return supplierService.create(supplier);
    }

}
