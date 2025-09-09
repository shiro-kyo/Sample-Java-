
public class OrSanole {

    public static void main(String[] args) {
        int scoreSansu = 80;
        int scoreKokugo = 80;
        if(scoreSansu >= 60 && scoreKokugo >= 60) {
            System.out.println("合格してます！");
        } else if (scoreSansu >= 60 || scoreKokugo >= 60) {
            System.out.println("算数か国語どちらかが補修対象です");
        } else {
            System.out.println("赤点です・・・補修を行います");
        }

    }

}
