package Problem03;

public class ComboLockRunner {
    public static void main(String[] args) {

        ComboLock comboLock = new ComboLock(5,7,9);

        comboLock.turnRight(5);
        comboLock.turnLeft(7);
        comboLock.turnRight(9);

        Boolean isOpen = comboLock.open();

        comboLock.reset();

        if(isOpen){
            System.out.println("Locked opened successfully");
        }
        else{
            System.out.println("Invalid password");
        }
    }
}
