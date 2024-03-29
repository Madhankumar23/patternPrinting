import java.util.*;
class Main {
    public static void main(String[] args) {
        PatternSolution ps=new PatternSolution();
        Scanner scan=new Scanner(System.in);
        int testcase=scan.nextInt();
        while(testcase-->0){
            int num=scan.nextInt();
            ps.pattern9(num);
        }
    }
}
class PatternSolution{
    public static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int row=1;row<=(2*n-1);row++){
            int stars=(row<=n)?row:(2*n-row);
            for(int col=1;col<=stars;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int row=1;row<=n;row++){
            //spaces
            for(int j=1;j<=(n-row);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        int stars=1;
        for(int i=1;i<=n;i++){
            //space
            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            stars+=2;
            //space
            for(int space=1;space<=(n-i);space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        int stars=(n*2)-1,spaces1=0,spaces2=0;
        for(int i=1;i<=n;i++){
            //space
            for(int space=1;space<=spaces1;space++){
                System.out.print(" ");
            }
            //stars
            for(int j=stars;j>=1;j--){
                System.out.print("*");
            }
            stars-=2;
            //space
            for(int space=1;space<=spaces2;space++){
                System.out.print(" ");
            }
            spaces2++;
            spaces1++;
            System.out.println();
        }
    }
}