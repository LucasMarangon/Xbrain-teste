package br.com.springbootXB.repository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.springbootXB.model.Venda;

// O código vai encontrar vai achar todos os objetos de "Venda" dentro da data inicial e data final informadas
 
@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{
List<Venda> findByDataVendaBetween(LocalDate dataInicial, LocalDate dataFinal);
    
} 
    
    


