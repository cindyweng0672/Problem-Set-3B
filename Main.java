
/**
 * AP CSA Problem Set 3B
 *
 * @Cindy
 * @Oct. 6, 2023
 */
import java.util.*;
public class Main
{

    public Main()
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Human, let’s have an epic game of Rock, Paper, Crossblades! ");
        System.out.println("You");
        String playerInput=sc.nextLine().toLowerCase();
        
        System.out.println(chooseWeapon(playerInput));
    }

    public static String chooseWeapon(String playerChoice){
        String response="";
        String weapon="";
        String[] weapons={"ROCK", "PAPER", "CROSSBLADE"};
        boolean playerRock=false;
        boolean playerPaper=false;
        boolean playerCrossblade=false;
        int rockLastIndex=playerChoice.lastIndexOf("rock");
        int paperLastIndex=playerChoice.lastIndexOf("paper");
        int crossbladeLastIndex=playerChoice.lastIndexOf("crossblade");

        String result="\nResult: Oh no! I lost the match. The kindom is yours!";

        if(rockLastIndex!=-1 && rockLastIndex==playerChoice.length()-4){
            playerRock=true;
        }else if(paperLastIndex!=-1 && paperLastIndex==playerChoice.length()-5){
            playerPaper=true;
        }else if(crossbladeLastIndex!=-1 && crossbladeLastIndex==playerChoice.length()-10){
            playerCrossblade=true;
        }

        if(playerRock||playerPaper||playerCrossblade){
            if(playerChoice.length()<50){
                if(playerRock){
                    weapon=weapons[1];
                }else if(playerPaper){
                    weapon=weapons[2];
                }else if(playerCrossblade){
                    weapon=weapons[0];
                }
                response="Me: Pathetic. You cannot hope to beat me without the passion of a thousand suns, without the dedication of a Pleistocene glacier! I choose "+weapon+"!";
                result="\nResult: As I predicted, I have won this battle. The kingdom is MINE!";

            }else{
                int weaponNum=(int)(Math.random()*weapons.length);
                weapon=weapons[weaponNum];
                response="Me: Does he know my strategy? Two stones in a row... what are the chances? Did he steal my notes? Did he follow me into the archives? No, stay the course: "+weapon+"!";
            }

            if(playerRock){
                if(weapon.equals("PAPER")){
                    result="\nResult: Unbelievable! We have tied! *Eye twitches* ";
                }
            }else if(playerPaper){
                if(weapon.equals("CROSSBLADE")){
                    result="\nResult: Unbelievable! We have tied! *Eye twitches* ";
                }
            }else if(playerCrossblade){
                if(weapon.equals("ROCK")){
                    result="\nResult: Unbelievable! We have tied! *Eye twitches* ";
                }
            }            
            
        }else{
            weapon=null;
            response="Me: You have failed to adhere to the ancient traditions of Rock, Paper, Crossblades! You have lost by disqualification! Disgraceful!";
            result="\nResult: As I predicted, I have won this battle. The kingdom is MINE!";
        }
        return response+result;
    }
}
