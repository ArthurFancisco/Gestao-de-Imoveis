package gestao.com.gestao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gestao.com.gestao.entity.Proprietario;
import gestao.com.gestao.repository.ProprietarioRepository;

@Service
public class ProprietarioService {
    
     private final ProprietarioRepository proprietariorepository;

    public ProprietarioService(ProprietarioRepository repository) {
        this.proprietariorepository = repository;
    }

    public List<Proprietario> listarTodos() {
        return proprietariorepository.findAll();
    }

    public Proprietario buscarPorId(Long id) {
        return proprietariorepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Proprietário não encontrado"));
    }

    public Proprietario salvar(Proprietario proprietario) {
        return proprietariorepository.save(proprietario);
    }

    public void excluir(Long id) {
        proprietariorepository.deleteById(id);
    }

}
