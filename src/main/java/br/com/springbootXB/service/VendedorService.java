package br.com.springbootXB.service;
import java.time.LocalDate;
import java.util.List;
import br.com.springbootXB.model.VendedorSales;
import br.com.springbootXB.model.VendedorSalesDto;

// Interface do vendedor

public interface VendedorService {
    VendedorSales gerarVendedor(String nome);

    List<VendedorSalesDto> listarVendedores(LocalDate dataInicial, LocalDate dataFinal);
}
