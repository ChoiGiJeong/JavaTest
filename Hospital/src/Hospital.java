public class Hospital {
	public static void main(String[] args){
		Doctor 김사부 = new Doctor("환자 조회 시스템", "체온계");
		김사부.setComputer("병원 컴퓨터");
		김사부.setMedicalAppliance("혈압 측정기");
		
		김사부.inquery();
		김사부.treatment();
		김사부.prescription();
		
		Doctor 봉달희 = new Doctor("환자 조회 시스템", "체온계");
		봉달희.treatment();
		봉달희.prescription();
	}
	
}
