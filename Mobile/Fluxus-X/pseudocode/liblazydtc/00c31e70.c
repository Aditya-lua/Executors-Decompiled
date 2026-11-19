/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31e70
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int fseeko(FILE *__stream,__off_t __off,int __whence)

{
  int iVar1;
  
  iVar1 = fseeko(__stream,__off,__whence);
  return iVar1;
}

