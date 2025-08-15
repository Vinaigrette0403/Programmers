package LV_0;

import java.util.Arrays;

public class 산책 {
    public static int[] walk(String route) {
        int east = 0, north = 0;
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N': north++; break;
                case 'S': north--; break;
                case 'E': east++;  break;
                case 'W': east--;  break;
            }
        }
        return new int[]{east, north};
    }

    public static void main(String[] args) {
        String route = "NSSNEWWN";             
        int[] pos = walk(route);
        System.out.println(Arrays.toString(pos)); 
    }
}
