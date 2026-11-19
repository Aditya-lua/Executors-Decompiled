/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43af0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t mbsrtowcs(wchar_t *__dst,char **__src,size_t __len,mbstate_t *__ps)

{
  size_t sVar1;
  
  sVar1 = mbsrtowcs(__dst,__src,__len,__ps);
  return sVar1;
}

