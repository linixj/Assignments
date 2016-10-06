/*package paytuition;

Scenario : Drive home

Description : A student is driving home from school.

	Objects (with Behaviors and State): 
		Object : Student
			State : name, drive skill, home address
			Behavior : startTheCar(), driveTheCar(), arriveAtHome()
		
		
		Object : Car
			State : drivablility
			Behavior : getStarted, getStopped()
*/			

	class Student{
		String name;
		String homeaddress;
		void startTheCar(Car c){}
		void driveTheCar(Car c){}
		Car getStopped(Car c){}
		void arriveAtHome(Student s){}

	}



	class Car{
		String drivability;
		void getStarted(Student s, Car c){}
		void getStopped(Student s, Car c){}
	
		}
	

	
	class Drivinghome{
		public static void main(String args[]){
			Car honda = new Car();

			Student jojo = new Student();
			jojo.name = "Jojo";
			
			String homeaddress = "422YaleAve"
			jojo.startTheCar(honda);
			jojo.driveTheCar(honda);
			jojo.arriveAtHome(homeaddress);
			honda.getStopped(jojo, honda);
		}

	}

