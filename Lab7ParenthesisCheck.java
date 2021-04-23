public class Lab7ParenthesisCheck{
    public static void main(String []args){
        
        String input1="1+2*(3/4)";
        String input2="1+2*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        String input3="1+2*[3*3+{4–5(6(7/8/9)+10)}–11+(12*8)/{13+13}]+14";
        String input5="1+2]*[3*3+{4–5(6(7/8/9)+10)–11+(12*8)]+14";
        
        String input6="( ( 5 + 1 } ( 5 + 8 - 1 ( ( 10 + 3 ( 1 } ) ) ) ) ) )";
        String input7="] [ 5 + 1 ] [";
        String input8="[ [ 3 + 7 - [ 5 + 1 ] + 5 ] ]";
        
        BracketCheck m = new BracketCheck();
        m.check(input8.toCharArray());
    }
}