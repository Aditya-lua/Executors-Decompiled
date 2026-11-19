/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c439e0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int wcscoll_l(wchar_t *__s1,wchar_t *__s2,__locale_t __loc)

{
  int iVar1;
  
  iVar1 = wcscoll_l(__s1,__s2,__loc);
  return iVar1;
}

