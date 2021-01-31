package eu.senla.task;

public class Main {

    public static void main(String[] args) {
	int counter = 0;
// 1)
	while (counter <10){
	    Cat cat = new Cat();
        System.out.println(cat.getNameCat() +" age "+ cat.getAgeCat());
           counter ++;
            }

	counter = 0;
	//2)
	for (counter = 0; counter <10 ; counter++){
	    Cat cat = new Cat();
	    cat.setNameCat("Mars"+counter);
	    cat.setAgeCat(counter + 3);
        System.out.println(counter+1 + ") "+ cat.getNameCat()+" age "+cat.getAgeCat());
    }
        counter = 0;
//3)
        do {
            Cat cat = new Cat("Vasya" , 4);
            System.out.println(counter+1 + ") "+ cat.getNameCat()+" age "+cat.getAgeCat());

         counter ++;
        }while (counter <10);
//4
        counter = 0;
        Cat[] cats = new Cat[5];
        Cat cat0 = new Cat("iris",3);
        cats[0] = cat0;
        Cat cat1 = new Cat("riba",2);
        cats[1] =cat1;
        Cat cat2 = new Cat("Lev",7);
        cats[2] = cat2;
        Cat cat3 = new Cat("bars", 4);
        cats[3] = cat3;
        Cat cat4 = new Cat("barson", 4);
        cats[4] = cat4;

      for (Cat cat : cats) {
            System.out.println(counter+1 + ") "+ cat.getNameCat()+" age "+cat.getAgeCat());
            counter++;
        }

}
}