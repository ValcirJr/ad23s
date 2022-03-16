package utfpr.edu.br.servidorweb;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Livro {
    private String titulo;
    private Integer numeroPaginas;
}
