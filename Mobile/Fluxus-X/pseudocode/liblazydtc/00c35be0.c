/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c35be0
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

X509_VERIFY_PARAM * X509_VERIFY_PARAM_new(void)

{
  X509_VERIFY_PARAM *pXVar1;
  
  pXVar1 = X509_VERIFY_PARAM_new();
  return pXVar1;
}

