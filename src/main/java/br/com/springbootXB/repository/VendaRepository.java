package br.com.springbootXB.repository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.springbootXB.model.Venda;

// Repositório com a função para pesquisar vendas entre datas específicas
 
@Repository
public interface VendaRepository extends JpaRepository<Venda, Long>{
List<Venda> findByDataVendaBetween(LocalDate dataInicial, LocalDate dataFinal);
    
} 
    
    


