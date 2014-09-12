/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Renzo Sartore
 */
public class Alumnos implements Serializable{
    public ImageIcon GOOD = new ImageIcon(getClass().getResource("/imagenes/tick.png"));
    public ImageIcon BAD = new ImageIcon(getClass().getResource("/imagenes/x.png"));
    
    private String Nombre;
    private String Apellido;
    private boolean falta;
    private int obvsrvacion;
    private String curso;
    
    
    public Alumnos(String Nombre, String Apellido, boolean falta, int obvsrvacion, String curso) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.falta = falta;
        this.obvsrvacion = obvsrvacion;
        this.curso = curso;
        
            System.out.println("contructor");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
     
        public ImageIcon getFaltaIcon(){
        if (this.falta==true){
            return GOOD;
        }        
            return BAD;        
    }
        
            public String getFaltaString(){
        if (this.falta==true){
            return "Asistio";
        }        
            return "Ausente";        
    }
        

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public boolean getFalta() {
        return falta;
    }

    public void setFalta(boolean falta) {
        this.falta = falta;
    }

    public int getObvsrvacion() {
        return obvsrvacion;
    }

    public void setObvsrvacion(int obvsrvacion) {
        this.obvsrvacion = obvsrvacion;
    }
    
        public String toString(){
        return this.Apellido + "," +this.Nombre +" - " + this.obvsrvacion;
    }
    
}
