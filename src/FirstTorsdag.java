void main(){
// opgave 1
    double a = 25.50;
    double b = 15;
    double c = 30;
    double subtotal = a + b + c;
    double taxRate = 25;
    double withTax = (subtotal * taxRate/100);
    System.out.println("Opgave 1");
    System.out.println(subtotal);
    System.out.println(subtotal+withTax);

//opgave 2
    double food = 450;
    double drink = 120;
    double tip = 50;
    int pep = 4;
    double total = food+drink+tip;
    double prPerson = total/pep;
    System.out.println("opgave 2");
    System.out.println(prPerson);

//opgave 3
    double OGprice = 300;
    double disc = 20;
    double off = OGprice-(OGprice*disc/100);
    double tax = 25;
    double FinalPrice = off+(off * tax/100);
    System.out.println("Opgave 3");
    System.out.println(OGprice);
    System.out.println(off);
    System.out.println(FinalPrice);

//opgave 4
    int guest = 15;
    int cupcake = 40;
    int CCprG = cupcake/guest;
    int leftovers = cupcake % guest;
    System.out.println("opgave 4");
    System.out.println("Each guest gets " + CCprG + " cupcakes");
    System.out.println(leftovers + " cupcakes left");

//opgave 5
    StringBuilder sb = new StringBuilder();
            String name = "Anna";
            int age = 25;
            sb.append("Hello, ");
            sb.append(name);
            sb.append("! ");
            sb.append("You are ");
            sb.append(age);
            sb.append(" years old");
    System.out.println("opgave 5");
    System.out.println(sb.toString());

//opgave 6
    System.out.println("opgave 6");
    int score = 100;
    System.out.println(score);
    score += 50;
    System.out.println(score);
    score += 25;
    System.out.println(score);

//opgave 7
    System.out.println("opgave 7");
    int health = 100;
    System.out.println(health);
    health -= 15;
    System.out.println(health);
    health -= 20;
    System.out.println(health);

//opgave 8
    double price = 50;
    System.out.println(price);
    price *= 2;
    System.out.println(price);

//opgave 9
    System.out.println("opgave 9");
    int counter = 10;
    System.out.println(counter);
    counter ++;
    System.out.println(counter);
    counter --;
    System.out.println(counter);

//opgave 10
    System.out.println("opgave 10");
    double number = 10;
    System.out.println(number);
    number += 5;
    System.out.println(number);
    number -= 3;
    System.out.println(number);
    number ++;
    System.out.println(number);
    number --;
    System.out.println(number);
}
