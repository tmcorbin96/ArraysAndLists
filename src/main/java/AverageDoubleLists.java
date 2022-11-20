import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return (double) aa.size();
    }
    public Double sum(ArrayList<Double> aa) {
        double equal = 0;
        for (int i=0; i<aa.size(); i++) {
            equal += aa.get(i);
        }
        return equal;
    }
    public Double average(ArrayList<Double> aa) {

      //  if (aa.size()>0) {
         //   return equal( / aa.size();
       // }
        return sum(aa)/aa.size();
    }

}
