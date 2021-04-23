import java.util.Stack;
public class BracketCheck{
    
    Stack<Character> stack = new Stack<Character>();
    
    public void check(char []input){
        int opb1=0;
        int opb2=0;
        int opb3=0;
        int cb1=0;
        int cb2=0;
        int cb3=0;
//        int op = 0;
        
        for(int i=0; i<input.length; i++)
        {

            if(input[i]=='(' || input[i]=='{'|| input[i]=='[')
            {
                stack.push(input[i]);
                if(input[i]=='(') opb1++;
                if(input[i]=='{') opb2++;
                if(input[i]=='[') opb2++;   
            } 
            else if(input[i]==')' || input[i]=='}'|| input[i]==']')
            {
                if(input[i]==')'){
                    char popedElewm= stack.pop();
                    if(popedElewm!='(')
                    {
                        System.out.print("error");
                        System.out.println();
                        break;
                    }
                    else
                    {
                        cb1++;
                    }
                }
                if(input[i]=='}'){
                    char popedElewm= stack.pop();
                    if(popedElewm!='{')
                    {
                        System.out.print("error");
                        System.out.println();
                        break;
                    }
                    else
                    {
                        cb2++;
                    }
                }
            }
            if(input[i]==']'){
//            if(stack.isEmpty())
//            {
//                break;
//            }
                char popedElewm= stack.pop();
                if(popedElewm!='[')
                {
                    System.out.print("error");
                    System.out.println();
                    break;
                }
                else
                {
                    cb3++;
                }
            }    
        }  
        for(int i=0; i<input.length ; i++)
        {
            System.out.print(input[i]);
        }
        System.out.println();
  
            if(opb1==cb1 || opb2==cb3 || opb3==cb3)
            {
                if(stack.isEmpty()==true   )
                {
                    System.out.print("The expression is correct");
                    //break;
                }
            }
        
         else
         {
             if(opb1!=cb1 || opb2!=cb2 || opb3!=cb3)
            {
                if(stack.isEmpty()==false)
                {
                    System.out.print("The expression is not correct");
                    //break;
                }
            }
        } 
    }
}




