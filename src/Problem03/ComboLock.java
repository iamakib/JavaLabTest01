package Problem03;

public class ComboLock {
    private int secret1;
    private int secret2;
    private int secret3;

    private int currentPosition;

    private String sequence="";

    public ComboLock(int secret1, int secret2, int secret3){
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }
    public void reset(){
        currentPosition = 0;
        sequence = "";
    }
    public void turnRight(int ticks){
        if(sequence.length() == 0){
            if(ticks == secret1 ){
                sequence = sequence + "R";
            }
        } else if (sequence.length() == 2) {
            if(ticks == secret3){
                sequence = sequence + "R";
            }
        }
    }
    public void turnLeft(int ticks){
        if(ticks == secret2 ){
            sequence = sequence + "L";
        }
    }

    public String getSequence() {
        return sequence;
    }
    public boolean open(){
        if(sequence.equals("RLR")){
            return true;
        }
        return false;
    }
}
