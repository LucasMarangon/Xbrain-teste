package br.com.springbootXB.controller;
import org.springframework.web.bind.annotation.RestController;

import br.com.springbootXB.model.Venda;
import br.com.springbootXB.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/Venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping
    public Venda gerarVenda(String vendedorNome, float valor) {
        return vendaService.gerarVenda(vendedorNome, valor);
         
    }


    
}
