public class Aviao extends Aeronave {

    private String capacidade;
    private String prefixo;  

    public Aviao(
        int id,
        String modelo,
        String marca,
        String companhia,
        String capacidade,
        String prefixo

    ){
        super(modelo,companhia);
        this.capacidade = capacidade;
        this.prefixo = prefixo;
    }

    public String getCapacidade(){
        return capacidade;

    }
    public void setCapacidade(String capacidade){
        this.capacidade = capacidade;
    }
    public String getPrefixo(){
        return prefixo;
    }
    public void setPrefixo(String prefixo){
        this.prefixo = prefixo;
    }

   

    @Override
    public String toString(){
        return "Modelo: " + super.getModelo() + "\n"
            + "Companhia" + super.getCompanhia() + "\n"
            + "Capacidade: " + capacidade + "\n"
            + "Prefixo: " + prefixo + "\n";
    }
}
