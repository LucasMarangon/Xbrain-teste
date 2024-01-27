package br.com.springbootXB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.springbootXB.model.VendedorSales;

@Repository
public interface VendedorSalesRepository extends JpaRepository<VendedorSales, Long>{    
}
