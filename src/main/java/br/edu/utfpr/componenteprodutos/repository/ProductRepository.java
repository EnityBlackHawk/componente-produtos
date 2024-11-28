package br.edu.utfpr.componenteprodutos.repository;

import br.edu.utfpr.componenteprodutos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
