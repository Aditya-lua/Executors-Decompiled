/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c3e810
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int madvise(void *__addr,size_t __len,int __advice)

{
  int iVar1;
  
  iVar1 = madvise(__addr,__len,__advice);
  return iVar1;
}

