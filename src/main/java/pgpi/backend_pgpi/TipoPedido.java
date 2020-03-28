package pgpi.backend_pgpi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoPedido {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String descripcion; // carga, descarga, no_disponible (n_d solo para muelle)

  public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}

