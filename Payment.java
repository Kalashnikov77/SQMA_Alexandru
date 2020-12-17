public class Payment {

    private final int credit;

    Payment(int credit) {
        this.credit = credit;
    }

    public int payEnel() {
        return this.credit - 20;
    }

    public float payTax() {
        return (float) this.credit / 2;
    }

    public static void main(String[] args) {
        System.out.println("Main Class");
    }

}
