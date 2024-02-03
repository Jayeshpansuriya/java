import java.util.ArrayList;//we will store value in array list 
import java.util.List;
import java.util.Scanner; // librery for geting inputs from user 
    class Car{
        private String carId;
        private String brand;
        private String model;
        private double basePricerPerDay;
        private boolean isAvailable;

        public Car(String carId, String brand, String model, double basePricerPerDay  ){
            this.carId=carId;
            this.brand=brand;
            this.model=model;
            this.basePricerPerDay=basePricerPerDay;
            this.isAvailable=true;

        }
        public String getCarId(){return carId;}
        public String getBrand(){return brand;}
        public String getModel(){return model;}
        public double calculatePrice(int rentalDays){return basePriceDay*rentalDays;}
        public boolean isAvailable(){return isAvailable;}



    }

    class Customer{
        private String customerId;
        private String name;

        public Customer(String customerId, String name){
            this.customerId=customerId;
            this.name=name;

        }
        public String getCustomerId(){
            return customerId;
        }
        public string getName(){
            return name;
        }
    }
    
class Rental{
    private Car car;
    private Customer customer;
    private int days;
    
    public Rental(Car car,Customer customer , int days){
        this.car=car;
        this.customer=customer;
        this.days=days;

    }
    public Car getCar(){return car;}
    public Customer getCustomer(){return customer;}
    public int getDays(){return days;}

}

class CarRentalSyatem{
    private List<Car> cars;
    private List<Customer> customer;
    private List<Rental> rentals;

    public CarRentalSystem(){
        cars=new ArrayList<>();
        customer=new ArrayList<>();
        rentals=new ArrayList<>();
    }

        public void addCar(Car car){cars.add(car);}
        public void addCustomer( Customer customer){
            customers.add(customer);
        }
        public void rentCar(Car car , Customer customer ,int days){
            if(car.isAvailable()){
                car.rent();
                rentals.add(new Rental(car, customer, days));

            }else{
                System.out.println("car is not available for rent.");
            }
        }

        public void returnCar(Car car){
            car.returnCar();
            Rental rentalToRemove= null;
           for(Rental rental : rentals){
            if(rental.getcar()== car){
                rentalToRemove = rental;
                break;
            }
           }
            if(rentalToRemove !=null){
                rentals.remove(rentalToRemove);
            }else{
                System.Out.println("car was not rented.");
            }
        }

        public void menu(){
            Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("====car Rental system=====");
            System.out.println("1.Rent a car");
            System.out.println("2.Rental a Car");
            Sytem.out.println("3.Exit");
            System.out.print("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice==1){
                System.out.println("\n== Rent a Car==\n");
                System.out.print("Enter your name:");
                String customerName = scanner.nextLine();

                System.out.println("\n Available Cars:");
                for(Car car:cars){
                    if(car.isAvailable()){
                        System.out.println(car.getCarId() + " - " + car.getBrand() + "  " + car.getModel());

                    }
                
                }
                System.out.print("\nEnter the car ID you want to rent: ");
                string carId=scanner.nextLine();
                System.out.println("Enter the number of days for rental:");
                int rentalDays = scanner.nextInt();
                scanner.nextLine();

                Customer newCustomer = new Customer("CUS"+ (customer.size()+1),customerName);
                addCustomer(newCustomer);

                Car selectedCar = null;
                for(Car car:cars){
                    if(car.getCarId().equals(carId)&& car.isAvailable()){
                        selectedCar=car;
                        break;
                    }
                }

                if (selectedCar !=null){
                    double toralprice = selectedCar.calculatePreice(rentalDays);
                    System.out.println("\n==rental information==\n");
                    System.out.println("Customer ID:"+ newCustomer.getCustomerId());
                    System.out.println("customer Name:" + newCustomer.getName());
                    System.out.println("Car:"+ selectedCar.getBrand() + " " + selectedCar.getModel());
                    System.out.println("Rental Days" + rentalDays);
                    System.println("Total price" , totalprice);
                    System.out.println("\nconform rental(Y/N)");
                    String conform = scanner.nextLine();

                    if( conform.equalsIgnoreCase("Y")){
                        rentCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("car rent succsesfully");
                    }
                    else{
                        System.out.println("rental canceld");
                    } else{
                        System.out.println("Invalid car slsection or car not available for rent");
                    } else if(choice ==2){
                        System.out.println("\n==Return car==\n");
                        System.out.println("Enter the car id you want to return");
                        String carId=scanne.nextLine();

                        Car carToReturn =null;
                        for(Car car:cars){
                            if(car.getId().equals(car) && !car.isAvailable()){
                                carToReturn=car;
                                break;

                            }
                        }
                        if (carToReturn !=null) {
                            Customer customer=null;
                            for(Rental rental: rentals){
                                if(rental.getCar()==carToReturn){
                                    customer=rental.getCustomer();
                                    break;
                                }
                            }

                            if(customer !=null){
                                returnCar(carToReturn);
                                System.out.println("Car returned sucsessffuly by"+customer.getName());

                            }else{
                                System.out.println("car was not return or rental information is missing ");
                            }else{
                                System.out.println("Invalid car id or car is not rented");
                            }
                            else if(choice==3){
                                break;

                            }
                            else{
                                System.out.println("Invalid choice.please enter valid information.");
                            }       
                                                       
                        }
                        System.out.println("thank you for using car rental system");


                    }


                }
             
                    }
                }
            }
 }
        
public class main{
    public static void main(String [] args){
        carRentalSystem rentalSystem=new carRentalSystem();
        Car car1=new Car("C001","Toyota","Carmary",60.0);
        Car car2=new Car("JD01","BMW","M5",600.0);
        Car car3=new Car("RD01","Marchedees","Benze",6000.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();




    }
}        
    
    
