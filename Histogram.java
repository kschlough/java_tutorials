// python
// def main():
//     count = [0]*10
//     data = open('test.dat')

//     for line in data:
//         count[int(line)] = count[int(line)] + 1

//     idx = 0
//     for num in count:
//         print(idx, " occurred ", num, " times.")
//         idx += 1

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Histogram {

    public static void main(String[] args) {
        Scanner data = null;
        ArrayList<Integer> count;
        int idx;

        try {
            data = new Scanner(new File("test.dat"));
        }
        catch (IOException e) {
            System.out.println("Sorry, unable to open your data file");
            e.printStackTrace();
            System.exit(0);
        }

        count = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            count.add(0);
        }

        while(data.hasNextInt()) {
            idx = data.nextInt();
            count.set(idx, count.get(idx)+ 1);
        }

        idx = 0;
        for(int i : count) {
            System.out.println(idx + " occurred " + i + " times.");
            idx++;
        }
    }
}