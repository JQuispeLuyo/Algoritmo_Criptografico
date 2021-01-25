package simple;

public class Decrypt {

   public static String decrypt(int codigoInit, int[] columnInit, String textoInit) {
      String texto = textoInit;
      int codigo = codigoInit;
      int[] p = columnInit;

      Column column = new Column(p);
      String descifradoColumn = column.decrypt(texto.getBytes());
      System.out.println("Des: Column: " + descifradoColumn);

      String descifradoBase =   Base.descifrar(descifradoColumn);
      System.out.println("Des: Base: "+ descifradoBase);

      String descifradoCesar =   Cesar.descifrar(descifradoBase, codigo);
      System.out.println("Des: Cesar: "+ descifradoCesar);

      return descifradoCesar;
   }

}
