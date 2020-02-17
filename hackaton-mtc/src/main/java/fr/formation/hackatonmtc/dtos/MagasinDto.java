package fr.formation.hackatonmtc.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class MagasinDto {

    @NotEmpty
    @Size(max = 100)
    private int[] nbArticlesByClient;

    @NotEmpty
    @Size(max = 100)
    private int[] velocites;

    public int[] getNbArticlesByClient() {
        return nbArticlesByClient;
    }

    public void setNbArticlesByClient(int[] nbArticlesByClient) {
        this.nbArticlesByClient = nbArticlesByClient;
    }

    public int[] getVelocites() {
        return velocites;
    }

    public void setVelocites(int[] velocite) {
        this.velocites = velocite;
    }
}
