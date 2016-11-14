/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strateji;

/**
 *
 * @author LENOVO
 */
public class Strateji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordek yabanordegi = new YabanOrdegi();
        yabanordegi.OtmeGerceklestir();
        yabanordegi.UcusGerceklestir();
        
        Ordek ornek = new OrnekOrdek();
        ornek.UcusGerceklestir();
        ornek.UcmaDavranisiAta(new RoketleUc());
        ornek.UcusGerceklestir();
    }
    
}
