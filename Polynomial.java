public class Polynomial {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(2, 3);
        Complex c3 = c1.add(c2);
        System.out.println(c3.getReal() + " " + c3.getImagine());
        Complex c4 = c1.mult(c2);
        System.out.println(c4.getReal() + " " + c4.getImagine());
        Complex c5 = c1.exp();
        System.out.println(c5.getReal() + " " + c5.getImagine());
        Complex c6 = c1.rootOfUnity(5, 3);
        System.out.println(c6.getReal() + " " + c6.getImagine());
        Complex[] c7 = c1.rootOfUnity(5);
        for (int i = 0; i < c7.length; i++) {
            System.out.println(c7[i].getReal() + " " + c7[i].getImagine());
        }
    }
}
