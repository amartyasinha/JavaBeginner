class Car{
    int NumPlate;
    double SpeedRate;
    String name;

    Car(Car obj){
        NumPlate = obj.NumPlate;
        SpeedRate = obj.SpeedRate;
        name = obj.name;
    }
    Car(int NumberPlate,double SpeedRate, String name){
        this.NumPlate= NumberPlate;
        this.SpeedRate= SpeedRate;
        this.name=name;
    }
    Car(){
        NumPlate = -1;
        SpeedRate= -1;
        name = "Lamborgini";
    }
    void CarDetails(){
        System.out.println("Name: "+name);
        System.out.println("NumberPlate: "+NumPlate);
        System.out.println("SpeedRate: "+SpeedRate);
    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        Car obj1= new Car(1278421, 455.22, "Ferrari");
        Car obj2= new Car(33124, 400.33, "Buggati");
        Car obj3 = new Car();

        Car clone= new Car(obj1);

        obj1.CarDetails();

    }
}