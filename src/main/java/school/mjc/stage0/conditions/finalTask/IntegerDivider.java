package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if(divider!=0){
            float a =dividend / divider;
            if(a*divider == dividend){
                System.out.println("can be divided completely");
            }else{
                System.out.println("cannot be divided completely");
            }
        }else{
            System.out.println("division by zero");
        }
        

        
    }
}
