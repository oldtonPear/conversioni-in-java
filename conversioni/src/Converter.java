public class Converter {
    

    public String decToHex(long number){
        if(number/16 == 0) return Long.toHexString(number%16).toUpperCase();
        return decToHex(number/16) + Long.toHexString(number%16).toUpperCase();
    }
    public String hexToDec(String number){
        number = number.toUpperCase();  
        String digits = "0123456789ABCDEF";  
        long val = 0;  
        for (int i = 0; i < number.length(); i++)  {  
            char c = number.charAt(i);  
            long d = digits.indexOf(c);  
            val = 16*val + d;  
        }  
        return Long.toString(val);  
    }
    public String decToBin(long number){
        if(number/2 == 0) return 0 + Long.toBinaryString(number%2);
        return decToBin(number/2) + Long.toBinaryString(number%2);
    }
    public String binToDec(String number){
        if(number == "") return "0";
        return Long.toString(Long.parseLong(number.substring(0, 1)) * (long)Math.pow(2, number.length()-1)
         + Long.parseLong(binToDec(number.substring(1))));
    }
    public String hexToBin(String number){
        return decToBin(Long.parseLong(hexToDec(number)));
    }
    public String binToHex(String number){
        return decToHex(Long.parseLong(binToDec(number)));
    }
}
