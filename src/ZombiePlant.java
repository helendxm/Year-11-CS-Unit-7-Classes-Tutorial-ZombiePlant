public class ZombiePlant {
    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int treatmentsNeeded){
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    public int getPotency(){
        return maxPotency;
    }

    public int treatmentsNeeded(){
        return treatmentsNeeded;
    }

    public boolean isDangerous(){
        return (treatmentsNeeded>0);
    }

    public void treat(int n){
        if (treatmentsNeeded < 0){
            return;
        }
        else if (n==0){
            return;
        }
        else if (n <= maxPotency && treatmentsNeeded > 0 && n > 0){
            treatmentsNeeded--;
        }
        else if (n > maxPotency && treatmentsNeeded >= 0 && n > 0){
            treatmentsNeeded++;
        }
    }

    public static void main(String[] args){
        ZombiePlant zombiePlant = new ZombiePlant(10,3);
        System.out.println(zombiePlant.getPotency());
        System.out.println(zombiePlant.treatmentsNeeded);
        System.out.println(zombiePlant.isDangerous());
    }
}