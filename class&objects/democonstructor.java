//-------------java constructor-------------//

class A{
    int a; String name;
    A(){
        a=10; name = null;
    }
    void show(){
        System.out.println(a+" "+name);
    }
}

class democonstructor{
    public static void main(String[] args){
        A ref = new A();
        ref.show();
    }
}

/*java has default constructor 
A is class name and A() is the constructor 
always save the program with the class name which has the main method */