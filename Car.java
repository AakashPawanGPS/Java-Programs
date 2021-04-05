public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false ;
    char condition = 'A';
    String nameofcar = "Lucy";

    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;

    int numberofPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 6;

    public Car(){

    }

    public Car(int customMinSpeed , double customWeight , boolean customIsTheCarOn ){
        //Car constructer. constructer_name = Class_name
        minSpeed = customMinSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariable(){
        System.out.println(maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameofcar);
        System.out.println(numberofPeopleInCar);
        System.out.println(maxFuel);
        System.out.println(currentFuel);
    }

    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed+=50;
    }

    public void getin(int noofpersons){
        if(noofpersons <= maxNumberOfPeopleInCar) {
            numberofPeopleInCar = numberofPeopleInCar + noofpersons;
        }
        else System.out.println("No Space");
    }

    public void getout(int personstogetout){
        numberofPeopleInCar = numberofPeopleInCar - personstogetout;
        if(numberofPeopleInCar == 0){
            System.out.println("No one is in the Car");
        }
    }

    public double milesoutofgas(){
        return currentFuel * mpg;
    }

    public double maxmileperfillup(){
        return maxFuel * mpg;
    }

    public void turnTheCarOn(){
        if(!isTheCarOn) isTheCarOn = true;
        else System.out.println("The Car is already on");
    }

    public static void main(String[] args) {
//        Car familycar = new Car(0,4980,false);       //(Object)instance of a car
//        System.out.println("Family Car v1");
//        familycar.printVariable();
//        familycar.upgradeMinSpeed();
//        System.out.println("Family Car v2");
//        familycar.printVariable();
//
//        System.out.println("BirthDay Present Car");
//        Car birthdayPresent = new Car(10,5050.876,true);      //New Instance Car
//        birthdayPresent.upgradeMinSpeed();
//        birthdayPresent.printVariable();
//
//        System.out.println("Christmas Present Car");
//        Car christmasPresent = new Car(50,4080.985,false);
//        christmasPresent.getin(4);
//        System.out.println("After persons getting IN");
//        christmasPresent.printVariable();
//        System.out.println("After persons get down");
//        christmasPresent.getout(2);
//        christmasPresent.printVariable();
//
//        System.out.println("Miles Left : " + christmasPresent.milesoutofgas());
//        System.out.println("Max Miles : " + christmasPresent.maxmileperfillup());

          Car tonnyCar = new Car();
          tonnyCar.getin(4);
          tonnyCar.getout(2);
          //tonnyCar.printVariable();
          tonnyCar.getin(7);
          //tonnyCar.printVariable();
          tonnyCar.turnTheCarOn();
          tonnyCar.turnTheCarOn();
          tonnyCar.printVariable();
    }
}
