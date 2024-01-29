package br.com.springbootXB.serviceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.springbootXB.model.Venda;
import br.com.springbootXB.model.VendedorSales;
import br.com.springbootXB.repository.VendaRepository;
import br.com.springbootXB.repository.VendedorSalesRepository;
import br.com.springbootXB.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

    @Autowired
    private VendaRepository vendaRepository;

    @Autowired
    private VendedorSalesRepository vendedorSalesRepository;

    @Override
    public Venda gerarVenda(Long vendedorId, float valor) {
        VendedorSales vendedorSales = vendedorSalesRepository.findById(vendedorId).orElseThrow(()->new RuntimeException("Erro"));
        Venda venda = new Venda();
        venda.setValor(valor);
        venda.setDataVenda(LocalDate.now());
        venda.setVendedorSales(vendedorSales);
        vendedorSales.setTotalVendas(vendedorSales.getTotalVendas() + 1);
        vendedorSales.setMediaVendasDiaria(gerarMedia());
        vendedorSalesRepository.save(vendedorSales);
        return vendaRepository.save(venda);
    }

    @Override
    public List<Venda> listarVenda(LocalDate dataInicial, LocalDate dataFinal) {
        return vendaRepository.findAll();

    }

    private Float gerarMedia() {
        return null;

    }
}