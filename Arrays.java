import java.util.*; //importamos libreria con instrucciones utiles

class Main {
  public static void main(String[] args) {

    int[] nprimos = {2,3,5,7,11,13};

    System.out.println(nprimos);
    System.out.println(nprimos[2]);

    List list = new ArrayList();
    list.add(2);
    list.add(3);
    list.add(5);
    //admiten strings sin problemas

    System.out.println(list.get(1));
    list.remove(1);
    System.out.println("Removiendo el dato en la posicion 1: "+ list.get(1));
    System.out.println("Agregamos nuevamente el dato e imprimimos toda la lista");
    list.add(3);
    System.out.println(list.toString());

  }
}
