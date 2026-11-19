/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43be0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t wcsnrtombs(char *__dst,wchar_t **__src,size_t __nwc,size_t __len,mbstate_t *__ps)

{
  size_t sVar1;
  
  sVar1 = wcsnrtombs(__dst,__src,__nwc,__len,__ps);
  return sVar1;
}

