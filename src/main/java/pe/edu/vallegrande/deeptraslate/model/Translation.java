package pe.edu.vallegrande.deeptraslate.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table("translations")
public class Translation {
    @Id
    private Long id;
    private String sourceText;
    private String translatedText;
    private String sourceLanguage;
    private String targetLanguage;
    private LocalDateTime createdAt;
} 