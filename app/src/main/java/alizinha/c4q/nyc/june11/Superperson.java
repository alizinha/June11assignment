package alizinha.c4q.nyc.june11;

import java.util.List;

/**
 * Created by c4q-Allison on 6/11/15.
 */
abstract public class Superperson {

    private String name;
    private String secretIdentity;
    private List powers;


    protected Superperson(String name, String secretIdentity, List powers) {
        this.name = name;
        this.secretIdentity = secretIdentity;
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }

    public List getPowers() {
        return powers;
    }

    public void setPowers(List powers) {
        this.powers = powers;
    }
}
