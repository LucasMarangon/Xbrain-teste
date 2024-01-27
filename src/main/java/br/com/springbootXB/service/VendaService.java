package br.com.springbootXB.service;

import java.time.LocalDate;
import java.util.List;

import br.com.springbootXB.model.Venda;
import br.com.springbootXB.model.VendedorSales;

//interface de venda

public interface VendaService {

    Venda gerarVenda(String vendedorNome, float valor);
    
    List<VendedorSales> listarVendedores(LocalDate dataInicial, LocalDate dataFinal);
}