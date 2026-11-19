/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c437a0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t wcsxfrm_l(wchar_t *__s1,wchar_t *__s2,size_t __n,__locale_t __loc)

{
  size_t sVar1;
  
  sVar1 = wcsxfrm_l(__s1,__s2,__n,__loc);
  return sVar1;
}

