

public class ComplexNumbers {

    double r;
    double i;


    public ComplexNumbers() // sets r = 0, i = 0
    {
        this.r = 0;
        this.i =0;
    }
    public ComplexNumbers(double _r, double _i) // sets r = _r, i = _i
    {
        this.r = _r;
        this.i = _i;
    }
    public ComplexNumbers(ComplexNumbers rhs) // sets r = rhs.r, i = rhs.i
    {
        this.r = rhs.r;
        this.i = rhs.i;
    }
    public void setR(double r) // sets this.r = r
    {
        this.r = r;
    }
    public void setI(double i) // sets this.i = i
    {
        this.i = i;
    }
    public double getR() // returns r
    {
        return this.r;
    }
    public double getI() // returns i
    {
        return this.i;
    }
    public String toString() // returns r and i in form 14.5 – 13.2i
    {
        if( this.i < 0)
        {
            return this.r + " - " + Math.abs(this.i) + "i";
        }
        else
        {
            return this.r + " + " + this.i + "i";
        }
    }
    public ComplexNumbers add(ComplexNumbers rhs) // returns this + rhs
    {
         this.r = (this.r + rhs.r);
         this.i = (this.i + rhs.i);
         return this;
    }
    public ComplexNumbers sub(ComplexNumbers rhs) // returns this - rhs
    {
        this.r -= rhs.r;
        this.i -= rhs.i;
        return this;
    }
    public ComplexNumbers mult(ComplexNumbers rhs) // returns this * rhs
    {
        double r = this.r;
        double i = this.i;
        this.r = (r * rhs.r) - (i * rhs.i);
        this.i = (rhs.i * r) + (i * rhs.r);
        return this;
    }
    public ComplexNumbers div(ComplexNumbers rhs) throws ArithmeticException
    {
        double r = this.r;
        double i = this.i;
        if (Math.abs(rhs.r) < 0.00001 && Math.abs(rhs.i) < 0.00001)
        {
            this.r = 0;
            this.i = 0;
            return this;
        }
        else {
            this.r = ((r * rhs.r) + (i * rhs.i)) / (Math.pow(rhs.r,2) + Math.pow(rhs.i,2));
            this.i = ((i * rhs.r) - (r * rhs.i)) / (Math.pow(rhs.r,2) + Math.pow(rhs.i,2));
            return this;
        }
    }
    // returns this / rhs
// throws exception if magnitude(rhs) == 0
    public double mag () // returns the magnitude of this
    {
        return Math.sqrt(Math.pow(this.r, 2) + Math.pow(this.i,2));
    }
    public ComplexNumbers conj () // returns the conjugate of this
    {
        this.i = -this.i;
        return this;
    }
    public ComplexNumbers sqrt () // returns the square root of this
    {
        double r = this.r;
        double i = this.i;
        if( Math.abs(this.i) > 0.00001)
        {

            this.r = Math.sqrt((r + Math.sqrt(Math.pow(r, 2) + Math.pow(i, 2))) / 2);
            this.i = Math.sqrt(((-r) + Math.sqrt(Math.pow(r, 2) + Math.pow(i, 2))) / 2);
            return this;
        }
        else if(Math.abs(this.r) < 0)
        {
            this.i = Math.sqrt((-this.r));
            this.r =0;
            return this;
        }
        else
        {
            this.r = Math.sqrt(this.r);
            this.i = 0;
            return this;
        }
    }
    public boolean equals (ComplexNumbers rhs) // returns true if this.r == rhs.r
    {
        if(Math.abs(this.r - rhs.r) < 0.00001 && Math.abs(this.i - rhs.i) < 0.0001)
        {
            return true;
        }
        return false;
    }
    // this.i == rhs.i, false otherwise
}
