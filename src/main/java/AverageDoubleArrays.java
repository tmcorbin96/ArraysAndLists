public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {

        return aa.length;
    }

    public int sum(double[] aa) {
        int add = 0;
        for (double value: aa) {
            add +=value;
        }
        return add;
    }

    public int average(double[] aa) {
        double total = 0;
        for (int i=0; i<aa.length; i++) {
            total=total + aa[i];
        }
        return (int) (total/aa.length);
    }

}
