import java.util.Random;
public class Test {
    public static void main(String[] args){
        int numOfCards = 54;//卡牌总数
        int[] Cards = new int[numOfCards];
        int maxNum = 54;//最大牌号
        int count = 0;//发牌次数统计
        Random random = new Random();
        for(int i = 0; i < numOfCards; i++){
            Cards[i] = i + 1;//把牌放入数组
        }
        for(int i = 0; i < numOfCards; i++){
            int num = random.nextInt(maxNum);//生成0到maxNum的左开右闭区间
            System.out.println(num+"现在发的牌号码为："+Cards[num]);
            /*********完成交换功能, java中传递引用的拷贝，swap不好使但不报错********/
            int temp = Cards[num];
            Cards[num] = Cards[numOfCards-i-1];
            Cards[numOfCards-i-1] = temp;
            /*********完成交换功能********/
            maxNum--;
            count++;
        }
        System.out.println("\n总的发牌次数统计："+count);
    }

}

