/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43b10
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

wint_t fputwc(wchar_t __wc,__FILE *__stream)

{
  wint_t wVar1;
  
  wVar1 = fputwc(__wc,__stream);
  return wVar1;
}

