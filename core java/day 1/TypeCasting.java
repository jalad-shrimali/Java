public class TypeCasting {
    public static void main(String[] args){
        //byte 1 byte
        // short 2 byte
        // int 4 byte
        // long 8 byte
        // double 8 byte
        // float 4 byte
        // boolean 1 bit
        // char 2 byte
        //Type casting is a process of converting one data type to others. It is used when we deal with multiple data types.
        // we cannot cast datatype from larger storage to shorter storage, here in this case int stores 4 bytes while byte stores 1 byte
        int x = 105;
//        int y = x;
//        byte z = x;
        byte z  = (byte) x; // hence we did explicit typecasting
        int s = z; // here it automatically got casted to an integer datatype as it has larger storage
        System.out.println(z);

    }
}
