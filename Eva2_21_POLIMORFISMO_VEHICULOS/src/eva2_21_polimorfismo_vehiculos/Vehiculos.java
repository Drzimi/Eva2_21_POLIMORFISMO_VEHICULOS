/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_21_polimorfismo_vehiculos;

/**
 *
 * @author invitado
 */
public class Vehiculos {
    private String Marca;
    private int Velocidad;

    public Vehiculos(){
    super();
    this.Marca = "";
     this.Velocidad = 0;
    
}
    public Vehiculos(String Marca, int Velocidad) {
        this.Marca = Marca;
        this.Velocidad = Velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }
    interface ControlarDatos{
        void CambiarVelocidad(int cambio);
        public abstract void tablerp();
    }
    class Automovil extends Vehiculos implements ControlarDatos{
        private String modelo;
        private int año;
         public Automovil(){
             super();
            this.modelo = "";
            this.año = 0;
       }
        public Automovil(String marca , int velocidad , String modelo, int año) {
            super(Marca,Velocidad);
            this.modelo = modelo;
            this.año = año;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            this.año = año;
        }

        @Override
        public void CambiarVelocidad(int cambio) {
            int vel = Velocidad + cambio;
            if(vel >= 0 ){
                Velocidad = vel;
            }
        }

        @Override
        public void tablerp() {
            System.out.println("Velocidad:" + Velocidad);
            System.out.println("Gasofa:" + "Pendiente");
            System.out.println("Revolucin:" + "Pendiente");
            
        }
        
    }
    
    class Bicicleta extends Vehiculos implements ControlarDatos{
        private String tipo;

        public Bicicleta() {
            this.tipo = "";
        }
        
        public Bicicleta(String tipo) {
            this.tipo = tipo;
        }

        public Bicicleta(String tipo, String Marca, int Velocidad) {
            super(Marca, Velocidad);
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        @Override
        public void CambiarVelocidad(int cambio) {
            int vel = Velocidad + cambio;
            if(vel >= 0 ){
                Velocidad = vel;
            }
        }

        @Override
        public void tablerp() {
            System.out.println("Velocidad" + Velocidad);
            System.out.println("Gasofa:" + "Pendiente");
            System.out.println("Revolucin:" + "Pendiente");
        }
        
    }
}
