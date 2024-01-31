package br.com.springbootXB.model;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Model da Venda

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity 
public class Venda {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private LocalDate dataVenda;
        private float valor;
        @ManyToOne(fetch = FetchType.LAZY)
        private VendedorSales vendedorSales;
    }
