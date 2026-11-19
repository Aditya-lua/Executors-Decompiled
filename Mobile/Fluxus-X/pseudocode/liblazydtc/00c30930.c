/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c30930
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * strpbrk(char *__s,char *__accept)

{
  char *pcVar1;
  
  pcVar1 = strpbrk(__s,__accept);
  return pcVar1;
}

