/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43970
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong wcstoll(wchar_t *__nptr,wchar_t **__endptr,int __base)

{
  longlong lVar1;
  
  lVar1 = wcstoll(__nptr,__endptr,__base);
  return lVar1;
}

