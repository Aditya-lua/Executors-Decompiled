/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c309c0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t strftime(char *__s,size_t __maxsize,char *__format,tm *__tp)

{
  size_t sVar1;
  
  sVar1 = strftime(__s,__maxsize,__format,__tp);
  return sVar1;
}

