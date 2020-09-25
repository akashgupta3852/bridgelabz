public class EmployeeWage implements IComputeEmpWage{
	//constants
	public static final int IS_PART_TIME=1; 
	public static final int IS_FULL_TIME=2;  

	//variables
	public int numOfCompany=0;
	public CompanyEmpWage[] companyEmpWageArray;
	
	public EmployeeWage(){
		companyEmpWageArray=new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth){
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHrsPerMonth);
		numOfCompany++;
	}
		
	public void computeEmpWage(){
		for(int i=0;i<numOfCompany;i++){
			CompanyEmpWage emp=companyEmpWageArray[i];
			this.computeEmpWage(emp);
			System.out.println(emp);
		}
	}

	public void computeEmpWage(CompanyEmpWage employee){
		//variables
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		//computation
		while(totalEmpHrs<=employee.maxHrsPerMonth && totalWorkingDays<employee.numOfWorkingDays)
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
		employee.totalEmpWage=totalEmpHrs*employee.empRatePerHour;
	}
	
	

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation Program");
		EmployeeWage empWage=new EmployeeWage();
		empWage.addCompanyEmpWage("DMart",20,2,10);	
		empWage.addCompanyEmpWage("Reliance",10,4,20);
		empWage.computeEmpWage();
	}
}