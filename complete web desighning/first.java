interface One {
    default void print() {
        System.out.println("Hello");
    }
}

interface Two {
    default void print() {
        System.out.println("World");
    }
}

class MultipleInterfaces implements One, Two {
    @Override
    public void print() {
        One.super.print();
        Two.super.print();
    }
}

public class Default {
    public static void main(String[] args) {
        MultipleInterfaces mi = new MultipleInterfaces();
        mi.print();
    }
}