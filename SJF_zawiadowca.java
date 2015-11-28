/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamone.operatingsystem.CPU;
import com.teamone.operatingsystem.processmanagement.Process;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel
 */
public class SJF_zawiadowca {
    private int tau; // nasza wielkosc procesora
    public List<Process> listaProcesow = new ArrayList();
    public int process_indeks;//indeks procesu
    private double a = 0.5; // wykorzystywane przy obliczeniach wielkosci
    
    public SJF_zawiadowca(Process run)
    {
        
    }
    private void oblicz_wielkosc(Process p)
    {
    if( p != null && p.getcheckProcess() == false)
         {          
            tau = (int)(a*p.getSize()+a*p.getSize());
            p.setcheckProcess(true);
            p.setSize(tau);
         }
    }
    private int min_wielkosc(Process p)
    {
        int x = -1;
        int min = p.getSize();
        //if(pr.grupy_procesow.size()>0)
        //{
            //for(Process p : pr.grupy_procesow)
            //{
              //  if(min > p.getSize() && p.blocked == false && p.stopped == false)
                //{
                    //min = p.proces_estimated_time;
                 //   x = listaProcesow.indexOf(p);
              //  }
            //}
       // }
        
        return 0;
    }
}
