package com.company;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {


        Posiljka p1 = new Posiljka("Herbalife", 200.0, "Kopaonicka 48", "Kragujevac", "34000", 0601531174);
        SistemPosiljki posiljkaList = new SistemPosiljki();

        try {
            posiljkaList.dodajPosiljku(p1);
        } catch (PoštanskiBrojNijeValidanException e1) {
            e1.printStackTrace();
        } catch (GradNijeValidanException e1) {
            e1.printStackTrace();
        }



}
}

