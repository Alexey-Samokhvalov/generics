package org.example;
public class GenericsClass<T, V, K> {
        private T variable1;
        private V variable2;
        private K variable3;

        public GenericsClass(T variable1, V variable2, K variable3) {
            this.variable1 = variable1;
            this.variable2 = variable2;
            this.variable3 = variable3;
        }

        public T getVariable1() {
            return variable1;
        }

        public V getVariable2() {
            return variable2;
        }

        public K getVariable3() {
            return variable3;
        }
    public void printClassNames() {
        System.out.println("Имя класса для 1 переменной: " + variable1.getClass().getSimpleName());
        System.out.println("Имя класса для 2 переменной: " + variable2.getClass().getSimpleName());
        System.out.println("Имя класса для 3 переменной: " + variable3.getClass().getSimpleName());
    }
}
