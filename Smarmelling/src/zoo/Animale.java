package zoo;

public class Animale {
     private String nome;
     private String cibo_preferito;
     private int età;
     private String data_ingresso_zoo;
     private int peso;
     private int altezza;

     public Animale() {
     }

     public Animale(String nome, String cibo_preferito, int età, String data_ingresso_zoo, int peso, int altezza) {
          this.nome = nome;
          this.cibo_preferito = cibo_preferito;
          this.età = età;
          this.data_ingresso_zoo = data_ingresso_zoo;
          this.peso = peso;
          this.altezza = altezza;
     }

     public String getNome() {
          return nome;
     }

     public void setNome(String nome) {
          this.nome = nome;
     }

     public String getCibo_preferito() {
          return cibo_preferito;
     }

     public void setCibo_preferito(String cibo_preferito) {
          this.cibo_preferito = cibo_preferito;
     }

     public int getEtà() {
          return età;
     }

     public void setEtà(int età) {
          this.età = età;
     }

     public String getData_ingresso_zoo() {
          return data_ingresso_zoo;
     }

     public void setData_ingresso_zoo(String data_ingresso_zoo) {
          this.data_ingresso_zoo = data_ingresso_zoo;
     }

     public int getPeso() {
          return peso;
     }

     public void setPeso(int peso) {
          this.peso = peso;
     }

     public int getAltezza() {
          return altezza;
     }

     public void setAltezza(int altezza) {
          this.altezza = altezza;
     }
}
