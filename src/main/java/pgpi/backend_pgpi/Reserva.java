package pgpi.backend_pgpi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Reserva {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String matricula;
	  @ManyToOne()
	  @JoinColumn(name = "tipoVehiculo")
	private TipoVehiculo tipoVehiculo;
	private int horaInicio;
	  @ManyToOne()
	  @JoinColumn(name = "pedido")
	private Pedido pedido;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido")
	private TipoPedido tipoPedido;
	  @ManyToOne()
	  @JoinColumn(name = "muelle")
	private Muelle muelle;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Muelle getMuelle() {
		return muelle;
	}
	public void setMuelle(Muelle muelle) {
		this.muelle = muelle;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public TipoPedido getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(TipoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

}
