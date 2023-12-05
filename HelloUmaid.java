class Test {
    void meth(int i, int j) {
        j *= 2;
        j /= 2;
    }
}

class HelloUmaid {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        Test ob = new Test();

        System.out.println("a and b before call: " + a + "  " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + "  " + b);
    }
}
