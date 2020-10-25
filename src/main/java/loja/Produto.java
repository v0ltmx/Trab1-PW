package loja;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Produto {
    Integer id;
    @NotBlank
    @Size(min = 5,  max = 50 , message = "O tamanho não corresponde")
    String nome, descricao;
    Double preco;

    public Produto() {

    }

    public Produto(Integer id, String nome, String descricao, Double preco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
