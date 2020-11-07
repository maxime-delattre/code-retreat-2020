package lifegame;

import java.util.List;

public class Grille {

    private List<Cellule> cellules;

    public Grille(Grille grille) {
    }

    public List<Cellule> getCellules() {
        return cellules;
    }

    public void setCellules(List<Cellule> cellules) {
        this.cellules = cellules;
    }
}
