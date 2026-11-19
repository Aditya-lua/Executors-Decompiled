/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43a50
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

float strtof(char *__nptr,char **__endptr)

{
  float fVar1;
  
  fVar1 = strtof(__nptr,__endptr);
  return fVar1;
}

