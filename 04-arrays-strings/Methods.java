public class Methods {
    public static void main(String[] args) {
        basicMethod();
        Methods m = new Methods();
        m.nonStaticBasicMethod();
        System.out.println(m.methodReturnsInt());
        System.out.println(m.singleParamReturnsInt(12));
        m.multiParamMethod(1,"Vijay", 30);
    }

    //noReturnNoParam static method
    public static void basicMethod() {
        System.out.println("basic method is called");
    }

    //noReturn non-static method
    public void nonStaticBasicMethod() {
        System.out.println("Non static basic method is called");
    }

    //method returns int
    public int methodReturnsInt() {
        int num = 10;
        return num;
    }

    //method with single param returns int
    public int singleParamReturnsInt(int num) {
        return num;
    }

    //same above method without param is also a diff method  -- Method overloading concept
    public int singleParamReturnsInt() {
        int num=10;
        return num;
    }

    //method with same name but different Param -- Method overloading
    public int singleParamReturnsInt(String num) {
        return Integer.parseInt(num);
    }

    //methods can accept any number of params - 2 or more params
    public void multiParamMethod(int id, String name, int age) {
        System.out.println(id + name + age);
    }
}
