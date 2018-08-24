import java.util.Scanner;
public class statBuilder{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        PersonalBest user = new PersonalBest(0,0,0,0,0,0,0);
            int mainChoice = 0;
            //Call MainMenu           
            do{ displayMainMenu();
            mainChoice = input.nextInt();
            switch(mainChoice){
                case 0: System.out.println("Thanks for using StatBuilder!");
                break;
                case 1: displayProfile();
                break;
                case 2: displayPersonalBest();
                break;
                case 3: displayHardpointMenu();
                break;
                case 4: displaySearchMenu();
                break;
                case 5: displayCaptureMenu();
                break;
                case 6: System.out.println("What gamemode would you like to enter stats for?");
                    System.out.println("1 - Hardpoint\n"
                            + "2 - Search and Destroy\n"
                            + "3 - Capture the Flag\n"
                            + "Enter Choice Here: ");
                    int addChoice = input.nextInt();
                    if (addChoice == 1){
                        addHardpointMenu();
                    } if (addChoice == 2){
                        addSearchMenu();
                    } if (addChoice == 3){
                        addCaptureMenu();
                    }
                                                                                                                                                                                                           
            }
           }while (mainChoice != 0);
    }
    public static void displayMainMenu(){
        System.out.print("Welcome to StatBuilder!\n"
                + "0 - Exit\n"
                + "1 - Overall Stats/Profile\n"
                + "2 - Personal Best\n"
                + "3 - Hardpoint Stats\n"
                + "4 - Capture the Flag Stats\n"
                + "5 - Search and Destroy Stats\n"
                + "6 - Add Matches\n"
                + "Enter Choice Here: ");
        
    }
    public static void displayProfile(int overallKD, int overallAverageKills, int overallTotalKills, int overallTotalDeaths,  int overallTotalMaps, int overallWinLose,  int overallWins, int overallLose){
        Scanner input = new Scanner(System.in);
        int mainChoice = 0;
        mainChoice = input.nextInt();
        switch (mainChoice) {
            case 1: 
        }
        System.out.println("Overall K/D: " + overallKD);
        System.out.println("Average Respawn Kills: " + overallAverageKills);
        System.out.println("Total Kills: " + overallTotalKills);
        System.out.println("Total Deaths: " + overallTotalDeaths);
        System.out.println("Total Maps:" + overallTotalMaps);
        System.out.println("Win/Lose: " + overallWinLose);
        System.out.println("Total Wins" + overallWins);
        System.out.println("Total Loses: " + overallLose);
       
    }
    public static void displayPersonalBest(){
        
    }
    public static void displayHardpointMenu(){
        
    }
    public static void displaySearchMenu(){
        
    }
    public static void displayCaptureMenu(){
        
    }
    public static void addHardpointMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kills: ");
        int inputHardpointKills = input.nextInt();
        user.checkPBHardpointKills(inputHardpointKills);
        System.out.print("Deaths: ");
        int inputHardpointDeaths = input.nextInt();
        System.out.print("Capture Time Minutes: ");
        int inputHardpointTimeMin = input.nextInt();
        System.out.print("Capture Time Seconds: ");
        int inputHardpointTimeSec = input.nextInt();
        System.out.print("Defends: ");
        int inputHardpointDefends = input.nextInt();
        System.out.println("Map\n"
                + "1 - Ardennes Forest\n"
                + "2 - Gibralter\n"
                + "3 - London Docks\n"
                + "4 - Sainte Marie Du Mont\n"
                + "5 - Valkyrie\n"
                + "Enter Choice Here: ");
        int inputHardpointMap = input.nextInt();
        System.out.print("Did you win?\n"
                + "1 - Yes\n"
                + "2 - No\n"
                + "Enter Choice Here: ");
        int inputHardpointWin = input.nextInt();
        
    }
    public static void addSearchMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kills: ");
        int inputSearchKills = input.nextInt();
        System.out.print("Deaths: ");
        int inputSearchDeaths = input.nextInt();
        System.out.print("Plants: ");
        int inputSearchPlants = input.nextInt();
        System.out.print("First Bloods: ");
        int inputFirstBloods = input.nextInt();
        System.out.println("Map\n"
                + "1 - Ardennes Forest\n"
                + "2 - London Docks\n"
                + "3 - Sainte Marie Du Mont\n"
                + "4 - Valkyrie\n"
                + "Enter Choice Here: ");
        int inputSearchMap = input.nextInt();
        System.out.print("Did you win?\n"
                + "1 - Yes\n"
                + "2 - No\n"
                + "Enter Choice Here: ");
        int inputSearchWin = input.nextInt();
    }
    public static void addCaptureMenu(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kills: ");
        int inputCaptureKills = input.nextInt();
        System.out.print("Deaths: ");
        int inputCaptureDeaths = input.nextInt();
        System.out.print("Captures: ");
        int inputCaptureFlags = input.nextInt();
        System.out.print("Returns: ");
        int inputCaptureReturns = input.nextInt();
        System.out.println("Map\n"
                + "1 - Ardennes Forest\n"
                + "2 - Flak Tower\n"
                + "3 - London Docks\n"
                + "4 - Sainte Marie Du Mont\n"
                + "Enter Choice Here: ");
        int inputCaptureMap = input.nextInt();
        System.out.print("Did you win?\n"
                + "1 - Yes\n"
                + "2 - No\n"
                + "Enter Choice Here: ");
        int inputCaptureWin = input.nextInt();
        
    }
    
    public static void overallCalculations(int hardpointTotalKills, int hardpointTotalDeaths, int captureTotalKills, int captureTotalDeaths, int searchTotalKills, int searchTotalDeaths, int hardpointTotalMaps, int captureTotalMaps, int searchTotalMaps, int hardpointTotalWins, int hardpointTotalLose, int captureTotalWins, int captureTotalLose, int searchTotalWins, int searchTotalLose){
                int overallKD = (hardpointTotalKills + captureTotalKills + searchTotalKills)-(hardpointTotalDeaths + captureTotalDeaths + searchTotalDeaths);
                int overallAverageKills = (hardpointTotalKills + captureTotalKills)/(hardpointTotalMaps + captureTotalMaps);
                int overallTotalKills = (hardpointTotalKills + captureTotalKills + searchTotalKills);
                int overallTotalDeaths = (hardpointTotalDeaths + captureTotalDeaths + searchTotalDeaths);
                int overallTotalMaps = (hardpointTotalMaps + captureTotalMaps + searchTotalMaps);
                int overallWinLose = (hardpointTotalWins + captureTotalWins + searchTotalWins)/(hardpointTotalLose + captureTotalLose + searchTotalLose);
                int overallWins = (hardpointTotalWins + captureTotalWins + searchTotalWins);
                int overallLose = (hardpointTotalLose + captureTotalLose + searchTotalLose);
                
    }
    public static void personalBestCalculations(int inputHardpointKills, int inputHardpointTimeMin, int inputHardpointTimeSec, int inputHardpointDefends, int inputSearchKills, int inputSearchPlants, int inputFirstBloods, int inputCaptureKills, int inputCaptureFlags, int inputCaptureReturns){
                //Hardpoint Personal Best
                int pbHardpointKills = 0;
                if (pbHardpointKills < inputHardpointKills){
                    pbHardpointKills = inputHardpointKills;
                }
                int singleHardpointTime = (inputHardpointTimeMin * 60) + inputHardpointTimeSec;
                int pbHardpointTime = 0;
                if (pbHardpointTime < singleHardpointTime ){
                    pbHardpointTime = singleHardpointTime;
                }
                int pbHardpointDefends = 0;
                if (pbHardpointDefends < inputHardpointDefends){
                    pbHardpointDefends = inputHardpointDefends;
                }
                //Search Personal Best
                int pbSearchKills = 0;
                if (pbSearchKills < inputSearchKills){
                    pbSearchKills = inputSearchKills;
                }
                int pbSearchPlants = 0;
                if (pbSearchPlants < inputSearchPlants){
                    pbSearchPlants = inputSearchPlants;
                }
                int pbFirstBloods = 0;
                if (pbFirstBloods < inputFirstBloods){
                    pbFirstBloods = inputFirstBloods;
                }
                //Capture Personal Best
                int pbCaptureKills = 0;
                if (pbCaptureKills < inputCaptureKills){
                    pbCaptureKills = inputCaptureKills;
                }
                int pbCaptureFlags = 0;
                if (pbCaptureFlags < inputCaptureFlags){
                    pbCaptureFlags = inputCaptureFlags;
                }
                int pbCaptureReturns = 0;
                if (pbCaptureReturns < inputCaptureReturns){
                    pbCaptureReturns = inputCaptureReturns;
                }
    }
    public static int hardpointCalculations(int inputHardpointKills, int inputHardpointDeaths, int inputHardpointTimeMin, int inputHardpointTimeSec, int inputHardpointDefends, int inputHardpointMap, int inputHardpointWin){
                //Running Total of Maps Played
                int x = inputHardpointMap;
                int hardpointTotalMaps = 0;
                if (x == 1 || x == 2){
                    hardpointTotalMaps++;
                }
                
                //Running Total of Kills and average per map                
                int hardpointTotalKills = 0;
                hardpointTotalKills += inputHardpointKills;
                int averageHardpointKills = hardpointTotalKills / hardpointTotalMaps;                                               
                
                //Running Total of Hardpoint Time and average time per map          
                double hardpointTimeTotal = 0;
                hardpointTimeTotal += (inputHardpointTimeMin * 60) + inputHardpointTimeSec;
                double hardpointTimeAvg = (hardpointTimeTotal / 60) / hardpointTotalMaps;
                
                //Running Total of Deaths and average per map
                int hardpointTotalDeaths = 0;
                hardpointTotalDeaths += inputHardpointDeaths;
                int averageHardpointDeaths = hardpointTotalDeaths / hardpointTotalMaps;
                
                //Hardpoint K/D
                double hardpointKD = hardpointTotalKills / hardpointTotalDeaths;
                
                //Hardpoint win/lose
                int hardpointTotalWins = 0;
                int hardpointTotalLoses = 0;
                int hpWinLose = inputHardpointWin;
                if (hpWinLose == 1){
                    hardpointTotalWins++;
                } if (hpWinLose == 2){
                    hardpointTotalLoses++;
                }
                int hardpointWinLose = hardpointTotalWins / hardpointTotalLoses;
                
                //Running Total of Defends and average per map
                int hardpointTotalDefends = 0;
                hardpointTotalDefends += inputHardpointDefends;
                int averageHardpointDefends = hardpointTotalDefends / hardpointTotalMaps;
                
                //X Factor
                int xFactorWin = 0;
                int xFactorLose = 0;
                if (hpWinLose == 1) {
                    xFactorWin += inputHardpointKills / inputHardpointDeaths;
                } if (hpWinLose == 2) {
                    xFactorLose += inputHardpointKills / inputHardpointDeaths;
                }
                double hpDifference = xFactorWin - xFactorLose;
               
                
                
    }
    public static int searchCalculations(int inputSearchKills, int inputSearchDeaths, int inputSearchPlants, int inputFirstBloods, int inputSearchMap, int inputSearchWin){
                //Running Total of Maps
                int x = inputSearchMap;
                int searchTotalMaps = 0;
                if (x == 1 || x == 2){
                    searchTotalMaps++;
                }
                
                //Running Total of Kills and average per map
                int searchTotalKills = 0;
                searchTotalKills += inputSearchKills;
                int averageSearchKills = searchTotalKills / searchTotalMaps;
                
                //Running Total of Deaths and average per map
                int searchTotalDeaths = 0;
                searchTotalDeaths += inputSearchDeaths;
                int averageSearchDeaths = searchTotalDeaths / searchTotalMaps;
                
                //Running Total of Plants and average per map
                int searchTotalPlants = 0;
                searchTotalPlants += inputSearchPlants;
                int averageSearchPlants = searchTotalPlants / searchTotalMaps;
                
                //Running Total of First Bloods and average per map
                int searchTotalBloods = 0;
                searchTotalBloods += inputFirstBloods;
                int averageBloods = searchTotalBloods / searchTotalMaps;
                
                //Search K/D
                int searchKD = searchTotalKills / searchTotalDeaths;
                
                //Search Win/Lose
                int searchTotalWins = 0;
                int searchTotalLoses = 0;
                int searchWinLose = inputSearchWin;
                if (searchWinLose == 1){
                    searchTotalWins++;
                } if (searchWinLose == 2){
                    searchTotalLoses++;
                }
                int searchDestroyWinLose = searchTotalWins / searchTotalLoses;
                
    } 
    public static int captureCalculations(int inputCaptureKills, int inputCaptureDeaths, int inputCaptureFlags, int inputCaptureReturns, int inputCaptureMap, int inputCaptureWin){
                //Running Total of Maps
                int x = inputCaptureMap;
                int captureTotalMaps = 0;
                if (x == 1 || x == 2){
                    captureTotalMaps++;
                }
                
                //Running Total of Kills and average per map
                int captureTotalKills = 0;
                captureTotalKills += inputCaptureKills;
                int averageCaptureKills = captureTotalKills / captureTotalMaps;
                
                //Running Total of Deaths and average per map
                int captureTotalDeaths = 0;
                captureTotalDeaths += inputCaptureDeaths;
                int averageCaptureDeaths = captureTotalDeaths / captureTotalMaps;
                
                //Running Total of Caps and average per map
                int captureTotalFlags = 0;
                captureTotalFlags += inputCaptureFlags;
                int averageCaptureFlags = captureTotalFlags / captureTotalMaps;
                
                //Running Total of Returns and average per map
                int captureTotalReturns = 0;
                captureTotalReturns += inputCaptureReturns;
                int averageCaptureReturns = captureTotalReturns / captureTotalMaps;
                
                //Capture K/D
                double captureKD = captureTotalKills / captureTotalDeaths;
                
                //Capture win/lose
                int captureTotalWins = 0;
                int captureTotalLoses = 0;
                int capWinLose = inputCaptureWin;
                if (capWinLose == 1){
                    captureTotalWins++;
                } if (capWinLose == 2){
                    captureTotalLoses++;
                }
                int captureWinLose = captureTotalWins / captureTotalLoses;
                
                //X Factor
                int xFactorWin = 0;
                int xFactorLose = 0;
                if (captureWinLose == 1) {
                    xFactorWin += inputCaptureKills / inputCaptureDeaths;
                } if (captureWinLose == 2) {
                    xFactorLose += inputCaptureKills / inputCaptureDeaths;
                }
                double captureDifference = xFactorWin - xFactorLose;
               
    }
    
}