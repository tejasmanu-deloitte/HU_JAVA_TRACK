class Exception {
    public static void main(String[] args){
        try{
            System.out.println("Try Block");
            int i = 9/0;
            System.out.println(i);
        }
        catch(ArithmeticException e){
            System.out.println("Catch block");
            System.out.println("ArithmeticException: Number Divided by Zero");
        }
        finally{
            System.out.println("** Thank You **");
        }
    }
}
