package br.com.aula.calcularvolumesolidos.solidos;

/**
 * Created by jsoft-ti on 23/01/18.
 */

public class PrismaTriangular extends PrismaRetangular {

    @Override
    public double calcularVolume() {
        return ((this.getBase()*this.getAlturaBase())/2)*this.getAlturaPrisma();
    }
}
