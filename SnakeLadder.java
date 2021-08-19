public class SnakeLadder{
    public static void main(String[] args) {
        int pos=0;
        int die,p1_count=0,p1_dicecount=0,p2_count=0,p2_dicecount=0,flag=1;
        int[] ladder=new int[]{5,33,55,23,87,90};
        int[] snake=new int[]{4,77,80,49};
        while(p1_count<=100 || p2_count<=100)
        {
            flag++;
            if(flag%2==0){
                
            System.out.println("=================player1 data===============");
        die =(int) ((Math.random() * (6 - 1)) + 1);
        p1_dicecount++;
        System.out.println("your die number is "+die);
        for (int i=0;i<ladder.length;i++)
        {
            if(die==ladder[i])
            {
                die=die+ladder[i];
                System.out.println("you got bonus ladder "+ladder[i]);
                break;
            }
        }

        for (int i=0;i<snake.length;i++)
        {
            if(die==snake[i])
            {
                die=die-snake[i];
                System.out.println("snake swalloed your point of "+snake[i]);
                break;
            }
        }
        p1_count=p1_count+die;
        System.out.println("your total count is "+p1_count);
        if (p1_count==100)
        {
            System.out.println("you got exact 100 points");
        }
    }
    else
    {
        System.out.println("=================player2 data===============");
    die =(int) ((Math.random() * (6 - 1)) + 1);
    p2_dicecount++;
    System.out.println("your die number is "+die);
    for (int i=0;i<ladder.length;i++)
    {
        if(die==ladder[i])
        {
            die=die+ladder[i];
            System.out.println("you got bonus ladder "+ladder[i]);
            break;
        }
    }

    for (int i=0;i<snake.length;i++)
    {
        if(die==snake[i])
        {
            die=die-snake[i];
            System.out.println("snake swalloed your point of "+snake[i]);
            break;
        }
    }
    p2_count=p2_count+die;
    System.out.println("your total count is "+p2_count);
    if (p2_count==100)
    {
        System.out.println("you got exact 100 points");
    }
}
    if(p1_count>=100 || p2_count>=100)
    break;

        }

        if(p1_count>=100)
        System.out.println("palyer1 won and number dice thrown are "+p1_dicecount);
        else
        System.out.println("palyer2 won and number dice thrown are "+p2_dicecount);


    }
}