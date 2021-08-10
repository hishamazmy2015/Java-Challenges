package CODEFORCES_C1;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Div2_515C_Drazil_and_Factorial {


    public static void main(String[] args) throws IOException {

        // Write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> res = new ArrayList<Integer>();
        int n = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            int xx = Integer.parseInt(String.valueOf(str.toCharArray()[i]));
            switch (xx) {
                case 2:
                    res.add(2);
                    break;
                case 3:
                    res.add(3);
                    break;

                case 4:
                    res.add(3);
                    res.add(2);
                    res.add(2);
                    break;

                case 5:

                    res.add(5);
                    break;

                case 6:

                    res.add(5);
                    res.add(3);
                    break;

                case 7:
                    res.add(7);
                    break;

                case 8:


                    res.add(7);
                    res.add(2);
                    res.add(2);
                    res.add(2);
                    break;
                case 9:
                    res.add(2);
                    res.add(3);
                    res.add(3);
                    res.add(7);
                    break;

            }

        }
        String collect = res.stream().sorted(Collections.reverseOrder()).map(Object::toString).collect(Collectors.joining());
        System.out.println(collect);


    }


}
