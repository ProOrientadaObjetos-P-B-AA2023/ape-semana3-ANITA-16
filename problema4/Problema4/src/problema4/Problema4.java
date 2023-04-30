
package problema4;

class  EquipoCelulares{
    //atrivutos
    private String sistemaOperativo;
    private double tamanioPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double CostoFinal;
    private String mac;
    private long IMEI;
    public EquipoCelulares(){}
    //constructor
    public EquipoCelulares(String sistemaOperativo, double tamanioPantalla, double costoInicial, double iva, String mac, long IMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costoInicial = costoInicial;
        this.iva = iva;
        this.mac = mac;
        this.IMEI = IMEI;
    }
    //set - establecer
    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }
    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }
    public void setIMEI(long IMEI) {
        this.IMEI = IMEI;
    }
    //get - obtener
    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }
    public double getTamanioPantalla() {
        return this.tamanioPantalla;
    }
    public double getCostoInicial() {
        return this.costoInicial;
    }
    public double getIva() {
        return this.iva;
    }
    //calcular el iva del costo inicial 
    public double getIvaCostoInicial() {
        return this.ivaCostoInicial = this.costoInicial * (this.iva/100);
    }
    //calcular el costo final
    public double getCostoFinal() {
        return CostoFinal = this.costoInicial+ this.ivaCostoInicial;
    }
    public String getMac() {
        return mac;
    }
    public long getIMEI() {
        return IMEI;
    }
    public String toString(){
        String msj = String.format("        DATOS DEL DISPOSITIVO CELULAR "
                +"\n-------------------------------------------------"
                +"\nSistema Operativo: %s"
                +"\nTamanio de Pantalla: %.2f"
                +"\nCosto Inicial (sin IVA): %.2f" 
                +"\nIVA porcentaje: %.1f"
                +"\nIva del Costo Inicial : %.2f"
                +"\nCosto Final: %.2f"
                +"\nDireccion MAC: %s"
                +"\nDireccion IMEI: %d"
                , this.getSistemaOperativo(), this.getTamanioPantalla(),this.getCostoInicial()
                ,this.getIva(),this.getIvaCostoInicial(),this.getCostoFinal(),this.getMac(),this.getIMEI());
        return msj;
    }
}


public class Problema4 {
    
    public static void main(String[] args) {
        
        EquipoCelulares celular1 = new EquipoCelulares("Android",12.3,250,12,"99JKI43NA5",930028875);
        celular1.getIvaCostoInicial();
        celular1.getCostoFinal();
        System.out.println(celular1);
    }
    
}
