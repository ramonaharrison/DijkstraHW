package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.List;

/**
 * Access Code 2.1
 * Ramona Harrison
 * InterviewCakeII.java
 *
 * You have a list of integers, and for each index you want to find the product of every integer except the integer at that index.
 Write a function get_products_of_all_ints_except_at_index() that takes a list of integers and returns a list of the products.

 For example, given:

 [1, 7, 3, 4]

 your function would return:

 [84, 12, 28, 21]

 by calculating:

 [7*3*4, 1*3*4, 1*7*4, 1*7*3]

 Do not use division in your solution.

 */

public class InterviewCakeII {

    public static List<Integer> getProductsOfAllIntsExceptAtIndex(List<Integer> integers) {
        List<Integer> products = new ArrayList<Integer>();

        for (int i = 0; i < integers.size(); i++) {
            int product = 1;
            for (int j = 0; j < integers.size(); j++) {
                if (j != i)
                    product = product * integers.get(j);

            }
            products.add(product);
        }
        return products;
    }

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(7);
        integers.add(3);
        integers.add(4);

        List<Integer> products = getProductsOfAllIntsExceptAtIndex(integers);
        for (int product: products) {
            System.out.println(product);
        }
    }
}
