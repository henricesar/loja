package br.com.eletronlab.store.model.dto.product;

import lombok.Data;

@Data
public class ProductCreateDto {
    private String name;
    private String detail;
    private float price;
}
