
public class Doctor 
{
	private String computer;
	private String medicalAppliance;
	
	public Doctor(String computer, String medicalAppliance)
	{
		this.computer = computer;
		this.medicalAppliance = medicalAppliance;
		System.out.println("��������� �ʱ�ȭ �߽��ϴ�.");
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
		System.out.println(computer + "���� ȯ���� �̸��� ��ȸ�մϴ�.");
	}
	
	public void treatment()
	{
		System.out.println("�ǻ簡 " + medicalAppliance + "�� ȯ�ڸ� �����մϴ�.");
	}
	
	public void prescription()
	{
		System.out.println("�ǻ簡 ȯ���� ó������ �ۼ��մϴ�.");
	}
}