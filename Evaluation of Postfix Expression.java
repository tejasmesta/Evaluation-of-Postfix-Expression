class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String exp)
    {
        Stack<Integer> vs = new Stack<>();
        
        for(int i=0;i<exp.length();i++)
        {
            char c = exp.charAt(i);
            if(c=='+' || c=='-' || c=='/' || c=='*')
            {
                int v2 = vs.pop();
                int v1 = vs.pop();
                int resv = opr(v1,v2,c);
                vs.push(resv);
            }
            else
            {
                vs.push(c-'0');
                
            }
        }
        
        return vs.peek();
    } 
    
    public static int opr(int a,int b,char c)
    {
        if(c=='+')
        {
            return a+b;
        }
        else if(c=='-')
        {
            return a-b;
        }
        else if(c=='/')
        {
            return a/b;
        }
        else
        {
            return a*b;
        }
    }
    
    
}
