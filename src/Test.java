


public class Test{
public static void main(String args[]){
double standardDeviationWin = 1.09;
double standardDeviationLose = .90;
                double standardMean = (standardDeviationWin + standardDeviationLose) / 2;
                double Wkd = Math.pow(standardDeviationWin - standardMean, 2);
                double Lkd = Math.pow(standardDeviationLose - standardMean, 2);
                double standardMean2 = Math.sqrt((Wkd + Lkd) / 2);
                System.out.println(standardMean2);
}
}