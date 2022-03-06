public class RationalNumber {
    private int numerator;
    private int denominator;
    public RationalNumber()
    {
        this.numerator = 0;
        this.denominator = 1;
    }
    public RationalNumber( int num, int den)
    {
        numerator = num;
        denominator = den;
    }
    public RationalNumber( RationalNumber rhs)
    {
        this.numerator = rhs.numerator;
        this.denominator = rhs.denominator;
    }


    public void setDenominator(int denominator)throws ArithmeticException {
        try {
            if (denominator == 0) {
                throw new ArithmeticException();
            }
            this.denominator = denominator;
        }
        catch (Exception E)
        {
            System.out.println("No denominators of 0");
        }

    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getNumerator()
    {
        return this.numerator;
    }
    public int getDenominator()
    {
        return this.denominator;
    }

    public RationalNumber add(RationalNumber rhs)
    {
        RationalNumber result = new RationalNumber();
        GCD(this, rhs);
        result.setNumerator(this.numerator + rhs.numerator);
        result.setDenominator(this.denominator);
        return result;
    }
    public RationalNumber sub(RationalNumber rhs)
    {
        RationalNumber result = new RationalNumber();
        GCD(this,rhs);
        result.setNumerator(this.numerator - rhs.numerator);
        result.setDenominator(this.denominator);
        return result;
    }
    public RationalNumber mult(RationalNumber rhs)
    {
        RationalNumber result = new RationalNumber();
//      this.backToFraction();
//      rhs.backToFraction();
        result.setNumerator(this.numerator *  rhs.numerator);
        result.setDenominator(this.denominator * rhs.denominator);
        return result;
    }
    public RationalNumber div(RationalNumber rhs)
    {
        RationalNumber result = new RationalNumber();
//      this.backToFraction();
//      rhs.backToFraction();
        result.setNumerator( this.numerator * rhs.denominator);
        result.setDenominator(this.denominator * rhs.numerator);
        return result;
    }

    public boolean isEqual(RationalNumber rhs)
    {
        GCD(this, rhs);
        if(this.numerator == rhs.numerator)
        {
            return true;
        }
        return false;
    }


    public String toString() {
        simplify(this);
        if(this.numerator == 0)
        {
            return "0";
        }
        else if ( Math.abs(this.numerator) >= Math.abs(this.denominator)){
            int newNumerator = this.numerator;
            int count = 0;
            if(this.numerator >0 && this.denominator >= 1) {
                while (Math.abs(newNumerator) > Math.abs(this.denominator)) {
                    newNumerator -= this.denominator;
                    count++;
                }
            }
            else if( this.numerator < 0 || this.denominator <0)
            {
                while (Math.abs(newNumerator) > Math.abs(this.denominator)) {
                    newNumerator += this.denominator;
                    count--;
                }
            }
            if(Math.abs(this.numerator) == Math.abs(this.denominator))
            {
                return count + "";
            }
            else if (this.numerator < 0 || this.denominator < 0)
            {
                if(count < 0)
                {
                    return count + " " + Math.abs(newNumerator) + "/" + Math.abs(this.denominator);
                }
                else {
                    return "-" + Math.abs(newNumerator) + "/" + Math.abs(this.denominator);
                }
            }
            else {
                return count + " " + newNumerator + " / " + this.denominator;
            }
        }
        else
        {
            return this.numerator + " / " + this.denominator;
        }
    }

    private RationalNumber simplify(RationalNumber rhs)
    {
        if(rhs.numerator > 0 && rhs.denominator >= 1) {
            if (rhs.numerator % 2 == 0 && rhs.denominator % 2 == 0) {
                rhs.numerator = rhs.numerator / 2;
                rhs.denominator = rhs.denominator / 2;
                simplify(rhs);
            } else if (rhs.numerator % 3 == 0 && rhs.denominator % 3 == 0) {
                rhs.numerator = rhs.numerator / 3;
                rhs.denominator = rhs.denominator / 3;
                simplify(rhs);
            } else if (rhs.numerator % 5 == 0 && rhs.denominator % 5 == 0) {
                rhs.numerator = rhs.numerator / 5;
                rhs.denominator = rhs.denominator / 5;
                simplify(rhs);
            } else if (rhs.numerator % 7 == 0 && rhs.denominator % 7 == 0) {
                rhs.numerator = rhs.numerator / 7;
                rhs.denominator = rhs.denominator / 7;
                simplify(rhs);
            }
        }
        else if(rhs.numerator < 0 || rhs.denominator <0)
        {
            rhs.setNumerator(Math.abs(rhs.numerator));
            rhs.setDenominator(Math.abs(rhs.denominator));
            if (rhs.numerator % 2 == 0 && rhs.denominator % 2 == 0) {
                rhs.numerator = rhs.numerator / 2;
                rhs.denominator = rhs.denominator / 2;
                simplify(rhs);
            } else if (rhs.numerator % 3 == 0 && rhs.denominator % 3 == 0) {
                rhs.numerator = rhs.numerator / 3;
                rhs.denominator = rhs.denominator / 3;
                simplify(rhs);
            } else if (rhs.numerator % 5 == 0 && rhs.denominator % 5 == 0) {
                rhs.numerator = rhs.numerator / 5;
                rhs.denominator = rhs.denominator / 5;
                simplify(rhs);
            } else if (rhs.numerator % 7 == 0 && rhs.denominator % 7 == 0) {
                rhs.numerator = rhs.numerator / 7;
                rhs.denominator = rhs.denominator / 7;
                simplify(rhs);
            }
            rhs.setNumerator(-rhs.numerator);
        }
        return rhs;
    }

    private void GCD(RationalNumber rhs1, RationalNumber rhs)
    {
//        rhs1.backToFraction();
//        rhs.backToFraction();
        if(rhs1.denominator == rhs.denominator)
        {
            return;
        }
        else
        {
            int temp = rhs.denominator;
            rhs.denominator *= rhs1.denominator;
            rhs.numerator *= rhs1.denominator;
            rhs1.denominator *= temp;
            rhs1.numerator *= temp;
            return;
        }
    }

//    public RationalNumber backToFraction()
//    {
//        if(this.constant > 0)
//        {
//            this.setNumerator(this.numerator + (this.constant *this.denominator));
//            this.constant = 0;
//            return this;
//        }
//        return this;
//    }
}
