/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c30990
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * strncat(char *__dest,char *__src,size_t __n)

{
  char *pcVar1;
  
  pcVar1 = strncat(__dest,__src,__n);
  return pcVar1;
}

