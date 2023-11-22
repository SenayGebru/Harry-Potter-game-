/**
 * This program sufficiently fulfills the requirments of a Harry Potter game 
 * that randomizes three spells also creating a counter to act as Filch who is patrolling the halls.
 * Date:9/25/2022
 * @author: Senay Gebru.
 */

import java.util.Scanner;
import java.util.Random;


public class Lab4b
{
    public static void main(String[] args)
        {
        int intChoice;
        int Filch = 10;
        boolean level1 = true , level2 = true , level3 = true , gamestate = true;
        final int Alohomora = 1;
        final int Immobulus = 2;
        final int Wingardium = 3;
        
    Scanner kbd = new Scanner(System.in);

     System.out.println("You are out past curfew and you hear Filch approaching.");
     System.out.println("It sounds like he is about 10 minutes away from finding you.");
     System.out.println("You need to get back to the common room before he catches you !");
     System.out.println("You run down the hall, turn right, and then suddenly stop.");
    
    
     Random rnd = new Random();
    
    
    while (gamestate)
    {
        while (level1)
        {
            
            if (Filch == 0) 
        {
            

            gamestate = false;
            level1 = false; // add print statements that let the user know that the game is over and replace break with a return 0 or system.exit . use sentinel to stop counter from being negative
            break;

        }

            System.out.println("There is a locked door ahead of you. You pull out your wand and yell...(Press Enter)");
            intChoice = rnd.nextInt(4 - 1) + 1;
            kbd.nextLine();
        
        if(intChoice == Alohomora)
        {
            System.out.println("Alohomora!");
            System.out.println("Well done! The door creaks open and you run through. ");
            level1 = false;
        }
        if (intChoice == Immobulus)
        {
            --Filch;
            System.out.println("Immobulus!");
            System.out.println("Great idea! Now the door is immobile!  Oh wait... ");
            System.out.println("Oh no! You hear Filch is getting closer!");
            System.out.println("It sounds like he is " +Filch+ " minutes away!");

        }
        if (intChoice == Wingardium)
        {
            --Filch;
            System.out.println("Wingardium Leviosa");
            System.out.println("You try floating the door with no avail");
            System.out.println("Oh no! You hear Filch is getting closer!");
            System.out.println("It sounds like he is " +Filch+ " minutes away!");
            
        }


        }  

            System.out.println("That was close! You Sprint down the hallway toward your common room.");
            System.out.println("As you near the potions classroom, you hear a loud crash");
            System.out.println("A cloud of billiwigs erupts from the room. Their jar must have fallen off of the desk.");
            System.out.println("Sigh. You don't need this right now...you can't get stung!");
           

        while(level2)
        { 
            
            if (Filch == 0) 
                {
    
                gamestate = false;
                level2 = false;
    
                }
    
                System.out.println("You stare at the mass amount of billiwigs. You pull out your wand and yell...(Press Enter)");
                intChoice = rnd.nextInt(4 - 1) + 1;
                kbd.nextLine();

            if(intChoice == Alohomora)
                {
                    --Filch;
                    System.out.println("You applied a spell meant for unlocking and locking doors on a large group of billiwigs.");
                    System.out.println("Your spell has no effect and the billiwigs continue to fly about the potions classroom");
                    System.out.println("Oh no! You hear Filch is getting closer!");
                    System.out.println("It sounds like he is " +Filch+ " minutes away!");
                }
            
            if(intChoice == Immobulus)
                {
                    System.out.println("Immobulus!");
                    System.out.println("Nice work! The pesky creatures are all frozen mid wing-flap.");
                    System.out.println("You weave your way through the bugs and continue toward your common room");
                    level2 = false;
                }
            
            if(intChoice == Wingardium)
                {
                    --Filch;
                    System.out.println("Wingardium Leviosa");
                    System.out.println("You. Helping flying creatures fly, goodluck with that");
                    System.out.println("It sounds like he is " +Filch+ " minutes away!");

                }

        }   

            System.out.println("You're almost there! The common room is right up the next stairwell");
            System.out.println("Your race to the bottom of the stairs and come face to face with a massive pumpking pasty blocking the stairs");
            System.out.println("Looks like the weasley twins have been trying out new pranks");

            while(level3)
                { 
                
                if (Filch == 0) 
                    {
        
                    gamestate = false;
                    level3 = false;

                    System.out.println("Filch's clammy hands have caught you wandering around unsupervised, get ready to be reprimanded");
                    break;
        
                    }
        
                    System.out.println("You have to lift this huge pasty out of the way. You pull out your wand and yell...(Press Enter)");
                    intChoice = rnd.nextInt(4 - 1) + 1;
                    kbd.nextLine();

                if(intChoice == Alohomora)
                    {

                        --Filch;
                    System.out.println("You applied a spell meant for unlocking and locking doors on a large pumpkin pasty.");
                    System.out.println("Your spell has no effect and the prank sits there incriminatingly");
                    System.out.println("Oh no! You hear Filch is getting closer!");
                    System.out.println("It sounds like he is " +Filch+ " minutes away!");

                    }
                if(intChoice == Immobulus)
                    {
                        --Filch;
                        System.out.println("Immobulus!");
                        System.out.println("Great idea! Now the pumpkin pasty is immobile!  Oh wait... ");
                        System.out.println("Oh no! You hear Filch is getting closer!");
                        System.out.println("It sounds like he is " +Filch+ " minutes away!");

                    }
                if(intChoice == Wingardium)
                    {
                        System.out.println("Wingardium Leviosa");
                        System.out.println("The pasty floats up high enough foryou to duck underneath.");
                        System.out.println("You take a quick bite as you go under. Delicious !");
                        level3 = false;
                        
                    }
                   
                }
                gamestate = false;       
    }
            System.out.println("Your reach the door of your common room and slip safely inside.");
            System.out.println("Filch is no match for a student of your ability !");
            System.out.println("Game over. You Win !");
        }
}
