package pe.edu.vallegrande.deeptraslate.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.deeptraslate.model.Translation;
import pe.edu.vallegrande.deeptraslate.service.TranslationService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/translate")
@RequiredArgsConstructor
public class TranslationController {

    private final TranslationService translationService;

    @GetMapping
    public Mono<Translation> translateGet(
            @RequestParam String text,
            @RequestParam(defaultValue = "en") String sourceLang,
            @RequestParam(defaultValue = "es") String targetLang) {
        return translationService.translate(text, sourceLang, targetLang);
    }

    @PostMapping
    public Mono<Translation> translatePost(@RequestBody TranslationRequest request) {
        return translationService.translate(request.text(), request.sourceLang(), request.targetLang());
    }

    private record TranslationRequest(String text, String sourceLang, String targetLang) {
    }
}