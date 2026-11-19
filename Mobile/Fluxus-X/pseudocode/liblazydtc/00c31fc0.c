/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31fc0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int pipe(int *__pipedes)

{
  int iVar1;
  
  iVar1 = pipe(__pipedes);
  return iVar1;
}

