/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanpertama;

/**
 *
 * @author ASUS
 */
public class Aves extends Hewan {
    private String warnabulu;
    private String habitat;
    
    public void setwarnabulu(String warnabulu){
        this.warnabulu = warnabulu;
    }
    public String getwarnabulu(){
        return this.warnabulu;
    }
    public void sethabitat(String habitat) {
        this.habitat = habitat;
    }
    public String gethabitat() {
        return this.habitat;
    }
}
