public class Hospital {
	public static void main(String[] args){
		Doctor ���� = new Doctor("ȯ�� ��ȸ �ý���", "ü�°�");
		����.setComputer("���� ��ǻ��");
		����.setMedicalAppliance("���� ������");
		
		����.inquery();
		����.treatment();
		����.prescription();
		
		Doctor ������ = new Doctor("ȯ�� ��ȸ �ý���", "ü�°�");
		������.treatment();
		������.prescription();
	}
	
}
