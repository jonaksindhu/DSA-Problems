public class reversenumber {

    public static int reversenumber(int number)
    {
          char car[] =String.valueOf(number).toCharArray();

          int i = 0;
          int j = car.length - 1;

          while (i < j) {
            char temp = car[i];
            car[i] = car[j];
            car[j] = temp;
            i++;
            j--;
          }

          return Integer.parseInt(String.valueOf(car));


    }

    public static void main(String[] args) {
        System.out.println(reversenumber(51));
    }

    
}
