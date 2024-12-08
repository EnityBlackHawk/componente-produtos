package br.edu.utfpr.componenteprodutos.dto.update;

import br.edu.utfpr.componenteprodutos.dto.SupplierDTO;
import br.edu.utfpr.componenteprodutos.utils.IEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductDTO implements IEntity<Long> {
    @NotNull
    private Long code;
    private String description;
    @Range(min = 0, message = "The value must be greater than 0")
    private float value;
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
