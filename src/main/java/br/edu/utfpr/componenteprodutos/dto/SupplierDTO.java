package br.edu.utfpr.componenteprodutos.dto;

import br.edu.utfpr.componenteprodutos.utils.IEntity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO implements IEntity<Long> {
    @NotNull
    private Long id;
    @Null
    private String description;
}
