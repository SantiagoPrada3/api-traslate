package pe.edu.vallegrande.deeptraslate.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import pe.edu.vallegrande.deeptraslate.model.Translation;

public interface TranslationRepository extends ReactiveCrudRepository<Translation, Long> {
}