/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43b80
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

size_t wcrtomb(char *__s,wchar_t __wc,mbstate_t *__ps)

{
  size_t sVar1;
  
  sVar1 = wcrtomb(__s,__wc,__ps);
  return sVar1;
}

