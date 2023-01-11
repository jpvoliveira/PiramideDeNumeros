public class App {
    public static void main(String[] args) throws Exception {
        int firstNumber = 1;
        int lastNumber = 10;
        String textNumber = "";
        
        System.out.println("Piramide de " + firstNumber + " a " + lastNumber + ":");

        while(firstNumber <= lastNumber){
            for (int i = 0; i < firstNumber; i++) {
                textNumber += firstNumber;
            }
            System.out.println(textNumber);
            firstNumber++;
            textNumber = "";
        }
    }
}
