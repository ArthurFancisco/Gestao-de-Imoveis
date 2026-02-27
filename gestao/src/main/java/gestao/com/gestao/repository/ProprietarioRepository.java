package gestao.com.gestao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gestao.com.gestao.entity.Proprietario;

@Repository
public interface ProprietarioRepository extends JpaRepository<Proprietario, Long> {
}
