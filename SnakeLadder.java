public class SnakeLadder{
    public static void main(String[] args) {
        int pos=0;
        int die=(int) ((Math.random() * (6 - 1)) + 1);
        int[] ladder=new int[]{5,33,55,23,87,90};
        int[] snake=new int[]{4,77,80,49};
        System.out.println(die);
    }
}