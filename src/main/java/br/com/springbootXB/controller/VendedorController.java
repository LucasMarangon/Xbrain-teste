package br.com.springbootXB.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.com.springbootXB.model.VendedorSales;
import br.com.springbootXB.service.VendedorService;

@RequestMapping("/Vendedor")
@RestController
public class VendedorController {
    @Autowired
    private VendedorService vendedorService;

    @PostMapping
    public VendedorSales gerarVendedor(@RequestParam String nome){
        return vendedorService.gerarVendedor(nome);
    }


    
}
