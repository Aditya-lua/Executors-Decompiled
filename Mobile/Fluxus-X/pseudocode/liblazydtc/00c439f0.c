/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c439f0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

ulong wcstoul(wchar_t *__nptr,wchar_t **__endptr,int __base)

{
  ulong uVar1;
  
  uVar1 = wcstoul(__nptr,__endptr,__base);
  return uVar1;
}

