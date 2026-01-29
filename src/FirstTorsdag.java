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

}