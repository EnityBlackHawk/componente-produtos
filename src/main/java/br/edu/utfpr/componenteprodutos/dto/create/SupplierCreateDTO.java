package br.edu.utfpr.componenteprodutos.dto.create;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierCreateDTO {

    @Null
    private Long id;
    @NotNull
    private String description;

}
