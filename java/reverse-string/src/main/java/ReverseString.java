class ReverseString {

    String reverse(String inputString) {
        String reverseWord = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverseWord += inputString.charAt(i);
        }
        return reverseWord;
    }
  
}
