package lifegame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LifeGameTest {

    @Test
    void avec_grille_9_et_cellule_centrale_vivante_alors_nouvelle_grille_a_9_cellules_mortes() {
    	// arrange
        List<Cellule> cellules = List.of(ce)
        Grille grilleInitiale = new Grille(cellules);

        // act
        Grille grilleObtenue = new Grille(grilleInitiale);

    	// assert
        grilleObtenue.getCellules().forEach(cellule -> assertThat(cellule.isAlive()).isFalse());
    }
}
