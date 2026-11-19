/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c43a60
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

wchar_t * wmemchr(wchar_t *__s,wchar_t __c,size_t __n)

{
  wchar_t *pwVar1;
  
  pwVar1 = wmemchr(__s,__c,__n);
  return pwVar1;
}

