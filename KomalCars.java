package OOPS;

public class KomalCars implements Car{

	public static void main(String[] args) {
		
		KomalCars kc=new KomalCars();
		kc.Start();
		kc.Accel();
		kc.Speed();
		kc.Stop();
		kc.Music();
		
		Car kc1=new KomalCars();
		kc1.Start();
		kc1.Accel();
		kc1.Speed();
		kc1.Accel();
		kc1.Stop();

	}
	public void Start() {
		System.out.println("Start Method");
	}
	public void Accel() {
		System.out.println("Accel Method");
	}
	public void Speed() {
		System.out.println("Speed Method");
	}
	public void Stop() {
		System.out.println("Stop Method");
	}
	
	public void Music() {
		System.out.println("Music Method");
	}
}
