package es.medac.tdd.example;

public class Calc {
    int a;
    int b;

    public Calc(int i, int i1) {
        this.a=i;
        this.b=i1;
    }



    public Integer restar() {
        return this.a-this.b;
    }

    public Integer mult() {
        return this.a*this.b;
    }

    public Integer div() {
        return this.a/this.b;
    }

    public Integer sumar() {
        return this.a+this.b;
    }
}
