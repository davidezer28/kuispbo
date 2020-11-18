/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Controller;
import Model.Mahasiswa;
import View.MainMenuScreen;
import java.util.ArrayList;
/**
 *
 * @author Davjd
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MainMenuScreen mainMenuScreen = new MainMenuScreen();
        ArrayList<Mahasiswa> listMahasiswa = Controller.getAllMahasiswa();
        for(int i = 0; i < listMahasiswa.size(); i++){
            System.out.println(listMahasiswa.get(i).toString());
        }
    }
    
}
