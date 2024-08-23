// Plant Watering with comments

import java.util.Scanner;

public class WateringPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int N = sc.nextInt();
        int[] plants = new int[N];

        // Input the amount of water each plant needs
        for (int i = 0; i < N; i++) {
            plants[i] = sc.nextInt();
        }

        // Input capacities of Alice's and Bob's watering cans
        int capacityA = sc.nextInt();
        int capacityB = sc.nextInt();

        // Initialize current water in cans to the maximum capacities
        int aliceWater = capacityA;
        int bobWater = capacityB;

        // Initialize refill counters
        int refillsAlice = 0;
        int refillsBob = 0;

        // Pointers for Alice (left-to-right) and Bob (right-to-left)
        int i = 0;
        int j = N - 1;

        // Simulate the watering process
        while (i <= j) {
            // Alice waters the ith plant
            if (aliceWater < plants[i]) {
                refillsAlice++;
                aliceWater = capacityA;
            }
            aliceWater -= plants[i];

            // Bob waters the jth plant
            if (i != j) {  // Ensure Bob doesn't water the same plant if i == j
                if (bobWater < plants[j]) {
                    refillsBob++;
                    bobWater = capacityB;
                }
                bobWater -= plants[j];
            }

            // Move to the next plants
            i++;
            j--;
        }

        // Output the total number of refills by Alice and Bob
        System.out.println(refillsAlice + refillsBob);
        sc.close();
    }
}
