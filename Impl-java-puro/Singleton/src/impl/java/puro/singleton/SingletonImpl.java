package impl.java.puro.singleton;

public class SingletonImpl {

    private static SingletonImpl instancia;
    private String atributo;
    
    private SingletonImpl(){
        atributo = "Objeto criado";
    }

    public static SingletonImpl getInstance(){
        if(instancia ==null){
            instancia = new SingletonImpl();
        }
        return instancia;
    }

    public String getAtributo(){
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public class getInstance {
    }
    
    
}