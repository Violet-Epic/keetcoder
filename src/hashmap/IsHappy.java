package hashmap;

public class IsHappy {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while (true) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if (slow == fast) {
                break;
            }
            if (slow == 1 || fast == 1) {
                return true;
            }
        }
        return false;
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
