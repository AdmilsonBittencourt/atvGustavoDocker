package model;

public class Telefone {
    private Integer id;
    private Integer idPessoa;
    private String telefone;

    public Telefone(Integer id,Integer idPessoa, String telefone) {
        this.id = id;
        this.idPessoa = idPessoa;
        this.telefone = telefone;
    }

    public Telefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Telefone{");
        sb.append("id=").append(id);
        sb.append(", telefone=").append(telefone);
        sb.append('}');
        return sb.toString();
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }



}
