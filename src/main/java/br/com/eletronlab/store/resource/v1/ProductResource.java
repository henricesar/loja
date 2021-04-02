package br.com.eletronlab.store.resource.v1;

import br.com.eletronlab.store.model.Product;
import br.com.eletronlab.store.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/product")
@AllArgsConstructor
public class ProductResource {

    private final ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts(){
        System.out.println("Entrou no metodo GET");
        return productRepository.findAll();


    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long id){
        return productRepository.findById(id).get();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productRepository.deleteById(id);
    }

    @PostMapping
    public void createProduct(@RequestBody Product productCreate){
        productRepository.save(productCreate);
    }


}
