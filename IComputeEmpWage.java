public interface IComputeEmpWage{
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHrsPerMonth);
	public void computeEmpWage();
	public void computeEmpWage(CompanyEmpWage employee);
	}
		