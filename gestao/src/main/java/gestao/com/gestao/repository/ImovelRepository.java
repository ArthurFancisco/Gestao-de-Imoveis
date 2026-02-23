package gestao.com.gestao.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import gestao.com.gestao.entity.Imovel;


public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}