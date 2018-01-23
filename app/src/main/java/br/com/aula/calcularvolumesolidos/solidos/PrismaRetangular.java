package br.com.aula.calcularvolumesolidos.solidos;

/**
 * Created by jsoft-ti on 23/01/18.
 */

public class PrismaRetangular implements Solido {
    private double base;
    private double alturaBase;
    private double alturaPrisma;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAlturaBase() {
        return alturaBase;
    }

    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    public double getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(double alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    @Override
    public double calcularVolume() {
        return this.base*this.alturaBase*this.alturaPrisma;
    }
}
