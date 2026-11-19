/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c439c0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t mbrlen(char *__s,size_t __n,mbstate_t *__ps)

{
  size_t sVar1;
  
  sVar1 = mbrlen(__s,__n,__ps);
  return sVar1;
}

