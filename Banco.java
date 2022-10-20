public class Banco{
    String nombre;
    String dueño;
    int topmundial;
    int empleados;

    public Banco(String n,String d,int t,int e){
        this.nombre = n;
        this.dueño = d;
        this.empleados = e;
        this.topmundial = t;
    }
    public void setName(String n){
        nombre = n;
    }
    public String getName(){
        return nombre;
    }
    public void setOwner(String n){
        dueño = n;
    }
    public String getOwner(){
        return nombre;
    }
    public void setEmp(int n){
        empleados = n;
    }
    public int getEmp(){
        return empleados;
    }
    public void setTop(int n){
        topmundial = n;
    }
    public int getTop(){
        return topmundial;
    }
    public void Contratar(int s){
        empleados = empleados + s;
    }
    public void cambiodedueño(String s){
        dueño = s;
    }
    public void ActTop(int s){
        topmundial = s;
    }

}
