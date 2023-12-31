import java.util.*;

public class SortStackRecursive {


  public static void main(String[] args) {

    Stack<Integer> st = new Stack<>();

    st.push(9);

    st.push(3);

    st.push(5);

    st.push(10);

    System.out.println("Stack before sorting:");

    for (Integer s : st) {

      System.out.print(s + " ");

    }

    System.out.println("\nStack after sorting:");

    Stack<Integer> sorted = sortedStack(st);

    for (Integer i : sorted) {

      System.out.print(i + " ");

    }

  }



  private static Stack<Integer> sortedStack(Stack<Integer> st) {

    // Base condition

    if (st.size() == 1) {

      return st;

    }

    Integer topEl = st.pop();

    // Hypotheses

    sortedStack(st);



    // Induction

    return insertElementAt(st, topEl);

  }



  private static Stack<Integer> insertElementAt(Stack<Integer> st, Integer el) {

    // Base condition

    if (st.size() == 0 || st.peek() <= el) {

      st.push(el);

      return st;

    }



    Integer topEl = st.pop();

    // Hypotheses

    insertElementAt(st, el);



    // Induction

    st.push(topEl);

    return st;

  }

}
