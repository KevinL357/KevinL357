class ClassesInClasses {


    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        SportsCar sporty = new SportsCar();

        v.test(sporty, sporty);
        };
    }

    class Vehicle {
    
        Vehicle(){
    
        };
    
         void test (Car x, SportsCar y) {
            
        }
    }
     class Car extends Vehicle {
    
    }
    
     class SportsCar extends Car{
    
    }