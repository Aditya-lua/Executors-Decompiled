/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43b30
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

wint_t towlower_l(wint_t __wc,__locale_t __locale)

{
  wint_t wVar1;
  
  wVar1 = towlower_l(__wc,__locale);
  return wVar1;
}

