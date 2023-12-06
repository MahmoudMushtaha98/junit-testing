package programs;

public interface ProgramInterface {
	public static final int LOW_INTEREST = 1;
	public static final int MEDIUM_INTEREST = 2;
	public static final int HIGH_INTEREST = 3;
	public static final int VERY_HIGH_INTEREST = 4;
	
	public static final String SE = "Software Engineer";
	public static final String CY = "Cybersecurity Engineer";
	public static final String CSAI = "Software Developer";
	public static final String CNE = "Network Engineer";
	public static final String DS = "Data Analyst/Data Scientist";
	
	// return the Minimum industry salary
	public float minSalary();
	
	// return the Minimum required previous GPA
	public float minGPA();
	
	// return the Computer Programming interest of student
	public int programmingInterest();

	// return the Industry job category
	public String jobCategory();
	
	// return the Required acceptable GPA in industry
	public float acceptableGPA();
	
}
