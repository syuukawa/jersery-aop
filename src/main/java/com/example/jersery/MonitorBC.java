/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jersery;

import org.springframework.stereotype.Component;

/**
 *
 * @author ednilson
 */
@Component
public class MonitorBC {

    public String logServiceAccess(String test) {
        return "Service: "+test;
    }

}
