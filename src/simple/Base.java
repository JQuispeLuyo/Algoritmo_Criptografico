package simple;

import java.util.Base64;

public class Base {

   public static String cifrar (String entradaOriginal){
      return Base64.getEncoder().encodeToString(entradaOriginal.getBytes());
   }

   public static String descifrar (String cadenaCodificada){
      byte[] bytesDecodificados = Base64.getDecoder().decode(cadenaCodificada);
      return new String(bytesDecodificados);
   }

}
