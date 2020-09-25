public class EmployeeWage{
	public static final int IS_PART_TIME=1; 
	public static final int IS_FULL_TIME=2;  

	public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth){
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
		int totalEmpWage=totalEmpHrs*empRatePerHour;
		System.out.println("Total Emp Wage for "+company+" is: "+totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args){
		computeEmpWage("DMart",20,2,10);
		computeEmpWage("Reliance",10,4,20);
	}
}