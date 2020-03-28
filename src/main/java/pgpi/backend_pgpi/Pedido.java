package pgpi.backend_pgpi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private Integer pedidoId;

  public Integer getPedidoId() {
	return pedidoId;
}

public void setPedidoId(Integer pedidoId) {
	this.pedidoId = pedidoId;
}

public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

}
