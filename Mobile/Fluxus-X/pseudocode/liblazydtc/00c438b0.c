/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c438b0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int wmemcmp(wchar_t *__s1,wchar_t *__s2,size_t __n)

{
  int iVar1;
  
  iVar1 = wmemcmp(__s1,__s2,__n);
  return iVar1;
}

