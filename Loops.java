// rewrite the python loops as java

public class Loops {

    public static void main(String[] args) {
    
    // for i in range(1,100)
        System.out.print("for i in range(1,100): ");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

    // for i in range(2,101,2)
        System.out.print("for i in range(2,101,2): ");
        for (int i = 2; i <= 101; i += 2) {
            System.out.println(i);
        }

    // for i in range(100,0,-1)
        System.out.print("for i in range(100,0,-1): ");
        for (int i = 100; i >= 0; i -= 1) {
            System.out.println(i);
        }

    // for x,y in zip(range(10),range(0,20,2))
    // this is what the python yields:
        //     >>> for x, y in zip(range(10),range(0,20,2)):
        // ...     print(x, y)
        // ... 
        // 0 0
        // 1 2
        // 2 4
        // 3 6
        // 4 8
        // 5 10
        // 6 12
        // 7 14
        // 8 16
        // 9 18
        // >>> 
        System.out.print("for x,y in zip(range(10),range(0,20,2)): ");
        // separate statements in the same clause with ,]
        
    }

}