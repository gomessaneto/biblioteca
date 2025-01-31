package biblioteca.com.bbm.api.dto;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Component
public record LivroRecordDTO(@NotBlank String autor, @NotNull Integer anoPublicacao, @NotBlank String titulo, @NotBlank String ISBN, @NotBlank String editora, @NotBlank String sinopse, @NotNull double preco, @NotBlank String idioma, @NotNull int numPaginas, @NotBlank String genero) {

}
