/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c30c20
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int getc(FILE *__stream)

{
  int iVar1;
  
  iVar1 = getc(__stream);
  return iVar1;
}

