package lt.uzdavinys3n;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Uzdavinys3 {
    public static void main(String[] args) {
       List<Color> spalvotosFiguros = new ArrayList<>();
       System.out.println("spalvotosFiguros.getClass().getSimpleName())  duoda: " +  spalvotosFiguros.getClass().getSimpleName());
        for (int i = 0; i < 3; i++) {
            spalvotosFiguros.add(new Circle(i + 1, (int) (Math.random() * 255)));
            spalvotosFiguros.add(new Square(i + 1, (int) (Math.random() * 255)));
         //   System.out.println("is karto po idejimo spalvotosFiguros: " + spalvotosFiguros.getColor + " " + spalvotosFiguros);
        }
        for (Color spalvotaFigura : spalvotosFiguros) {
            System.out.println("spalvotaFigura.getClass().getSimpleName() duoda: " + spalvotaFigura.getClass().getSimpleName() + " " +
                    spalvotaFigura.getColor());
        }

        int[] spalvos = kiekYraSpalvuSuMasyvu(spalvotosFiguros);
        for (int i = 0; i < spalvos.length; i++) {
            if (spalvos[i] > 0) {
                System.out.println("spalvos " + i + " figuru yra " + spalvos[i]);
            }
        }

        System.out.println("------------");
        List<ColorCount> spalvos2 = kiekYraSpalvuSuListu(spalvotosFiguros);
        for (int i = 0; i < spalvos2.size(); i++) {
            ColorCount colorCount = spalvos2.get(i);
            System.out.println("spalvos " + colorCount.getColor() + " figuru yra " + colorCount.getCount());
        }
    }
    static int[] kiekYraSpalvuSuMasyvu(List<Color> list) {
        int[] result = new int[256];
        for (Color c : list) {
            result[c.getColor()]++;
        }
        return result;
    }
    static List<ColorCount> kiekYraSpalvuSuListu(List<Color> list) {
        List<ColorCount> result = new LinkedList<>();
        for (Color c : list) {
            // 1. paziureti ar nera tokios spalvos 'result' liste
            ColorCount colorCount = null;
            for (ColorCount cc : result) {
                if (cc.getColor() == c.getColor()) {
                    colorCount = cc;
                    break;
                }
            }
            //   - nera
            if (colorCount == null) {
                //      2. sukuriam nauja 'ColorCount' elementa su spalva 'c' ir count=1
                colorCount = new ColorCount();
                colorCount.setColor(c.getColor());
                colorCount.setCount(1);
                //      ir idedame ji i 'result' lista
                result.add(colorCount);
            } else {
                //   - yra - 'colorCount'
                //      3. colorCount elemento padidiname 'count' lauko reiksme vienetu
                colorCount.setCount(colorCount.getCount() + 1);
            }
        }
        return result;
    }
}
class ColorCount {
    private int color;
    private int count;
    public int getColor() {
        return color;
    }
    public void setColor(int color) {
        this.color = color;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}



/*
package lt.uzdavinys3n;

import java.util.ArrayList;
import java.util.List;

    public class Uzdavinys3 {

        public static void main(String[] args) {
            List<Color> spalvotosFiguros = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                spalvotosFiguros.add(new Circle(i+1, (int)(Math.random() * 255)));
                spalvotosFiguros.add(new Square(i+1, (int)(Math.random() * 255)));
            }

         //   Color spalvotaFigura = spalvotosFiguros.get(i);

            System.out.println(spalvotosFiguros);
            List<Result> results = colors(spalvotosFiguros);
            System.out.println(spalvotosFiguros.getClass().getSimpleName());
            for (Result r : results) {
                System.out.println(r.getColor() + " " + r.getCount());
            }
        }

        static int  kiekYra <list ? extends Figure>, int color) {
            int counter;

            for (Figure r: list) {
    if (r.getColor() == color) {
        counter = counter + 1;

    }
            }


            static int[] kiekYra(List<Color> list) {
                int[] result = new int[256];
                for (int i = 0; )


            }


        }
        public static List<Result> colors(List<Color> list) {
            //TODO
            // 1.                  A a = new B(); B extends A
            // 2.          List<Result> a = new ArrayList<Color>();

         //   list = setColor(list);
         List<Result> ccc = new ArrayList<Result>(256);
            //Result rrr = new Result();
            for (Color r : list) {
                ColorCount colorCount = rasti(list, c);

                if ()
                int x = r.getColor();

                System.out.println(x);
                System.out.println(r);
            }
//Result x = getColor(rrr)

        //   System.out.println(rrr.getCount());
            System.out.println(ccc);

            return ccc;
        }
    }

    class Result {
        private int color;
        private int count;

        public int getColor() {
            return color;
        }

        public void setColor(int color) {
            this.color = color;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }




}

// Circle c = (Circle)o; ---- galima sukurti nauja kintamaji su tam tikra klase (jei zinome kad tas objektas yra
// tos klases), kad galetume naudoti  tos klases metodus


 */
