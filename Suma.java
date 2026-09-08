public class Suma {
    private int numA, numB, numC;

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int getNumC() {
        return numC;
    }

    public void setNumC(int numC) {
        this.numC = numC;
    }

    public int suma() {
        int resultado = numA + numB + numC;
        System.out.println("El resultado de la suma es: " + resultado);
        return resultado;
    }
}