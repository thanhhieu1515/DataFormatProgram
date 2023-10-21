/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import view.Menu;

public class ValidateProgram extends Menu<String>{
    static String[] options = {"Check phone number", "Check email", "Check date", "Exit"};
    Algorithm ar;
    public ValidateProgram() {
        super("===== VALIDATE PROGRAM =====", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 -> ar.checkPhoneNumber();
            case 2 -> ar.checkEmail();
            case 3 -> ar.checkDate();
            case 4 -> System.exit(0);
        }
    }
}
