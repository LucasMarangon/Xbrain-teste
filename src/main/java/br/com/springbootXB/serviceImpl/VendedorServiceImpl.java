package br.com.springbootXB.serviceImpl;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.springbootXB.model.VendedorSales;
import br.com.springbootXB.model.VendedorSalesDto;
import br.com.springbootXB.repository.VendedorSalesRepository;
import br.com.springbootXB.service.VendedorService;

// Implementação dos serviços relacionados aos vendedores

@Service
public class VendedorServiceImpl implements VendedorService{
    @Autowired
    private VendedorSalesRepository vendedorSalesRepository;

// Geração de vendedor 

    @Override
    public VendedorSales gerarVendedor(String nome) {
        VendedorSales vendedorSales = new VendedorSales();
        vendedorSales.setNome(nome);
        return vendedorSalesRepository.save(vendedorSales);       
    }

// Listagem do vendedor com id, nome, total de vendas e média de vendas calculada de acordo com o período de tempo especificado

    @Override
    public List<VendedorSalesDto> listarVendedores(LocalDate dataInicial, LocalDate dataFinal) {
        return vendedorSalesRepository.findAll().stream().map(vendedor -> 
            new VendedorSalesDto (vendedor.getId(), vendedor.getNome(), vendedor.getTotalVendas(),gerarMedia(dataInicial, dataFinal, vendedor)))
            .collect(Collectors.toList());
    }
    

// Função para calcular a média de vendas de acordo com período

    private Float gerarMedia(LocalDate dataInicial, LocalDate dataFinal, VendedorSales vendedorSales){
        // a variável vai filtrar as vendas, utilizar o stream() para verificar as colunas, filtrar as vendas dentro do período inicial e final, e retornar o valor total de vendas no período
        Integer vendas = vendedorSales.getVendas().stream().filter(venda -> venda.getDataVenda().isAfter(dataInicial) || venda.getDataVenda().isEqual(dataInicial) && venda.getDataVenda().isBefore(dataFinal) 
        || venda.getDataVenda().isEqual(dataFinal)).collect(Collectors.toList()).size();
        Integer totalDias = (int) ChronoUnit.DAYS.between(dataInicial, dataFinal) + 1;
        return(float) vendas / totalDias; }

     }
  
