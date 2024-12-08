package br.edu.utfpr.componenteprodutos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ManyProductDTO {

    private List<Long> codes;

}
