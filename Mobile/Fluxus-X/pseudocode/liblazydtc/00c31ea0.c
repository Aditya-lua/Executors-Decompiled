/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c31ea0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

char * basename(char *__filename)

{
  char *pcVar1;
  
  pcVar1 = basename(__filename);
  return pcVar1;
}

