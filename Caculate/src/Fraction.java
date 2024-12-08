class Fraction {
    private int numerator;   // 分子
    private int denominator; // 分母

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("分母不能为0");
        }

        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;

        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    
    }
    // 将分数转换为 double
    public double toDouble() {
        return (double) numerator / denominator;
    }

    public Fraction plus(Fraction r) {
        int newNumerator = this.numerator * r.denominator + r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction r) {
        int newNumerator = this.numerator *  r.numerator;
        int newDenominator = this.denominator * r.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public void print() {
        if (numerator == 0) {
            System.out.println(0);
        } else if (denominator == 1) {
            System.out.println(numerator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    // 求最大公约数
    private int gcd(int a, int b) { 
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

}
