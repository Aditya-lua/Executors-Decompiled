/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43810
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

float wcstof(wchar_t *__nptr,wchar_t **__endptr)

{
  float fVar1;
  
  fVar1 = wcstof(__nptr,__endptr);
  return fVar1;
}

