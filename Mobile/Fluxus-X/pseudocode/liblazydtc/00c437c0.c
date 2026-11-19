/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c437c0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

double wcstod(wchar_t *__nptr,wchar_t **__endptr)

{
  double dVar1;
  
  dVar1 = wcstod(__nptr,__endptr);
  return dVar1;
}

