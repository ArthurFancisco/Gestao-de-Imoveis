package gestao.com.gestao.service;

import java.util.List;

import org.springframework.stereotype.Service;

import gestao.com.gestao.entity.Imovel;
import gestao.com.gestao.repository.ImovelRepository;

@Service
public class ImovelService {

     private final ImovelRepository repository;

    public ImovelService(ImovelRepository repository) {
        this.repository = repository;
    }

    public List<Imovel> listarTodos() {
        return repository.findAll();
    }

    public Imovel buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Imóvel não encontrado"));
    }

    public Imovel salvar(Imovel imovel) {
        return repository.save(imovel);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
