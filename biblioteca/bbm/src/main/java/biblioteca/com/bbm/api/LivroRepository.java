package biblioteca.com.bbm.api;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import biblioteca.com.bbm.api.model.LivroModel;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, UUID> {



}
