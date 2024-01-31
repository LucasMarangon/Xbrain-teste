package br.com.springbootXB.service;
import java.time.LocalDate;
import java.util.List;
import br.com.springbootXB.model.Venda;

//interface de venda

public interface VendaService {

    void gerarVenda(Long vendedorId, float valor);
    
    List<Venda> listarVenda(LocalDate dataInicial, LocalDate dataFinal);
}