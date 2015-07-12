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
public enum ContactType {
    Mobile,
    Telephone,
    Home,
    Work,
    Fax,
    E_mail,
    Web,
    TeamViwerId,;
    
    public String getValues() {
        switch (this) {
            case Mobile:
                return "Mobile";
            case Telephone:
                return "Telephone";
            case Home:
                return "Home";
            case Work:
                return "Work";
            case Fax:
                return "Fax";
            case E_mail:
                return "E-mail";
            case Web:
                return "Web Address";
            case TeamViwerId:
                return "Team Viwer";

        }
        return "Other";
    }
}
