package br.com.springbootXB.serviceImpl;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.springbootXB.model.VendedorSales;
import br.com.springbootXB.repository.VendedorSalesRepository;
import br.com.springbootXB.service.VendedorService;

@Service
public class VendedorServiceImpl implements VendedorService{
    @Autowired
    private VendedorSalesRepository vendedorSalesRepository;

    @Override
    public VendedorSales gerarVendedor(String nome) {
        VendedorSales vendedorSales = new VendedorSales();
        vendedorSales.setNome(nome);
        return vendedorSalesRepository.save(vendedorSales);       
    }

    @Override
    public List<VendedorSales> listarVendedores(LocalDate dataInicial, LocalDate dataFinal) {
        return vendedorSalesRepository.findAll();
    }
    
}
