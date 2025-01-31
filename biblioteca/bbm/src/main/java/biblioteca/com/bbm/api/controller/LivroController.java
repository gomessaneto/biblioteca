package biblioteca.com.bbm.api.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import biblioteca.com.bbm.api.LivroRepository;
import biblioteca.com.bbm.api.dto.LivroRecordDTO;
import biblioteca.com.bbm.api.model.LivroModel;
import jakarta.validation.Valid;

@RestController
public class LivroController {

    @Autowired
    LivroRecordDTO livroRecordDTO;
    @Autowired
    LivroRepository livroRepository;

    @PostMapping("/livros")
    public ResponseEntity<LivroModel> saveLivro (@RequestBody @Valid LivroRecordDTO LivroRecordDTO){
    
    var livroModel = new LivroModel();
    BeanUtils.copyProperties(livroRecordDTO, livroModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(livroRepository.save(livroModel));

    }
}