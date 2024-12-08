package br.edu.utfpr.componenteprodutos.dto.create;

import br.edu.utfpr.componenteprodutos.dto.SupplierDTO;
import br.edu.utfpr.componenteprodutos.model.Supplier;
import br.edu.utfpr.componenteprodutos.utils.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.validator.constraints.Range;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductCreateDTO implements IEntity<Long> {

    private Long code;
    @NotNull(message = "The description must be informed")
    private String description;
    @NotNull(message = "The value must be informed")
    @Range(min = 0, message = "The value must be greater than 0")
    private float value;
    @NotNull(message = "The quantity must be informed")
    @Range(min = 0, message = "The quantity must be greater than 0")
    private int quantity;
    @NotNull(message = "The supplier must be informed")
    private SupplierDTO supplier;

    @Override
    @JsonIgnore
    public Long getId() {
        return code;
    }
}
