package br.edu.utfpr.componenteprodutos.repository;

import br.edu.utfpr.componenteprodutos.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
