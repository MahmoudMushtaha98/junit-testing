package Main;
import java.util.ArrayList;
import programs.CNEProgram;
import programs.CSAIProgram;
import programs.CYProgram;
import programs.DSProgram;
import programs.Program;
import programs.SEProgram;

public class RecommendationEngin {

	private final Program[] programs = {new SEProgram(), new CYProgram(), new CSAIProgram(), new CNEProgram(), new DSProgram()};
	
	public void recommend(StudentRequest req) {
		ArrayList<Program> matchedPrograms = new ArrayList<>();
		
		//	get recommended programs
		for (Program program : programs) {
			
			// check the min salary
			if(req.getSalary() > program.minSalary()) 
				continue;
				
			
			// check for the previous GPA
			if(req.getPrevGPA() < program.minGPA()) 
				continue;
			
			// check for programming interests
			if(req.getProgrammingInterest() < program.programmingInterest()) 
				continue;
			
			// if all requirements has been satisfied then add the current program to the list
			matchedPrograms.add(program);
		}
		
		// display recommended programs
		System.out.println("\n------------------------------------------------------");
		System.out.println("#  There are " + matchedPrograms.size() + " programs that match your requiremnts  #");
		System.out.println("------------------------------------------------------\n");
		int i = 1;
		for (Program program : matchedPrograms) {
			System.out.println(i++ + ". " + program);
			System.out.println();
		}
		
		System.out.println("\n\nBest of luck :)");
		
	}
	
}
