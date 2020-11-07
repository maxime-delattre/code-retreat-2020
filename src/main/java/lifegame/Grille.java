package lifegame;

import java.util.List;
import java.util.stream.Collectors;

public class Grille {

    private List<Cellule> cellulesVivantes;

    public Grille(List<Cellule> cellulesVivantes) {
        this.cellulesVivantes = cellulesVivantes;
    }

    public Grille(Grille grilleInitiale) {
        List<Cellule> cellulesInitales = grilleInitiale.getCellulesVivantes();

        this.cellulesVivantes = cellulesInitales.stream()
                .filter(cellule -> {
                    long nbCellules = cellulesInitales.stream()
                            .filter(celluleInitale -> celluleInitale.aEstCoté(cellule.getX(), cellule.getY()))
                            .count();
                    return nbCellules >= 3L && nbCellules < 5L;
                })
                .collect(Collectors.toList());
    }

    public List<Cellule> getCellulesVivantes() {
        return this.cellulesVivantes;
    }
}
