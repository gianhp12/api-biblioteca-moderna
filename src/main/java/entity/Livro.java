package entity;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "livro")
public class Livro {

    @Id
    @Column(name = "codigo")
    String codigo;

    @Column(name = "titulo")
    String titulo;

    @Column(name = "autor")
    String autor;

    @Column(name = "dataCompra")
    Date dataCompra;

}
