import java.util.ArrayList;
import java.util.List;

public class Uzdavinys3 {

    private static Color spalvotosFiguros;

    public static void main(String[] args) {
        List<Color> spalvotosFiguros = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            spalvotosFiguros.add(new Circle(i + 1, (int) (Math.random() * 255)));
            spalvotosFiguros.add(new Square(i + 1, (int) (Math.random() * 255)));
        }


       List<Result> results; //////
       // results = colors(spalvotosFiguros);
       //  for (Result r : results) {
       //     System.out.println(r.getColor() + " " + r.getCount());
       // }
    }

    // public static List<Result> colors(List<Color> list) {  ------
    // grazinama turi buti Result tipo listas
    // metodo colors  argumentas yra  "Color tipo listas vardu list)
    // o 17 eiluteje kvieciant metoda kaip argumentas paduodamas listas spalvotosFiguros
    // spalvotosFiguros savyje turi Circle ir Square
    // kurios  "public class Circle extends Figure2D implements Color  {"
    // Color yra interfeisas, todel negalima jame rasyti metodu
    // todel metoda getColor aprasiau Circle klaseje ?????
    // bet spalvotosFiguros turi tik Color klase

       public static void colors(List<Color> list) {
       //    public static List<Result> colors(List<Color> list) {
          // Result x = spalvotosFiguros;

           System.out.println(spalvotosFiguros.color); ;

        //   return 0;

    }
    /*
        // susikuriam spalvu reiksmiu masyva
        Result[] masyvas = new Result[256];
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i].count = 0;
            masyvas[i].color = i + 1;
        }

        // einam per rezultatu lista ir tikrinam spalvas, pridedam vieneta prie rasto kiekio
        System.out.println(masyvas[1]);
        Result x = null;
        for (int i = 0; i< colorList.size(); i++) {
         //   System.out.println(spalvos.color);
            x = new Result();
           // x.color = colorList.getClass();
           // x.count = 1;
            masyvas[i].count = masyvas[i].count++;
            System.out.println("Spalva " + i + " kiekis " + masyvas[i]);
         //   System.out.println(colorList.getClass() + " " + x.getCount());
          //  System.out.println(masyvas[i].count);
        }
        //  List<Result> spalvos;
        return masyvas[1];
    }
    public int getColor() {
        int color = 0;
        return color;
    }

     */
}
