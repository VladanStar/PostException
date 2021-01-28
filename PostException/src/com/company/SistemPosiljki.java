package com.company;

import java.util.ArrayList;

public class SistemPosiljki {
    ArrayList<Posiljka> posiljke = new ArrayList<Posiljka>();

    public void dodajPosiljku(Posiljka p) throws PoštanskiBrojNijeValidanException, GradNijeValidanException {
        if (p.getPostBroj().length() !=5) {
            throw new PoštanskiBrojNijeValidanException("Postanski broj nije validan");
        }
        else if(p.getGrad().length()<2){
            throw new GradNijeValidanException("Grad nije validno ime");
        }
            else {
            posiljke.add(p);
        }
    }

}
