package programs;

public abstract class Program implements ProgramInterface {
		
	private String title;
	
	private float minSalary;
	
	private float minGPA;
		
	private int programmingInterest;
	
	private String jobCategory;
	
	private float acceptableGPA;
	
	public Program(String title, float minSalary, float minGPA, int programmingInterest, String jobCategory, float acceptableGPA) {
		this.title = title;
		this.minSalary = minSalary;
		this.minGPA = minGPA;
		this.programmingInterest = programmingInterest;
		this.jobCategory = jobCategory;
		this.acceptableGPA = acceptableGPA;
	}

	@Override
	public String toString() {	
		// calc extra study hours
		int hrs = (int) (acceptableGPA * 60 / 60);
		int min = (int) (acceptableGPA * 60 % 60);
		
		String s = "";
		 s = title + " \n";
		for(int i = 1; i <= title.length(); i++)
			s += "-";
		s += "----\n";
		s += "  Required acceptable GPA in industry: " + acceptableGPA + "\n";
		s += "  Required study hours 0" + hrs + ":" + (min > 9 ? min: ("0"+ min) );
		
		return s;
	}

	@Override
	public float minSalary() {
		
		return minSalary;
	}

	@Override
	public float minGPA() {
		return minGPA;
	}

	public int programmingInterest() {
		return programmingInterest;
	}

	@Override
	public String jobCategory() {
		return jobCategory;
	}

	@Override
	public float acceptableGPA() {
		return acceptableGPA;
	}
	
	public String getTitle() {
		return title;
	}

	
	
	
	
	
	

	
}
