public class GenericBinary {
    public static <E extends Comparable<E>>
    int binarySearch(E[] list, E key) {
        int index = -1;
        for(int i = 0; i < list.length; i++) {
            if(list[i].compareTo(key) == 0) {
                index = i;
            }
        }
        return index;
    }
    public static void main(String [] args) {
        String [] zoo = new String[11];
        zoo[0] = "gorilla";
        zoo[1] = "giraffe";
        zoo[2] = "koala";
        zoo[3] = "tiger";
        zoo[4] = "lion";
        zoo[5] = "penguin";
        zoo[6] = "fox";
        zoo[7] = "fish";
        zoo[8] = "hippo";
        zoo[9] = "snake";
        zoo[10] = "zebra";

        System.out.print("The index in the \"zoo\" array for \"penguin\" is " + GenericBinary.binarySearch(zoo, "penguin"));
    }
}
