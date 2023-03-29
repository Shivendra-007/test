
 class Test {
   public static void main(String[] args) {
    String s="naman";
    String s2="manan";
    String s3="sanan";
    try{

    for(int i=0;i<s.length();i++)
    {
        Thread.sleep(1000);
      System.out.print(s.charAt(i));
    }

   } 

catch(Exception e)
{
  e.printStackTrace();
}
}
}
