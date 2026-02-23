package gestao.com.gestao.entity;

import com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Imovel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public enum Tipo {
        APARTAMENTO, 
        CASA, 
        COMERCIAL
    }

    private Tipo tipo;

    private String endereco;

    private Double valor;

    
    public enum Status {
        DISPONIVEL, 
        ALUGADO, 
        VENDIDO
    }

    private Status status;

    @ManyToOne
    private Proprietario proprietario;
}
