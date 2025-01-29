public class MixMatch {
    public static void main(String[] args){
        String y = "XD";
        char w = 'w';
        short num = 0;
        int x = 7;
        long bignum = 10000000L;
        float z = 2.2F;
        double pi = 3.14159;
        boolean n = false;

        System.out.print(y + " <- String, stores a sequence of characters. ");
        System.out.print(w + " <- Char, stores a single Unicode character. ");
        System.out.print(num + " <- Short, stores a 16-bit signed integer. This means it can hold whole numbers ranging from -32,768 to 32,767. ");
        System.out.print(x + " <- Integar, stores values ranging from -2,147,483,648 to 2,147,483,647. ");
        System.out.print(bignum + " <- Long, This means it can store whole numbers ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.'L' indicates a long literal . ");
        System.out.print(z + " <- Float, stores a decimal value with 6-7 total digits of precision. ");
        System.out.print(pi + " <- Double, decimal numbers with a higher degree of precision compared to the float data type. ");
        System.out.print(n + " <- Boolean, only two possible values: true and false. ");

        System.out.print(y + w + num + x + bignum + z + pi + n);
    }

}