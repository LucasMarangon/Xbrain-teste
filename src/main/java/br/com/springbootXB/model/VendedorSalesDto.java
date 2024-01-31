package br.com.springbootXB.model;

import lombok.Data;
import lombok.NoArgsConstructor;

// Model DTO para transferir os dados entre Venda e Vendedores 

@Data
@NoArgsConstructor   
public class VendedorSalesDto {
    private Long id;
    private String nome;
    private int totalVendas;
    private Float mediaVendasDiaria;

   public VendedorSalesDto(Long id, String nome, int totalVendas, Float mediaVendasDiaria) {
this.id = id;
this.nome = nome;
this.totalVendas = totalVendas;
this.mediaVendasDiaria = mediaVendasDiaria;
}
    
}
