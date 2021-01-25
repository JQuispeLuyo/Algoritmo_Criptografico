package simple;

public class Encrypt {

   public static String encrypt(int codigoInit, int[] columnInit, String textoInit) {

      String texto = textoInit;
      int codigo = codigoInit;
      int[] p = columnInit;

      // Cesar
      String cifradoCesar =   Cesar.cifrar(texto, codigo);
      System.out.println("Cid: Cesar: "+ cifradoCesar);

      // Base 64
      String cifradoBase =   Base.cifrar(cifradoCesar);
      System.out.println("Cid: Base: "+ cifradoBase);

      // Transposición de columnas simples
      Column column = new Column(p);
      String cifradoColumn = column.encrypt(cifradoBase.getBytes());
      System.out.println("Cid: Column: " + cifradoColumn);

      return cifradoColumn;

   }
}
