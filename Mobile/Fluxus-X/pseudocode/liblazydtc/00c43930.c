/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43930
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong strtoll_l(char *__nptr,char **__endptr,int __base,__locale_t __loc)

{
  longlong lVar1;
  
  lVar1 = strtoll_l(__nptr,__endptr,__base,__loc);
  return lVar1;
}

