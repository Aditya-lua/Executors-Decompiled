/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43a00
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int iswupper_l(wint_t __wc,__locale_t __locale)

{
  int iVar1;
  
  iVar1 = iswupper_l(__wc,__locale);
  return iVar1;
}

