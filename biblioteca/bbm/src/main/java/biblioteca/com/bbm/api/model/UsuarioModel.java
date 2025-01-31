package biblioteca.com.bbm.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuario")

    public class UsuarioModel implements Serializable{

    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    @Column (name="idUsuario")
    private UUID idUsuario;

    @Column(name="login", nullable = false, unique = true)
    private String login;

    @Column(name="senha", nullable = false )
    private String senha;

    @Column(name="createAt",  insertable = false, updatable = false)
    private LocalDateTime createAt;

    @Column(name="lastLogin", nullable = true)
    private LocalDateTime lastLogin;

    public UsuarioModel() {
    }

    public UsuarioModel(UUID idUsuario, String login, String senha, LocalDateTime createAt, LocalDateTime lastLogin) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.senha = senha;
        this.createAt = createAt;
        this.lastLogin = lastLogin;
    }

    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    

}
