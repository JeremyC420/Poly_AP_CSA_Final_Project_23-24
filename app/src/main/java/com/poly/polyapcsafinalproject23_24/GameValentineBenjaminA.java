package com.poly.polyapcsafinalproject23_24;


public class GameValentineBenjaminA extends GameActivity {

    //create variables up here
    ValentineCriminal player;
    int option;



    //write game down here
    //  use other void methods as nesssary
    //  use loops as nessesary
    public void run()
    {
        player = new ValentineCriminal();
   player.setName("Bob");
        System.out.println(player);

        player.rob();
        System.out.println(player.getMoney());

        startRobbing();
    }

    public void startRobbing()
    {
        while(player.getMoney() > 0)
        {
            displayStats();
            String text = "        Options\n" +
                    "        1. rob\n" +
                    "        2. turn someone else in\n" +
                    "        3. turn yourself in";
            System.out.println(text);
            if (option == 1)
            {
                player.rob();
            }
            else if (option == 2)
            {
                //turnSomeoneElseIn();
            }
            else if (option == 3)
            {
                //turnYourselfIn();
            }

        }

    }

    private void displayStats()
    {
        System.out.println( "Name:\t" + player.getName());
        System.out.println( "Money:\t$" + player.getMoney());
        System.out.println( "Name:\t" + player.getName());
        System.out.println( "Money:\t$" + player.getMoney());    }

}






