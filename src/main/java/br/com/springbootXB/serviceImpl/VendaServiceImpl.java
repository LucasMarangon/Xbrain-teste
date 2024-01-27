package br.com.springbootXB.serviceImpl;

import java.time.LocalDate;
import java.util.List;
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
    public Venda gerarVenda(String vendedorNome, float valor) {
        Venda venda = new Venda();
        venda.setVendedorNome(vendedorNome);
        venda.setValor(valor);
        return vendaRepository.save(venda);
    }

    @Override
    public List<VendedorSales> listarVendedores(LocalDate dataInicial, LocalDate dataFinal) {

        return vendedorSalesRepository.findAll();

    }
}