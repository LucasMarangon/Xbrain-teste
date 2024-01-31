package br.com.springbootXB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.springbootXB.model.VendedorSales;
import java.util.Optional;

// Repositório para filtrar utilizando o ID do vendedor


@Repository
public interface VendedorSalesRepository extends JpaRepository<VendedorSales, Long>{
    Optional<VendedorSales> findById(Long id);

}


