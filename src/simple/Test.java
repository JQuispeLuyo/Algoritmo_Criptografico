package simple;

public class Test {

   public static void main(String[] args) {

      /*
       * Solo texto sin numero ni espacios
       * Separacion con CamelUpperCase
       * */
      String text = "TextoNormal";

      /*
       * Saltos entre palabras: cesar
       * */
      int codigo = 1;

      /*
       * Permutacion: matriz de 3 columnas
       * */
      int[] p = {2, 0, 1};

      String en = Encrypt.encrypt(codigo, p, text);

      System.out.println("=======>>>> En: " + en);

      String de = Decrypt.decrypt(codigo, p, en);

      System.out.println("=======>>>> De: " + de);

   }

}
