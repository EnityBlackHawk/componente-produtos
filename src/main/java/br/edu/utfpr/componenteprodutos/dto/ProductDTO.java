package br.edu.utfpr.componenteprodutos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long code;
    private String description;
    private float value;
    private int quantity;
    private SupplierDTO supplier;
}
