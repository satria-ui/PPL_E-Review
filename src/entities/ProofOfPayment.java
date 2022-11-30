package entities;

import java.util.ArrayList;

public class ProofOfPayment {
//    private int bill;
    ArrayList<Integer> bill = new ArrayList<Integer>();

    public int setBill(int money){
        bill.add(money);
        return money;
    }
    public int getBill()
    {
        int sum = 0;
        for (Integer integer : bill) {
            sum = sum + integer;
        }
        return sum;
    }
}
