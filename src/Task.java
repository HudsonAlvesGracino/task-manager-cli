// classe task


public class Task{
    private int id;
    private String titulo;
    private String descricao;
    private boolean estaCompleto = false;
    Prioridade prioridade;



    public Task(Prioridade prioridade, int id, String titulo, String descricao) {
        this.prioridade = prioridade;
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

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        if (!estaCompleto){
            return ("ID " + getId() + " | " + "[] " + getTitulo() + " | " + getDescricao() + " | " + "[" + getPrioridade() + "]" );
        } else
            return ("ID " + getId() + " | " + "[X] " + getTitulo() + " | " + getDescricao() +  " | " + "[" + getPrioridade() + "]" );
    }
}
