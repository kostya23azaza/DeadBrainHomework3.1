package homework;


public class Main {
    public static void main(String[] args) {
        Integer arr1[] = {1, 2, 3, 46, 242, 31, 4};
        String arr2[] = {"L", "A", "N", "f", "E", "H", "K"};
        FirstTask task1 =  new FirstTask();
        SecondTask task2 = new SecondTask();
        task1.swap(arr1, 1,2);
        task1.swap(arr2, 2,4);
        task2.asList(arr2);
        Box<Orange> orange1 = new Box<>();
        Box<Orange> orange2 = new Box<>();
        Box<Apple> apple1 = new Box<>();
        Box<Apple> apple2 = new Box<>();
        orange1.addFruit(new Orange(),7);
        orange2.addFruit(new Orange(),10);
        apple1.addFruit(new Apple(),3);
        apple2.addFruit(new Apple(),9);
        System.out.println(orange1.getWeight());
        System.out.println(apple1.getWeight());
        System.out.println(orange2.getWeight());
        System.out.println(apple2.getWeight());
        System.out.println(apple1.compare(orange1));
        orange2.pourIt(orange1);
        apple1.pourIt(apple2);
        System.out.println(orange1.getWeight());
        System.out.println(apple1.getWeight());
        System.out.println(orange2.getWeight());
        System.out.println(apple2.getWeight());
    }
//not bad
}
