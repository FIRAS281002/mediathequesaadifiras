package mediatheque;

public interface Empruntable {
    void emprunter() throws DocumentIndisponibleException; // cheked engage toutes les implementations
    void rendre();
    boolean estDisponible();
}
