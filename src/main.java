import java.util.HashSet;
import java.util.Set;

public class main {

    public static void main(String[] args) {
        BalancedString balancedString = new BalancedString();
        Balloon balloon = new Balloon();
        Tasks tasks = new Tasks();
        
        System.out.println(tasks.calculateStairSize(15));
        System.out.println(tasks.calculateMaximumTank(1,8,6,2,5,4,8,3,7));

        System.out.println(balancedString.start("azABaabza"));
        System.out.println(balancedString.start("TacoCat"));
        System.out.println(balancedString.start("AcZCbaBz"));

        System.out.println(balloon.start("BAONXXOLL"));
        System.out.println(balloon.start("BAOOLLNNOLOLGBAX"));
    }




}
