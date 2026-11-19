/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43830
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

long wcstol(wchar_t *__nptr,wchar_t **__endptr,int __base)

{
  long lVar1;
  
  lVar1 = wcstol(__nptr,__endptr,__base);
  return lVar1;
}

