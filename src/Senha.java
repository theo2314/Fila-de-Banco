public class Senha {

    private String tipo;
    private int numero;
    
    public Senha(){
        this("", 0);
    }
    
    public Senha(String tipo, int numero) {
        this.tipo = tipo;
        this.numero = numero;
    }
    
    @Override
    public String toString(){
        return this.getTipo() + "-" + this.getNumero();
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
