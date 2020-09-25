public class CompanyEmpWage{

	//variables
	public String company;
	public int empRatePerHour, numOfWorkingDays, maxHrsPerMonth,totalEmpWage;
		
	//constructor
	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth){
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHrsPerMonth=maxHrsPerMonth;
	}
	
	@Override
	public String toString(){
		return "Total Emp Wage for "+company+" is: "+totalEmpWage;
	}
}