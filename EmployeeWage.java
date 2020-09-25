public class EmployeeWage{
	//constants
	public static final int IS_PART_TIME=1; 
	public static final int IS_FULL_TIME=2;  

	//variables
	public String company;
	public int empRatePerHour, numOfWorkingDays, maxHrsPerMonth,totalEmpWage;
		
	//constructor
	public EmployeeWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth){
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}

	public void computeEmpWage(){
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		//computation
		while(totalEmpHrs<=maxHrsPerMonth && totalWorkingDays<numOfWorkingDays)
		{
			totalWorkingDays++;
			double empCheck=Math.floor(Math.random()*10)%3;
			switch((int)empCheck)
			{
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+totalWorkingDays+" Emp Hr: "+empHrs);
		}
		totalEmpWage=totalEmpHrs*empRatePerHour;
	}
	
	@Override
	public String toString(){
		return "Total Emp Wage for "+company+" is: "+totalEmpWage;
	}

	public static void main(String[] args){
		EmployeeWage dMart=new EmployeeWage("DMart",20,2,10);
		EmployeeWage reliance=new EmployeeWage("Reliance",10,4,20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
	}
}