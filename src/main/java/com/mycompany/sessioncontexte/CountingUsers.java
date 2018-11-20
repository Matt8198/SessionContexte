/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sessioncontexte;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author Matthias
 */
public class CountingUsers implements HttpSessionListener {

    private int numberOfUsers = 0;

    public void sessionCreated(HttpSessionEvent se) {
// On incrémente le nombre d'utilisateurs
        numberOfUsers++;
// On stocke ce nombre dans le contexte d'application
        se.getSession().getServletContext()
                .setAttribute("numberConnected",
                        numberOfUsers);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        numberOfUsers--;
        se.getSession().getServletContext()
                .setAttribute("numberConnected", numberOfUsers);
    }
}
