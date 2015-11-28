package com.teamone.operatingsystem.CPU;
import com.teamone.operatingsystem.processmanagement.Process;


//Uruchamianie interpretera dla Rafała
public interface Interpreter {
	void startProcess(Process processRef);
	void continueProcess() throws Exception;
	void cleanProcess(Process processRef);
}
