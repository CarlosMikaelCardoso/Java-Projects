public class Arrays{
    public static void main(String[] args) {
        String[] cars = {"Camaro","Corvette","Mustang"};

        String[] Moto = new String[3];

        Moto[0] = "Banana";
        Moto[1] = "Maça";
        Moto[2] = "Uva";

        for (int i = 0; i<cars.length; i++){
            System.out.println(cars[i]);
            System.out.println(Moto[i]);
        }

    }
}