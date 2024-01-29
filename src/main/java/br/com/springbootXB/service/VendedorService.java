package br.com.springbootXB.service;

import java.time.LocalDate;
import java.util.List;

import br.com.springbootXB.model.VendedorSales;

public interface VendedorService {
    VendedorSales gerarVendedor(String nome);

    List<VendedorSales> listarVendedores(LocalDate dataInicial, LocalDate dataFinal);
}
