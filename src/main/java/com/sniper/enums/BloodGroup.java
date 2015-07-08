/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sniper.enums;

/**
 *
 * @author Sniper619
 */
public enum BloodGroup {

    A_positive,
    AB_positive,
    B_positive,
    O_positive,
    A_negaitive,
    AB_negaitive,
    B_negaitive,
    O_negaitive,;

    public String getValues() {
        switch (this) {
            case A_positive:
                return "A+";
            case AB_positive:
                return "AB+";
            case B_positive:
                return "B+";
            case O_positive:
                return "O+";
            case A_negaitive:
                return "A-";
            case AB_negaitive:
                return "AB-";
            case B_negaitive:
                return "B-";
            case O_negaitive:
                return "O-";

        }
        return "Other";
    }
}
