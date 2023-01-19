package practice;

import java.util.*;

public class CoolNumbers {

    public static List<String> generateCoolNumbers() {
        ArrayList<String> coolNumbers = new ArrayList<>();
        String[] letters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String[] numbers = {"111", "222", "333", "444", "555", "666", "777", "888", "999"};
        String coolNumber = "";
        for (String letter1 : letters){
            for (String number : numbers){
                for (String letter2 : letters) {
                    for (String letter3 : letters) {
                        for (int i = 1; i < 200; i++){
                            if (i < 10) {
                                coolNumber = letter1 + number + letter2 + letter3 + "0" + i;
                            } else {
                                coolNumber = letter1 + number + letter2 + letter3 + i;
                            }
                            coolNumbers.add(coolNumber);
                        }
                    }
                }
            }
        }
        return coolNumbers;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        for (String element : list){
            if (Objects.equals(element, number)){
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        int index = Collections.binarySearch(sortedList, number);
        return index >= 0;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        return hashSet.contains(number);
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        return treeSet.contains(number);
    }

}
