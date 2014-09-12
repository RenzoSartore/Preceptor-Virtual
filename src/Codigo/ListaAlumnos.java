package Codigo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Renzo Sartore
 */
public abstract class ListaAlumnos {

    //Pongo de manera estatica y no modificable la cantidad de personas que tiene
    //el array, nos sirve por si necesitamos saber esto mismo en otro lado del código.
    public final static int CANTIDAD = 10;
    private static Alumnos[] lista = new Alumnos[CANTIDAD];
    //Elementos para guardar el archivo
    private static String archivo = "array.db";
    private static FileInputStream fis = null;
    private static ObjectInputStream ois = null;
    private static FileOutputStream fos = null;
    private static ObjectOutputStream oos = null;

    public static boolean addAlumnos(Alumnos a) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = a;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "estoy bien guacho0";
    }

    public static Alumnos[] getLista() {
        return lista;
    }

    public static void setLista(Alumnos[] lista) {
        ListaAlumnos.lista = lista;
    }

    public static void setArchivo(String archivo) {
        ListaAlumnos.archivo = archivo;
    }

    public static void setFis(FileInputStream fis) {
        ListaAlumnos.fis = fis;
    }

    public static void setOis(ObjectInputStream ois) {
        ListaAlumnos.ois = ois;
    }

    public static void setFos(FileOutputStream fos) {
        ListaAlumnos.fos = fos;
    }

    public static void setOos(ObjectOutputStream oos) {
        ListaAlumnos.oos = oos;
    }
    
    public static void del(int indice) {
        lista[indice-1] = null;
    }
    
    
    
    
 
    public static Alumnos[] getBuscaCurso(String curso){
    Alumnos[] ListaAux = new Alumnos[150];
    int cont=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] !=null) {
                if (lista[i].getCurso().compareTo(curso) ==0) {
                    ListaAux[cont] = lista[i];
                    cont++;
                    }
            }
        }
    return ListaAux;
}

    public static boolean saveLista() {

        boolean saved = false;

        try {
            fos = new FileOutputStream(archivo);
            oos = new ObjectOutputStream(fos);
            //Esta es otra forma de hacer un for, la sintaxis es la siguiente:
            //for (Clase aux:array), recorre el array y se lo asigna al auxiliar.
            oos.writeObject(lista);

        } catch (FileNotFoundException ex) {
            System.out.println("No se encuentra el archivo");
            return false;
        } catch (IOException ex) {
            System.out.println("Error al guardar el archivo");
            return false;
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                    oos = null;
                }
                if (fos != null) {
                    fos.close();
                    fos = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }

        System.out.println("Guardado Correctamente");
        return true;
    }

    /*
     * asd Devuelve un arraylist con las ventas en disco
     */
    public static boolean levantarObjetoEntero() {
        Alumnos[] aux = null;

        try {
            fis = new FileInputStream(archivo);
            ois = new ObjectInputStream(fis);

            aux = (Alumnos[]) ois.readObject();
            System.out.println(aux.length);

        } catch (Exception e1) {
            System.out.println("Error!!!" + e1);
            return false;
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                    ois = null;
                }
                if (fis != null) {
                    fis.close();
                    fis = null;
                }
            } catch (IOException e) {
                System.out.println("Error al cerrar archivo");
            }
        }
        lista = aux;
        return true;
    }
}
