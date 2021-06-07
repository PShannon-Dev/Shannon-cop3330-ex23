package base;

import java.util.Scanner;

public class Troubleshooting {
    public Scanner input = new Scanner(System.in);
    public String answer;

    public String askQuestion()
    {
        System.out.print("Is the car silent when you turn the key? ");
        answer_question();
        if(answer.equals("Y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            answer_question();
            if(answer.equals("Y"))
                return "Clean terminals and try starting again.";

            else if(answer.equals("N"))
                return "The battery cables may be damaged.\nReplace cables and try again.";

            else
                System.exit(0);
        }
        else if(answer.equals("N")) {
            System.out.print("Does the car make a slicking noise? ");
            answer_question();
            if (answer.equals("Y"))
                return "Replace the battery.";

            else if (answer.equals("N")) {
                System.out.print("Does the car crank up but fail to start? ");
                answer_question();
                if (answer.equals("Y"))
                    {
                        return "Check spark plug connections.";
                    }
                else if (answer.equals("N"))
                {
                    System.out.print("Does the engine start and then die? ");
                    answer_question();
                    if(answer.equals("Y"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        answer_question();
                        if(answer.equals("Y"))
                        {
                            return "Get it in for service.";
                        }
                        else if(answer.equals("N"))
                        {
                            return "Check to ensure the choke is opening and closing.";
                        }
                        else
                            System.exit(0);

                    }
                    else if(answer.equals("N"))
                    {
                        return "This should not be possible.";
                    }
                    else
                        System.exit(0);
                }

                else
                System.exit(0);
            }
            else
                System.exit(0);

        }
        else
            System.exit(0);
        return null;
    }
    public void answer_question()
    {
        answer = input.next().toUpperCase();
    }
}
