package lifegame;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LifeGameTest {

    @Test
    void nouvelle_grille_avec_une_cellule_vivante_alors_la_grille_a_une_cellule_vivante() {
    	// arrange
        Cellule celulleVivante = new Cellule(0, 0);

        // act
        Grille grille = new Grille(List.of(celulleVivante));

    	// assert
        assertThat(grille.getCellulesVivantes()).hasSize(1);
    }


    @Test
    void quand_une_seule_cellule_vivante_alors_elle_meurt() {
    	// arrange
        Cellule celulleVivante = new Cellule(0, 0);
        Grille grilleInitiale = new Grille(List.of(celulleVivante));

        // act
        Grille grilleSuivante = new Grille(grilleInitiale);

        // assert
        assertThat(grilleSuivante.getCellulesVivantes()).isEmpty();
    }

    @Test
    void quand_deux_cellules_vivantes_cote_a_cote_alors_elles_meurents() {
        // arrange
        Cellule celulleVivante = new Cellule(0,0);
        Cellule celulleVivante2 = new Cellule(0,1);
        Grille grilleInitiale = new Grille(List.of(celulleVivante, celulleVivante2));

        // act
        Grille grilleSuivante = new Grille(grilleInitiale);

        // assert
        assertThat(grilleSuivante.getCellulesVivantes()).isEmpty();
    }

    @Test
    void quand_4_cellules_en_carré_alors_elles_survivent() {
        // arrange
        Cellule celulleVivante = new Cellule(0,0);
        Cellule celulleVivante2 = new Cellule(0,1);
        Cellule celulleVivante3 = new Cellule(1,1);
        Cellule celulleVivante4 = new Cellule(1,0);
        Grille grilleInitiale = new Grille(List.of(celulleVivante, celulleVivante2, celulleVivante3, celulleVivante4));

        // act
        Grille grilleSuivante = new Grille(grilleInitiale);

        // assert
        assertThat(grilleSuivante.getCellulesVivantes()).contains(
                celulleVivante, celulleVivante2, celulleVivante3, celulleVivante4
        );
    }

    @Test
    void quand_une_cellule_a_plus_de_3_cellules_autour_alors_elle_meurt() {
        // arrange
        Cellule celulleVivante = new Cellule(0,1);
        Cellule celulleVivante2 = new Cellule(1,0);
        Cellule celulleVivante3 = new Cellule(1,1);
        Cellule celulleVivante4 = new Cellule(1,2);
        Cellule celulleVivante5 = new Cellule(2,1);
        Grille grilleInitiale = new Grille(List.of(
                celulleVivante, celulleVivante2, celulleVivante3, celulleVivante4, celulleVivante5)
        );

        // act
        Grille grilleSuivante = new Grille(grilleInitiale);

        // assert
        assertThat(grilleSuivante.getCellulesVivantes()).containsExactly(
                celulleVivante, celulleVivante2, celulleVivante4, celulleVivante5
        );
    }

    @Test
    void quand_qsdfqsdf() {
        // arrange
        Cellule celulleVivante = new Cellule(0,1);
        Cellule celulleVivante2 = new Cellule(1,0);
        Cellule celulleVivante3 = new Cellule(1,1);
        Cellule celulleVivante4 = new Cellule(1,2);
        Grille grilleInitiale = new Grille(List.of(
                celulleVivante, celulleVivante2, celulleVivante3, celulleVivante4)
        );

        // act
        Grille grilleSuivante = new Grille(grilleInitiale);

        // assert
        Cellule celulleVivante5 = new Cellule(2,1);
        assertThat(grilleSuivante.getCellulesVivantes()).containsExactly(
                celulleVivante, celulleVivante2, celulleVivante4, celulleVivante5, celulleVivante3
        );
    }


}
