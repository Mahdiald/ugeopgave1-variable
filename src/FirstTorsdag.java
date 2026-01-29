void main(){
// opgave 1
    double a = 25.50;
    double b = 15;
    double c = 30;
    double subtotal = a + b + c;
    double taxRate = 25;
    double withTax = (subtotal * taxRate/100);
    System.out.println(subtotal);
    System.out.println(subtotal+withTax);

//opgave 2
    double food = 450;
    double drink = 120;
    double tip = 50;
    int pep = 4;
    double total = food+drink+tip;
    double prPerson = total/pep;
    System.out.println(prPerson);

//opgave 3
    double OGprice = 300;
    double disc = 20;
    double off = OGprice-(OGprice*disc/100);
    double tax = 25;
    double FinalPrice = off+(off * tax/100);
    System.out.println(OGprice);
    System.out.println(off);
    System.out.println(FinalPrice);
}
