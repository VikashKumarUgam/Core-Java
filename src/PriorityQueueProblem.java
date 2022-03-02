/**
 * Problem Statement
 * 1. Implement a queue which takes various words as input
 * 2. Replace the word from queue if the already present word on the queue is smaller in length than the word to be inserted
 * 3. If the two words are equal then replace the word in queue only if the word in queue is alphabetically lower than the word
 * 4. Print the word i.e., it should be of the highest length and in reverse of alphabetically order(if two words of same length) of the total input words by user
 */

import java.util.*;

public class PriorityQueueProblem {

    public static void main(String args[])
    {
        Queue<String> words = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();
        for(int i = 0; i<numberOfWords;i++){
            String word = scanner.next();
            if(words.isEmpty()){
                words.add(word);
            }
            else if(words.peek().length() > word.length()){
                continue;
            }
            else if(words.peek().length() == word.length()){
                int compare = words.peek().compareTo(word);
                if(compare <0){
                    words.poll();
                    words.add(word);
                }
            }
            else if(words.peek().length() < word.length()){
                words.poll();
                words.add(word);
            }
        }
        System.out.println(words.peek());
    }
}
