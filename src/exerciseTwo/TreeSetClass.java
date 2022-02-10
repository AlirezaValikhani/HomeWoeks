package exerciseTwo;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Character> treeSet = new TreeSet<>();
        TreeSet<Character> treeSet1 = new TreeSet<>();
        while (treeSet.size() < 10){
            treeSet.add((char)((int)(Math.random() * ('z' - 'a') + 'a')));
        }

        while (treeSet1.size() < 10){
            treeSet1.add((char)((int)(Math.random() * ('z' - 'a') + 'a')));
        }

        System.out.println(treeSet);
        System.out.println(treeSet1);
        union(treeSet,treeSet1);
        interSection(treeSet,treeSet1);
    }

    public static void union(TreeSet<Character> treeSet,TreeSet<Character> treeSet1){
        TreeSet<Character> temp = new TreeSet<>();
        temp.addAll(treeSet);
        temp.addAll(treeSet1);
        System.out.println(temp);
    }

    public static void interSection(TreeSet<Character> treeSet,TreeSet<Character> treeSet1){
        TreeSet<Character> temp = new TreeSet<>();
        temp.addAll(treeSet);
        temp.retainAll(treeSet1);
        System.out.println(temp);
    }
}
