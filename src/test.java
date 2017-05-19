
public class test {
    public static void main(String[] args) {

        int score = 77;

        if(score>=90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("당신의 등급은 수 입니다.");
        }

        if(score<90 && score >=80){
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("당신의 등급은 우 입니다.");
        } else {
            System.out.println("\n당신은 최선을 다하셨습니다.\n당신의 노력은 당신을 배신하지 않을겁니다.");
        }
    }
}
