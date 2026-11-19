/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43b60
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t strftime_l(char *__s,size_t __maxsize,char *__format,tm *__tp,__locale_t __loc)

{
  size_t sVar1;
  
  sVar1 = strftime_l(__s,__maxsize,__format,__tp,__loc);
  return sVar1;
}

