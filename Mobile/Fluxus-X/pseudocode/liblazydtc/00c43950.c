/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43950
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ulonglong strtoull_l(char *__nptr,char **__endptr,int __base,__locale_t __loc)

{
  ulonglong uVar1;
  
  uVar1 = strtoull_l(__nptr,__endptr,__base,__loc);
  return uVar1;
}

