/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c38800
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int ferror(FILE *__stream)

{
  int iVar1;
  
  iVar1 = ferror(__stream);
  return iVar1;
}

