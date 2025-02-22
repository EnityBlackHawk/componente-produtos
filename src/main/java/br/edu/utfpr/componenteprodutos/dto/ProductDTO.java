package br.edu.utfpr.componenteprodutos.dto;

import br.edu.utfpr.componenteprodutos.utils.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO implements IEntity<Long> {
    private Long code;
    private String description;
    private float value;
    private int quantity;
    private SupplierDTO supplier;

    @Override
    @JsonIgnore
    public Long getId() {
        return code;
    }
}
