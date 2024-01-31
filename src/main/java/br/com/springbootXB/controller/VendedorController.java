package br.com.springbootXB.controller;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.springbootXB.model.VendedorSales;
import br.com.springbootXB.model.VendedorSalesDto;
import br.com.springbootXB.service.VendedorService;

// Controladora das requisições relacionadas aos Vendedores

@RequestMapping("/Vendedor")
@RestController
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    public VendedorSales gerarVendedor(@RequestParam String nome){
        return vendedorService.gerarVendedor(nome);
    }

    @GetMapping
    public List<VendedorSalesDto> listarVendedor(@RequestParam LocalDate dataInicial, @RequestParam LocalDate dataFinal){
        return vendedorService.listarVendedores(dataInicial , dataFinal);
    }
    
}
