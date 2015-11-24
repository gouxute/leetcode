/**
 * Created by maotz on 2015-05-22.
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers2 {


    public static void main(String[] args) {
        AddTwoNumbers2 ss = new AddTwoNumbers2();
        int a1 = 1;
        int b1 = 10;
        ListNode[] a = new ListNode[a1];
        ListNode[] b = new ListNode[b1];
        for (int i = 0; i <= a1 - 1; i++) {
            ListNode temp = new ListNode(i);
            a[i] = temp;
            a[i].val = 9;
        }
        for (int i = 0; i <= b1 - 1; i++) {
            ListNode temp1 = new ListNode(9);
            b[i] = temp1;
        }
        b[0].val = 1;
        b[6].val = 8;
        for (int i = 0; i <= a1 - 2; i++) {
            a[i].next = a[i + 1];
        }
        for (int i = 0; i <= b1 - 2; i++) {
            b[i].next = b[i + 1];
        }

        ListNode result = ss.addTwoNumbers1(a[0], b[0]);
        ListNode aa = result;
        while (null != result) {
            System.out.print(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {

        long ll1 = 0L, ll2 = 0L;
        int i = 0;
        while (l1 != null) {
            long base = 1L;
            for (int i1 = 1; i1 <= i; i1++)
                base = base * 10;
            ll1 = ll1 + (long) l1.val * (long) base;
            i++;
            l1 = l1.next;
        }
        i = 0;
        while (l2 != null) {
            long base = 1L;
            for (int i1 = 1; i1 <= i; i1++)
                base = base * 10;

            ll2 = ll2 + (long) l2.val * (long) base;
            i++;
            l2 = l2.next;
        }

        long number = ll1 + ll2;
        long number1 = 0;

        ListNode result = new ListNode(0);
        ListNode result1 = result;
        String t = number + "";
        result.val = (int) (number % 10);
        for (int i1 = 1; i1 <= t.length() - 1; i1++) {
            long base = 1L;
            for (int i2 = 0; i2 <= i1; i2++)
                base = base * 10;
            int sss;

            long temp1 = (long) (number % base);
            temp1 = temp1 / ((long) (base / 10));
            ListNode temp = new ListNode((int) temp1);
            result.next = temp;
            result = result.next;
        }
        return result1;
    }

}


