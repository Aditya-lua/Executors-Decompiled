/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43840
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int swprintf(wchar_t *__s,size_t __n,wchar_t *__format,...)

{
  int iVar1;
  
  iVar1 = swprintf(__s,__n,__format);
  return iVar1;
}

