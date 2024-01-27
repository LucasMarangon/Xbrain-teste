package br.com.springbootXB.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
public class Venda {

        @Id
        private Long id;
        private LocalDate dataVenda;
        private float valor;
        private Long vendedorId;
        private String vendedorNome;
        @OneToOne
        private VendedorSales VendedorSales;
    }
