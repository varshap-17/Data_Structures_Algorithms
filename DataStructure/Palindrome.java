package bridgelabz;

public class Palindrome {
	 public boolean isPalindrome(String s) {
	        
	        Deque<Character> deque = new ArrayDeque();
	        
	        for(int i = 0; i < s.length(); i++){
			   
	            char character = Character.toLowerCase(s.charAt(i));
	            
				/** if the character is a letter or digit number, then we insert it to the deque **/
	            if(Character.isLetterOrDigit(character)){
	                
	                deque.offerLast(character);
	            }
	        }
	        
	        boolean stillEqual = true;
	        
	        while(deque.size() > 1 && stillEqual == true){
	            
	            char first = deque.peekFirst();
	            char last = deque.peekLast();
				
	            /** compare the first char with the last char **/
	            if(first == last){
	                stillEqual = true;
	            }else{
	                return false;
	            }
				
	            /** remove first char and last char from the deque after comparision **/
	            deque.pollFirst();
	            deque.pollLast();
	        }
	        
	        return stillEqual;
	        
	    }
}
