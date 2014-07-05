/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fandita.web;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class GeneradorCalificaciones {
    
    public static ArrayList<Evaluacion> generarCalificaciones(){
        ArrayList<Evaluacion> boleta= new ArrayList<Evaluacion>();
        
        Evaluacion e;
        e =new Evaluacion('petra', '5.8');
        boleta.add(e);
        
        Evaluacion e;
        e =new Evaluacion("jose",'7.4');
        boleta.add(e);
        
        Evaluacion e;
        e =new Evaluacion("roberta", '8.6');
        boleta.add(e);
        
      
        
    
    return boleta;
        
    }
    
    
}

