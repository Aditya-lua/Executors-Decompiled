/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43a30
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

double strtold_l(char *__nptr,char **__endptr,__locale_t __loc)

{
  double dVar1;
  
  dVar1 = strtold_l(__nptr,__endptr,__loc);
  return dVar1;
}

