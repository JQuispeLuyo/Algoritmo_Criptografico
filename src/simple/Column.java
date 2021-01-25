package simple;

public class Column {

   private int[] p;

   public Column(int[] pattern){
      int[] a = new int[pattern.length];

      int i = 0;
      boolean b = true;

      while ((i < pattern.length) && b) {
         if ((pattern[i] < pattern.length) && (pattern[i] >= 0)) a[pattern[i]] = pattern[i];
         else b = false;
         i++;
      }

      i = 0;

      while ((i < pattern.length) && b) {
         b = (a[i] == i);
         i++;
      }

      if (!b) throw new IllegalArgumentException();

      p = pattern;
   }

   public String encrypt(byte[] m) {
      int l = m.length;
      int n = p.length;

      byte[] c = new byte[l];

      int k = 0;

      for (int i = 0; i < n; i++)
         for (int j = p[i]; j < l; j += n) c[k++] = m[j];

      return new String(c);
   }

   public String decrypt(byte[] c) {
      int l = c.length;
      int n = p.length;

      byte[] m = new byte[l];

      int k = 0;

      for (int i = 0; i < n; i++)
         for (int j = p[i]; j < l; j += n) m[j] = c[k++];

      return new String(m);
   }

}
