package pgpi.backend_pgpi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/v1")
public class MainController {
	  @Autowired
	  private MuelleRepository muelleRepository;
	  @Autowired
	  private PedidoRepository pedidoRepository;
	  @Autowired
	  private ReservaRepository reservaRepository;
	  @Autowired
	  private TipoPedidoRepository tipoPedidoRepository;
	  @Autowired
	  private TipoVehiculoRepository tipoVehiculoRepository;

  @PostMapping(path="/muelle/")
  public @ResponseBody String addNewMuelle (@RequestParam int tipoVehiculoId
		  , @RequestParam int tipoPedido6Id, @RequestParam int tipoPedido7Id, @RequestParam int tipoPedido8Id, @RequestParam int tipoPedido9Id
		  , @RequestParam int tipoPedido10Id, @RequestParam int tipoPedido11Id, @RequestParam int tipoPedido12Id, @RequestParam int tipoPedido13Id) {
	  Optional<TipoVehiculo> optional = tipoVehiculoRepository.findById(tipoVehiculoId);
		
		// Si existe el CheckList, se crea el item, y se mete en su repositorio
		if (optional.isPresent()) {
			Muelle muelle = new Muelle();
			muelle.setTipoVehiculo(optional.get());
			
			Optional<TipoPedido> optional6 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido6(optional6.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 6 Id does not exist";
			}
			
			Optional<TipoPedido> optional7 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido7(optional7.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 7 Id does not exist";
			}
			
			Optional<TipoPedido> optional8 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido8(optional8.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 8 Id does not exist";
			}
			
			Optional<TipoPedido> optional9 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido9(optional9.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 9 Id does not exist";
			}
			
			Optional<TipoPedido> optional10 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido10(optional10.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 10 Id does not exist";
			}
			
			Optional<TipoPedido> optional11 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido11(optional11.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 11 Id does not exist";
			}
			
			Optional<TipoPedido> optional12 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido12(optional12.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 12 Id does not exist";
			}
			
			Optional<TipoPedido> optional13 = tipoPedidoRepository.findById(tipoPedido6Id);
			
			// Si existe el CheckList, se crea el item, y se mete en su repositorio
			if (optional.isPresent()) {
				muelle.setTipoPedido13(optional13.get());
			}
			// Si no existe el CheckList, error
			else {
				return "Tipo Vehiculo 13 Id does not exist";
			}
			
		    muelleRepository.save(muelle);
		    return "Saved muelle";
		}
		// Si no existe el CheckList, error
		return "Tipo Vehiculo Id does not exist";
  }

  @PostMapping(path="/pedido/")
  public @ResponseBody String addNewPedido (@RequestParam int pedidoId) {
	  Pedido pedido = new Pedido();
	  pedido.setPedidoId(pedidoId);
	  pedidoRepository.save(pedido);
	  return "Saved pedido";
  }

  @PostMapping(path="/reserva/")
  public @ResponseBody String addNewReserva (@RequestParam String matricula, @RequestParam int tipoVehiculoId, @RequestParam int horaInicio,
		  @RequestParam int pedidoId, @RequestParam int tipoPedidoId, @RequestParam int muelleId) {
	  Reserva reserva = new Reserva();
	  Optional<TipoVehiculo> tipoVehiculo = tipoVehiculoRepository.findById(tipoVehiculoId);
	  Optional<Pedido> pedido = pedidoRepository.findById(pedidoId);
	  Optional<TipoPedido> tipoPedido = tipoPedidoRepository.findById(tipoPedidoId);
	  Optional<Muelle> muelle = muelleRepository.findById(muelleId);

	  if (!tipoVehiculo.isPresent()) {
		  return "Tipo Vehiculo Id does not exist";
	  }
	  if (!pedido.isPresent()) {
		  return "Pedido Id does not exist";
	  }
	  if (!tipoPedido.isPresent()) {
		  return "Tipo Pedido Id does not exist";
	  }
	  if (!muelle.isPresent()) {
		  return "Muelle Id does not exist";
	  }
	  
	  reserva.setHoraInicio(horaInicio);
	  reserva.setMatricula(matricula);
	  reserva.setPedido(pedido.get());
	  reserva.setMuelle(muelle.get());
	  reserva.setTipoPedido(tipoPedido.get());
	  reserva.setTipoVehiculo(tipoVehiculo.get());
	  reservaRepository.save(reserva);
	  return "Saved reserva";
  }
  
  @PutMapping(path="/reserva/")
  public @ResponseBody String editReserva (@RequestParam Integer id, @RequestParam String matricula) {
	  Optional<Reserva> optional = reservaRepository.findById(id);

	  if (!optional.isPresent()) {
		  return "Reserva Id does not exist";
	  }
	  
	  Reserva reserva = optional.get();
	  
	  reserva.setMatricula(matricula);
	  reservaRepository.save(reserva);
	  return "Reserva Modified";
  }
  
  @DeleteMapping(path="/reserva/")
  public @ResponseBody String deleteReserva (@RequestParam Integer id) {
	  Optional<Reserva> optional = reservaRepository.findById(id);

	  if (!optional.isPresent()) {
		  return "Reserva Id does not exist";
	  }
	  reservaRepository.deleteById(id);
	  return "Reserva Deleted";
  }

  @GetMapping(path="/reserva/") // Peticiones GET
  public @ResponseBody Iterable<Reserva> getReservas(@RequestParam(required=false) Integer[] ids, @RequestParam(required=false) String matricula
		  , @RequestParam(required=false) Integer muelleId, @RequestParam(required=false) Integer horaInicio) {
    // Si no se recibi id, se devuelven todas las CheckLists
	if (ids == null) {
		if (matricula == null) {
			if (muelleId == null || horaInicio == null) {
				return reservaRepository.findAll();
			}
			Optional<Muelle> muelle = muelleRepository.findById(muelleId);
			if (!muelle.isPresent()) {
				return reservaRepository.findAllById(Arrays.asList(new Integer[]{-1}));
			}
			return reservaRepository.findByMuelleAndHoraInicio(muelle.get(), horaInicio);
		}
		return reservaRepository.findByMatricula(matricula);
	}
	// Se se recbe algun id, se devuelven solo esos
	Iterable<Integer> iterable = Arrays.asList(ids);
    return reservaRepository.findAllById(iterable);
  }
  
  @GetMapping(path="/validarReserva/")
  public @ResponseBody boolean validateReserva(@RequestParam String matricula, @RequestParam Integer hora, @RequestParam Integer minuto) {
    // Si no se recibi id, se devuelven todas las CheckLists
	Iterable<Reserva> reservas = reservaRepository.findByMatricula(matricula);
	for(Reserva reserva : reservas){
		if ((reserva.getHoraInicio() == hora && minuto <= 10) || 
				(reserva.getHoraInicio()-1 == hora && minuto >= 50)) {
			return true;
		}
	}
	return false;
  }
  
  @GetMapping(path="/proponerReserva/")
  public @ResponseBody ArrayList<PropuestaReserva> proposeReserva(@RequestParam Integer tipoPedidoId, @RequestParam Integer tipoVehiculoId) {

	  ArrayList<PropuestaReserva> propuestaReserva = new ArrayList<PropuestaReserva>();
	  Optional<TipoVehiculo> tipoVehiculo = tipoVehiculoRepository.findById(tipoVehiculoId);	
	  if (!tipoVehiculo.isPresent()) {
		  return propuestaReserva;
	  }
	  
	  Iterable<Muelle> muelles = muelleRepository.findByTipoVehiculo(tipoVehiculo.get());
	  
	  for(Muelle muelle : muelles) {
		  if(muelle.getTipoPedido6().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 6));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido7().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 7));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido8().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 8));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido9().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 9));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido10().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 10));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido11().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 11));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido12().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 12));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
		  if(muelle.getTipoPedido13().getId() == tipoPedidoId) {
			  propuestaReserva.add(new PropuestaReserva(muelle.getId(), 13));
		  }
		  if(propuestaReserva.size() == 3) {
			  break;
		  }
	  }
	  return propuestaReserva;
  }

  @GetMapping(path="/muelle/") // Peticiones GET
  public @ResponseBody Iterable<Muelle> getMuelles(@RequestParam(required=false) Integer[] ids) {
    // Si no se recibi id, se devuelven todas las CheckLists
	if (ids == null) {
		return muelleRepository.findAll();
	}
	// Se se recbe algun id, se devuelven solo esos
	Iterable<Integer> iterable = Arrays.asList(ids);
    return muelleRepository.findAllById(iterable);
  }

  @GetMapping(path="/pedido/") // Peticiones GET
  public @ResponseBody Iterable<Pedido> getPedidos(@RequestParam(required=false) Integer[] ids) {
    // Si no se recibi id, se devuelven todas las CheckLists
	if (ids == null) {
		return pedidoRepository.findAll();
	}
	// Se se recbe algun id, se devuelven solo esos
	Iterable<Integer> iterable = Arrays.asList(ids);
    return pedidoRepository.findAllById(iterable);
  }
}