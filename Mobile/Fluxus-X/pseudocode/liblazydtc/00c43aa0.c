/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43aa0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int strcoll_l(char *__s1,char *__s2,__locale_t __l)

{
  int iVar1;
  
  iVar1 = strcoll_l(__s1,__s2,__l);
  return iVar1;
}

