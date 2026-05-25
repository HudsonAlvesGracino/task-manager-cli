// classe task

public class Task{
    private int id;
    private String titulo;
    private String descricao;
    private boolean estaCompleto = false;


    public Task(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstaCompleto() {
        return estaCompleto;
    }

    public void setEstaCompleto(boolean estaCompleto) {
        this.estaCompleto = estaCompleto;
    }

    @Override
    public String toString() {
        if (!estaCompleto){
            return ("ID " + getId() + " | " + "[] " + getTitulo() + " | " + getDescricao());
        } else
            return ("ID " + getId() + " | " + "[X] " + getTitulo() + " | " + getDescricao());
    }
}
