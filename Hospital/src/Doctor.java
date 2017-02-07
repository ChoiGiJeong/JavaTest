
public class Doctor 
{
	private String computer;
	private String medicalAppliance;
	
	public Doctor(String computer, String medicalAppliance)
	{
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
		System.out.println("멤버변수를 초기화 했습니다.");
	}
	
	
	
	public void setComputer(String computer)
	{
		this.computer = computer;
	}
	
	public void setMedicalAppliance(String medicalAppliance) {
		this.medicalAppliance = medicalAppliance;
	}
	
	public String getComputer()
	{
		return computer;
	}
	
	public String getMedicalAppliance()
	{
		return medicalAppliance;
	}
	
	public void inquery()
	{
		System.out.println(computer + "에서 환자의 이름을 조회합니다.");
	}
	
	public void treatment()
	{
		System.out.println("의사가 " + medicalAppliance + "로 환자를 진료합니다.");
	}
	
	public void prescription()
	{
		System.out.println("의사가 환자의 처방전을 작성합니다.");
	}
}