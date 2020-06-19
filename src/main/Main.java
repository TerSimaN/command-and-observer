package main;

import command.Command;
import command.Exercises;
import command.Trainer;
import observer.Observer;
import observer.Trainee;
import observer.Viewer;
import command.GetUpCommand;
import command.LieDownCommand;

public class Main {

	public static void main(String[] args) {
		
		Trainee trainee = new Trainee();
		Observer firstObserver = new Viewer("Viewer 1");
		Observer secondObserver = new Viewer("Viewer 2");
		Observer thirdObserver = new Viewer("Viewer 3");
		
		Trainer trainer = new Trainer();
		Exercises exercises = new Exercises();
		Command getUpCommand = new GetUpCommand(exercises);
		Command lieDownCommand = new LieDownCommand(exercises);
		
		trainee.startWatching(firstObserver);
		trainee.startWatching(secondObserver);
		trainee.startWatching(thirdObserver);
		
		trainer.setCommand(getUpCommand);
		trainer.sayCommand();
		trainee.setCommandType(getUpCommand.getType());
		
		trainer.setCommand(lieDownCommand);
		trainer.sayCommand();
		trainee.setCommandType(lieDownCommand.getType());
	}

}
