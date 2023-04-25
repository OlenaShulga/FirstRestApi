package pl.edu.vistula.fisrstrestappi.product.support.exception;

import pl.edu.vistula.fisrstrestappi.product.domain.Product;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(Long id){
        super(String.format("Product with %d not found", id));
    }
}
