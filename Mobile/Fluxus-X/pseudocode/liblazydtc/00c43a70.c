/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43a70
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t mbsnrtowcs(wchar_t *__dst,char **__src,size_t __nmc,size_t __len,mbstate_t *__ps)

{
  size_t sVar1;
  
  sVar1 = mbsnrtowcs(__dst,__src,__nmc,__len,__ps);
  return sVar1;
}

