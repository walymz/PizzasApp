package principal.entities;
import principal.enums.Estado;
import principal.enums.TipoPizza;
import principal.enums.Tamano;
import java.util.Calendar;

public class Pizza {

    private int id;   
    private TipoPizza tipoPizza;
    private Tamano tamano;
    private Estado estado;
    private Tiempo duracion;
    private long duracionMilisegundos;
    private Tiempo tiempoInicio;
    private Tiempo tiempoFin;
    private static int cantidadPedida=0;
    private static int cantidadServida=0;

    public Pizza(TipoPizza tipoPizza, Tamano tamano) {
        this.tipoPizza = tipoPizza;
        this.tamano = tamano;
        this.id=cantidadPedida+1;
        pedir(); //Se ejecuta automáticamente al crear el objeto pizza
    }

    @Override
    public String toString() {
        return "Pizza " +id+": "+ tipoPizza.toString().toString().replace("_"," ") + ", " + tamano + " (" + estado+" a las "+(estado==Estado.PEDIDA?tiempoInicio:tiempoFin)+", DURACION: "+(duracion==null?"0":duracion)+")";
    }
    public long getDuracionMilisegundos(){
        return duracionMilisegundos;
    }
    public void pedir() {
       cantidadPedida++; //Se incrementa la variable estática cantidadPedida
       estado = Estado.PEDIDA; //Se cambia el estado de la pizza
       tiempoInicio = new Tiempo(Calendar.getInstance()); //Se genera un nuevo objeto de la clase tiempo que pasa por constructor la hora actual
       System.out.println("Pizza "+id+" "+this.toString()+" pedida a las "+tiempoInicio); // Para verificar por consola los datos de la petición
    }
    
    public String servir(){
        estado = Estado.SERVIDA; //Cambia el estatus
        cantidadServida++;  //Incrementa la cantidad de la variable estática cantidadServida
        tiempoFin = new Tiempo(Calendar.getInstance()); //Obtiene un objeto de Tiempo con la hora actual del sistema
        /*
        La siguiente línea obtiene un objeto tiempo vacío y a la vez se invoca el método getDuracion(), el cual
        recibe por paránetro el tiempo de inicio y fin de la pizza y devuelve un objeto tiempo 
        con la diferencia de tiempo entre uno y otro
        */
        duracion = new Tiempo().getDuracion(tiempoInicio.getTiempo(), tiempoFin.getTiempo()); 
        duracionMilisegundos=duracion.getDuracionMilisegundos();
        //Retorna un string con la información y el toString de duracion
        return "Pizza "+id+" servida a las "+tiempoFin+", duración: "+duracion;
    }

    //Getter y setter
    
    public Tiempo getTiempoInicio() {
        return tiempoInicio;
    }

    public Tiempo getTiempoFin() {
        return tiempoFin;
    }

    public static int getCantidadPedida() {
        return cantidadPedida;
    }

    public static int getCantidadServida() {
        return cantidadServida;
    }
    
    public int getId() {
        return id;
    }

    public TipoPizza getTipoPizza() {
        return tipoPizza;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public Estado getEstado() {
        return estado;
    }

    public Tiempo getDuracion() {
        return duracion;
    }

    public void setTipoPizza(TipoPizza tipoPizza) {
        this.tipoPizza = tipoPizza;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setTiempoInicio(Tiempo aTiempoInicio) {
        tiempoInicio = aTiempoInicio;
    }

    public void setTiempoFin(Tiempo aTiempoFin) {
        tiempoFin = aTiempoFin;
    }
}
