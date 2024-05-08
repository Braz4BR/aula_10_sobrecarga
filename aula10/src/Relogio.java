public class Relogio {
    private int hora;
    private int minuto;
    private int segundo;
//construtor vazio
    public Relogio (){

    }
// tradicional (inserindo todos os atributos)
    public Relogio(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
// 2ª versão: inserindo apenas hora e minuto
    public Relogio(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        segundo = 0;
    }
// 3ª versão: inserindo apenas hora
    public Relogio(int hora){
        this.hora = hora;
        segundo = 0;
        minuto = 0;
    }
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    public int getSegundo() {
        return segundo;
    }
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }


}
