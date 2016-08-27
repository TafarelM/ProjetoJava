
package model.bean;

/**
 *
 * @author Tafar
 */
public class Estado {
    private int idEstado;
    private String estado;
    private String sigla;

    public Estado() {
    }

    public Estado(int idEstado, String estado, String sigla) {
        this.idEstado = idEstado;
        this.estado = estado;
        this.sigla = sigla;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }    
    
}
