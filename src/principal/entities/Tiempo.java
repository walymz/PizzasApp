package principal.entities;

import java.util.Calendar;
import java.util.TimeZone;

public class Tiempo {
    /*
    Esta clase almacena el tiempo obtenido mediante un parámetro tipo Calendar,
    luego almacena la hora, minutos y segundos contenidos en el Calendar tiempo
    */
    private Calendar tiempo;
    private int hora;
    private int minutos;
    private int segundos;

    public Tiempo() {
    }

    public Tiempo(Calendar tiempo) {
        /*
        Obtiene los valores del parámetro Calendar:
        y guarda el tiempo, hora, minutos y segundos
        */
        this.tiempo = tiempo;
        this.hora =tiempo.get(Calendar.HOUR_OF_DAY);
        this.minutos = tiempo.get(Calendar.MINUTE);
        this.segundos = tiempo.get(Calendar.SECOND);
    }

     public Tiempo getDuracion(Calendar tiempoInicio, Calendar tiempoFin){
         /*
        Obtiene dos objetos Calendar (tiempoInicio y tiempoFin), los transforma en milisegundos,
        obtiene la resta aritmética y los milisegunds resultantes se guardan en una variable long
        llamada diferencia, la misma se usa para crear otro objeto Calendar que automáticamente pasa
        los milisegundos a horas, minutos y segundos en su constructor.

        Posteriormente devuelve un objeto Tiempo nuevo, pasándole por constructor el objeto Calendar creado a partir 
        de la diferencia en milisegundos
        */
        long diferencia = tiempoFin.getTimeInMillis() - tiempoInicio.getTimeInMillis();
        Calendar diferenciaTiempo = Calendar.getInstance();
        diferenciaTiempo.setTimeZone(TimeZone.getTimeZone("UTC"));
        diferenciaTiempo.setTimeInMillis(diferencia);
    
        return new Tiempo(diferenciaTiempo);
    }
    public long getDuracionMilisegundos(){
        return tiempo.getTimeInMillis();
    }
    public Calendar getTiempo() {
        return tiempo;
    }
    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void setTiempo(Calendar tiempo) {
         /*
        Obtiene los valores del parámetro Calendar:
        y guarda el tiempo, hora, minutos y segundos
        */
        this.tiempo = tiempo;
        this.hora =tiempo.get(Calendar.HOUR_OF_DAY);
        this.minutos = tiempo.get(Calendar.MINUTE);
        this.segundos = tiempo.get(Calendar.SECOND);
    }
    @Override
    public String toString() {
        return hora + "h:" + minutos + "m:" + segundos+"s";
    }

    
    
}
