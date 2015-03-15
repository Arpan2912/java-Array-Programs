class BinaryToDecimal {
 
    static int btod(int binary){
         
        int d = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int tmp = binary%10;
                    System.out.println( " temp " + tmp);
                d += tmp*Math.pow(2, power);
                    System.out.println( " decimal "+ d );
                binary = binary/10;
                power++;
                    System.out.println( " binary " + binary);
            }
        }
        return d;
    }
     
    public static void main(String a[]){
        System.out.println( "Ans: Decimal is " + BinaryToDecimal.btod(10) );
    }
}