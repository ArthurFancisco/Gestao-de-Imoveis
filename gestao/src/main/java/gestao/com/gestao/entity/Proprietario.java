package gestao.com.gestao.entity;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Entity
public class Proprietario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @CPF
    private String cpf;

    private String telefone;

    @Email
    private String email;

    @OneToMany(mappedBy = "proprietario")
    private List<Imovel> imoveis = new ArrayList<>();
}
