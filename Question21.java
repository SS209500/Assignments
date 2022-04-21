package assignment;
import java.util.ArrayList;
class Car{
	public int carId;
	public int speed;
	public Car(int carId, int speed) {
		this.carId=carId;
		this.speed=speed;
	}
}



class CarRacing {
	ArrayList<Car> cars = new ArrayList<>();;
	public int trackCount;

	public CarRacing(int trackCount) {
		this.trackCount = trackCount;
	}

	public String carEntry(Car car) {
		boolean duplicate=false;
		for(Car c:cars) {
			if(c.carId==car.carId) {
				duplicate=true;
			}
		}
		if (trackCount == cars.size()) {
			return "No Space";
		} else if (duplicate) {
			return "Already exists";
		} else {
			cars.add(car);
			return "Start practicing";
		}
	}

	public int getWinner(int trackLength) {
		int max=Integer.MIN_VALUE;
		Car win=new Car(0,0);
		Car fwin=new Car(0,0);
		for(Car c:cars) {
			if(c.speed>max) {
				max=c.speed;
				win=c;
			}
		}
		int i=0;
		for(Car c:cars) {
			if(c.speed==win.speed) {
				i++;
			}
		}
		if(i==1){
			return win.carId;
		}
		else if(i==2){
			for(Car c:cars) {
				if(c.speed==win.speed) {
					fwin=c;
					break;
				}
			}
			return fwin.carId;
		}
		else {
			return -1;
		}
	}
}



public class Question21 {

	public static void main(String[] args) {
		Car car=new Car(1,100);
		CarRacing carRacing=new CarRacing(2);
		System.out.println(carRacing.carEntry(car));
		System.out.println(carRacing.getWinner(12));
	}

}
