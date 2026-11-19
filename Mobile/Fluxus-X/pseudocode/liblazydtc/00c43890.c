/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43890
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

__locale_t newlocale(int __category_mask,char *__locale,__locale_t __base)

{
  __locale_t p_Var1;
  
  p_Var1 = newlocale(__category_mask,__locale,__base);
  return p_Var1;
}

