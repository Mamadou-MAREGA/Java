public class Chien extends Canin {

    public Chien(){}

    public Chien(String couleur, int poids)
    {
        this.couleur = couleur;
        this.poids = poids;
    }
    @Override
    void crier() {
        System.out.println("j'abois sans raison !");
    }
}
