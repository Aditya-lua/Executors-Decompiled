/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43920
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

longlong strtoll(char *__nptr,char **__endptr,int __base)

{
  longlong lVar1;
  
  lVar1 = strtoll(__nptr,__endptr,__base);
  return lVar1;
}

