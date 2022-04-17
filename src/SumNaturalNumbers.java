public class SumNaturalNumbers {

        public static void main(String[] args) {

            int num = 5, sum = 0;

            for(int i = 1; i <= num; ++i)
            {
                if (i==num)
                    System.out.print(i);
                else
                    System.out.print(i+"+");
                sum += i;
            }

            System.out.print(" = " + sum);
        }
    }

