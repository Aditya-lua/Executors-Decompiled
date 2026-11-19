/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c30460
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int rmdir(char *__path)

{
  int iVar1;
  
  iVar1 = rmdir(__path);
  return iVar1;
}

