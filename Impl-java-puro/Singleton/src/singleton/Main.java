package singleton;

public class Main {
    public static void main(String[] args) {
        SingletonImpl obejto1 = SingletonImpl.getInstance();
        System.out.println(obejto1);

        SingletonImpl obejto2 = SingletonImpl.getInstance();
        System.out.println(obejto2);

        obejto1.setAtributo(" atributo objeto1");
        System.out.println(obejto1.getAtributo());
        System.out.println(obejto2.getAtributo());
    }
}