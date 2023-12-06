package Main;

import org.junit.Test;
import programs.CSAIProgram;
import programs.DSProgram;
import programs.CNEProgram;

import static org.junit.Assert.assertEquals;
import static programs.ProgramInterface.*;

public class CourseTest {
    StudentRequest studentRequest = new StudentRequest(300, 3, 3);

    @Test
	public void studentRequestTest() {
        assertEquals(300, studentRequest.getSalary(), 0.01);
        assertEquals(3, studentRequest.getPrevGPA(), 0.01);
        assertEquals(3, studentRequest.getProgrammingInterest());
    }


    DSProgram dsProgram = new DSProgram();



    @Test
    public void dsProgramTest() {
        assertEquals("Data Science (DS)", dsProgram.getTitle());
        assertEquals(6000.0f, dsProgram.minSalary(),0.01);
        assertEquals(3.5f, dsProgram.minGPA(),0.01);
        assertEquals(MEDIUM_INTEREST, dsProgram.programmingInterest());
        assertEquals(DS, dsProgram.jobCategory());
        assertEquals(3.5f, dsProgram.acceptableGPA(),0.01);
    }



    CSAIProgram csaiProgram = new CSAIProgram();

    @Test
    public void csaiProgramTest() {
        assertEquals("Computer Science and AI (CSAI)", csaiProgram.getTitle());
        assertEquals(5000.0f, csaiProgram.minSalary(),0.01);
        assertEquals(3.0f, csaiProgram.minGPA(),0.01);
        assertEquals(HIGH_INTEREST, csaiProgram.programmingInterest());
        assertEquals(CSAI, csaiProgram.jobCategory());
        assertEquals(3.5f, csaiProgram.acceptableGPA(),0.01);
    }


    CNEProgram cneProgram = new CNEProgram();

    @Test
    public void cneProgramTest() {
        assertEquals("Computer and Network Engineering (CNE)", cneProgram.getTitle());
        assertEquals(5000.0f, cneProgram.minSalary(),0.01);
        assertEquals(3.0f, cneProgram.minGPA(),0.01);
        assertEquals(HIGH_INTEREST, cneProgram.programmingInterest());
        assertEquals(CNE, cneProgram.jobCategory());
        assertEquals(3.5f, cneProgram.acceptableGPA(),0.01);
    }
}

