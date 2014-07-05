/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fandita.web;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */

 @Controller
@RequestMapping("/servicio-calificaciones")
 
public class Examen {
    
 
 @RequestMapping(value="/todos", method=RequestMethod.GET, headers=("Accept=text/html"))  

  @ResponseBody ArrayList<Evaluacion> aqui(){
    return GeneradorCalificaciones.generarCalificaciones();
}
}
