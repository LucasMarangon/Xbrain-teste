package br.com.springbootXB.model;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Model dos Vendedores

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class VendedorSales {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private int totalVendas;
    @OneToMany(mappedBy = "vendedorSales", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Venda> vendas;
}
