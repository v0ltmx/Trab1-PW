package loja;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Usuario {
    @NotBlank
    @Size(min = 5,  max = 50 , message = "O tamanho não corresponde aos requisitos")
    private String nome,email,senha,funcionario;

    public Usuario(String nome, String email, String senha, String funcionario) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }
}
