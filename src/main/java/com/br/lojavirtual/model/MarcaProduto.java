package com.br.lojavirtual.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@SequenceGenerator(name = "seq_marca_produto", sequenceName = "seq_marca_produto",
        allocationSize = 1, initialValue = 1)
public class MarcaProduto implements Serializable {

    private static final long serialVersionUID = 6541475064988717391L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_marca_produto")
    private Long id;

    @Column(nullable = false)
    private String nomeDesc;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarcaProduto that = (MarcaProduto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
