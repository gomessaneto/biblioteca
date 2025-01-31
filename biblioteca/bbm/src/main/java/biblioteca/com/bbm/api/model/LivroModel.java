package biblioteca.com.bbm.api.model;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

    @Entity
    @Table(name = "livros")
    public class LivroModel implements Serializable {

    private static final long SerialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idLivro")
    private UUID idLivro;

    @Column (name = "autor")
    private String autor;

    @Column (name = "anoPublicacao")
    private Integer anoPublicacao;

    @Column (name = "titulo")
    private String titulo;

    @Column (name = "ISBN")
    private String ISBN;

    @Column (name = "editora")
    private String editora;

    @Column (name = "sinopse")
    private String sinopse;
    
    @Column (name = "preco")
    private double preco;
    
    @Column (name = "idioma")
    private String idioma;

    @Column (name = "numPaginas")
    private int numPaginas;

    @Column (name = "genero")
    private String genero;

    /*-------------------------*/ 

    public LivroModel() {}

     public LivroModel(String autor, Integer anoPublicacao, String titulo, String iSBN, String editora,
            String sinopse, double preco, String idioma, int numPaginas, String genero) {
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.titulo = titulo;
        ISBN = iSBN;
        this.editora = editora;
        this.sinopse = sinopse;
        this.preco = preco;
        this.idioma = idioma;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }    

     @Override
    public String toString() {
        return "LivroModel [idLivro=" + idLivro + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + ", titulo="
                + titulo + ", ISBN=" + ISBN + ", editora=" + editora + ", sinopse=" + sinopse + ", preco=" + preco
                + ", idioma=" + idioma + ", numPaginas=" + numPaginas + ", genero=" + genero + "]";
    }

    /*-------------------------*/ 

   
    public UUID getIdLivro() {
        return idLivro;
    }

    

    public void setIdLivro(UUID idLivro) {
        this.idLivro = idLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



}
