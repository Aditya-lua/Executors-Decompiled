/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31ba0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * strtok_r(char *__s,char *__delim,char **__save_ptr)

{
  char *pcVar1;
  
  pcVar1 = strtok_r(__s,__delim,__save_ptr);
  return pcVar1;
}

