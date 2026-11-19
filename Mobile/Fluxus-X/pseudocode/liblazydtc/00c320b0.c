/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c320b0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int gethostname(char *__name,size_t __len)

{
  int iVar1;
  
  iVar1 = gethostname(__name,__len);
  return iVar1;
}

