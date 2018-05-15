public class PowerOf {

    public int twoToThePowerOf(int power) {
        if (power==0) {
            return 1;
        } else if(power==1) {
            return 2;
        } else {
            return 2 * twoToThePowerOf(power-1);
        }
    }

}
