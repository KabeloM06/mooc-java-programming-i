/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmpre
 */
public class Whistle {
    private String sound;
    
    
    public Whistle(String whistleSound){
        this.sound = whistleSound;
    }
    public void sound(){
//        Whistle duckWhistle = new Whistle("Kvaak");
//        Whistle roosterWhistle = new Whistle("Peef");
        System.out.println(sound);
    }
}
