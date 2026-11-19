/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31d60
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fileno(FILE *__stream)

{
  int iVar1;
  
  iVar1 = fileno(__stream);
  return iVar1;
}

