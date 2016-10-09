/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.example.MonitorBC;
import org.springframework.beans.factory.annotation.Autowired;

@Path("monitor")
public class DemoRest {

    @Autowired
    private MonitorBC monitorBC;

    @GET
    public String iniciado() {
        String msg = monitorBC.logServiceAccess("Demo");
        return msg;
    }
}
