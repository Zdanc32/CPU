package com.teamone.operatingsystem.CPU;
import com.teamone.operatingsystem.processmanagement.ProcessState;
//Pobieranie licznika od PCB
public interface Process 
{	
	//short getProgramCounter(); // teraz mi chyba nie jest potrzebny
        int getSize(); //ustalilismy, ze wielkosc procesu jest ustalana sizem
        void setSize(int tau);// ustawienie nowego rozmiaru Procesa, 
                             //w celu rozpatrzenia kolejnosci uruchamiania
        ProcessState getStatus(); // pobierany status
        void setStatus(ProcessState state); // ustawiam status     
        Boolean getcheckProcess(); // pobranie statusu procesu(sprawdzony, czy nie)
        void setcheckProcess(Boolean spr); // ustawienie statusu procesu, jezeli sprawdzony -> true      
        Boolean checkBlocked(); // sprawdzam czy nie jest blokowany
        Boolean checkStopped(); //sprawdzam czy nie jest zatrzymany
}
