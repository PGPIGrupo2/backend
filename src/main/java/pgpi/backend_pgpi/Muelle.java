package pgpi.backend_pgpi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Muelle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	  @ManyToOne()
	  @JoinColumn(name = "tipoVehiculo")
	private TipoVehiculo tipoVehiculo;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido6")
	private TipoPedido tipoPedido6;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido7")
	private TipoPedido tipoPedido7;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido8")
	private TipoPedido tipoPedido8;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido9")
	private TipoPedido tipoPedido9;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido10")
	private TipoPedido tipoPedido10;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido11")
	private TipoPedido tipoPedido11;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido12")
	private TipoPedido tipoPedido12;
	  @ManyToOne()
	  @JoinColumn(name = "tipoPedido13")
	private TipoPedido tipoPedido13;
	
	public TipoPedido getTipoPedido6() {
		return tipoPedido6;
	}
	public void setTipoPedido6(TipoPedido tipoPedido6) {
		this.tipoPedido6 = tipoPedido6;
	}
	public TipoPedido getTipoPedido7() {
		return tipoPedido7;
	}
	public void setTipoPedido7(TipoPedido tipoPedido7) {
		this.tipoPedido7 = tipoPedido7;
	}
	public TipoPedido getTipoPedido8() {
		return tipoPedido8;
	}
	public void setTipoPedido8(TipoPedido tipoPedido8) {
		this.tipoPedido8 = tipoPedido8;
	}
	public TipoPedido getTipoPedido9() {
		return tipoPedido9;
	}
	public void setTipoPedido9(TipoPedido tipoPedido9) {
		this.tipoPedido9 = tipoPedido9;
	}
	public TipoPedido getTipoPedido10() {
		return tipoPedido10;
	}
	public void setTipoPedido10(TipoPedido tipoPedido10) {
		this.tipoPedido10 = tipoPedido10;
	}
	public TipoPedido getTipoPedido11() {
		return tipoPedido11;
	}
	public void setTipoPedido11(TipoPedido tipoPedido11) {
		this.tipoPedido11 = tipoPedido11;
	}
	public TipoPedido getTipoPedido12() {
		return tipoPedido12;
	}
	public void setTipoPedido12(TipoPedido tipoPedido12) {
		this.tipoPedido12 = tipoPedido12;
	}
	public TipoPedido getTipoPedido13() {
		return tipoPedido13;
	}
	public void setTipoPedido13(TipoPedido tipoPedido13) {
		this.tipoPedido13 = tipoPedido13;
	}
	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

}
