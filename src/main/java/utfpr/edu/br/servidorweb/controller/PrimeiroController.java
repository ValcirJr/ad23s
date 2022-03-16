package utfpr.edu.br.servidorweb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import utfpr.edu.br.servidorweb.Livro;

@Controller
@RequestMapping
public class PrimeiroController {

    @GetMapping("hello-world")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok().body("Hello World");
    }

    @GetMapping("numero-characters/{text}")
    public ResponseEntity<Integer> countCharacters(@PathVariable String text) {
        return ResponseEntity.ok().body(text.length());
    }

    @PostMapping("dias-leitura")
    public @ResponseBody Double diasLeitura(@RequestBody Livro livro) {
        return Double.valueOf(livro.getNumeroPaginas()) / 10;
    }
}
