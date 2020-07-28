/**
 * 杭州云霁科技有限公司
 * http://www.idcos.com
 * Copyright (c) 2020 All Rights Reserved.
 */
package addtwonumber;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jiangtao
 * @data 2020/7/27 18:08
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry =0;

        while(p!=null||q!=null){
            int a = p != null ? p.val : 0;
            int b = q != null ? q.val : 0;
            int sum = a + b + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
            if (p!=null){
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;

    }
}
