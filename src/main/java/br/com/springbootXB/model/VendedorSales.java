package br.com.springbootXB.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class VendedorSales {

    @Id
    private Long id;
    private String nome;
    private int totalVendas;
    private Float mediaVendasDiaria;
    
}
