package br.com.eletronlab.store.resource;

import br.com.eletronlab.store.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductResource {

    @GetMapping
    public String getProduct(){
        System.out.println("Entrou no metodo GET");
        return "Um produto qualquer";


    }

    @GetMapping("{/id}")
    public Product getProduct(@PathVariable("id") Long id){
        System.out.println(id);

        Product p = new Product(1L, "Mouse", "Mouse Gamer", 75f);
//        return "Um produto qualquer";
        return p;
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(){
        System.out.println();
        return "Excluir produto";
    }
}
