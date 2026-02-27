package gestao.com.gestao.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Contrato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataInicio;

    private LocalDate dataFim;

    private Double valorMensal;

    @OneToOne
    private Imovel imovel;
    
    private boolean ativo;

    @ManyToOne
    private Proprietario proprietario;
}
