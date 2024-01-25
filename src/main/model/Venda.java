import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Venda {
    
        private Long id;
        private LocalDate dataVenda;
        private BigDecimal valor;
        private Long vendedorId;
        private String vendedorNome;
    }
