
package source;


public class Empleado {
    private String codigo;
    private String nombres;
    private String areaLaboral; // (Sistemas,Administración, Marketing)
    private double sueldo;
    private int horasExtras;
    private double montoHorasExtra;
    private String afiliación; // (AFP o SNP)
    private double descuento;
    private double sueldoNeto;
    private double sueldoBruto;
    private double porcDescAFP = 0.11;
    private double porcDescSNP = 0.06;
    private double porcDescSalud = 0.03;

    public Empleado(String codigo, String nombres, String areaLaboral, float sueldo, int horasExtras, String afiliación) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.areaLaboral = areaLaboral;
        this.sueldo = sueldo;
        this.horasExtras = horasExtras;
        this.afiliación = afiliación;
        calcularHorasExtra();
        calcularDescuento();
        calcularSueldos();
    }
    
    void calcularHorasExtra(){
        montoHorasExtra = (sueldo * horasExtras / 240);
    }
    
    void calcularDescuento(){
        switch (afiliación) {
            case "AFP" -> descuento = (sueldo * porcDescAFP) + (sueldo * porcDescSalud);
            case "SNP" -> descuento = (sueldo * porcDescSNP) + (sueldo * porcDescSalud);
        }
    }
    
    void calcularSueldos(){
        sueldoNeto = sueldo + montoHorasExtra;
        sueldoBruto = sueldoNeto - descuento;
    }
    
    @Override
    public String toString() {
        return String.format("[EMPLEADO]\n CODIGO: %s\n NOMBRE: %s\n AREA LABORAL: %s\n SUELDO: %.2f\n HORAS EXTRA: %d\n AFILIACION: %s\n\n[+] DATOS ADICIONALES:\n + MONTO HORAS EXTRA: %.2f\n - DESCUENTO POR AFILIACION: %.2f\n\n[-------------]\n SUELDO NETO: %.2f\n SUELDO BRUTO: %.2f\n\n*----------------------------------*\n", codigo, nombres, areaLaboral, sueldo, horasExtras, afiliación, montoHorasExtra, descuento, sueldoNeto, sueldoBruto);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getÁreaLaboral() {
        return areaLaboral;
    }

    public void setÁreaLaboral(String áreaLaboral) {
        this.areaLaboral = áreaLaboral;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getMontoHorasExtra() {
        return montoHorasExtra;
    }

    public void setMontoHorasExtra(double montoHorasExtra) {
        this.montoHorasExtra = montoHorasExtra;
    }

    public String getAfiliación() {
        return afiliación;
    }

    public void setAfiliación(String afiliación) {
        this.afiliación = afiliación;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getSueldoNeto() {
        return sueldoNeto;
    }

    public void setSueldoNeto(double sueldoNeto) {
        this.sueldoNeto = sueldoNeto;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
}
