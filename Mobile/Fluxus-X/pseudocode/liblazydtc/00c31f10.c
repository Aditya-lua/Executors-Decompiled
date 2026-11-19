/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31f10
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fnmatch(char *__pattern,char *__name,int __flags)

{
  int iVar1;
  
  iVar1 = fnmatch(__pattern,__name,__flags);
  return iVar1;
}

