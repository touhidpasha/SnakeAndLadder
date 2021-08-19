public class SnakeLadder{
    public static void main(String[] args) {
        int pos=0;
        int die,count=0;
        int[] ladder=new int[]{5,33,55,23,87,90};
        int[] snake=new int[]{4,77,80,49};
        while(count<=100)
        {

        die =(int) ((Math.random() * (6 - 1)) + 1);
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
        count=count+die;
        System.out.println("your total count is "+count);
        if (count==100)
        {
            System.out.println("you got exact 100 points");
        }
        
        }
        System.out.println("you won");

    }
}