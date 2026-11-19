/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43bc0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

int mbtowc(wchar_t *__pwc,char *__s,size_t __n)

{
  int iVar1;
  
  iVar1 = mbtowc(__pwc,__s,__n);
  return iVar1;
}

