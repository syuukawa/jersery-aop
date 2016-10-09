/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ednilson
 */
@RestController
public class SpringRest {

    @Autowired
    private MonitorBC monitorBC;

    @RequestMapping("init")
    public String init() {
        String msg = monitorBC.logServiceAccess("Demo");
        return msg;
    }
}
