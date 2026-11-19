/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac2cbc
 */

long ossl_pkcs7_get0_ctx(long param_1)

{
  long lVar1;
  
  lVar1 = 0;
  if (param_1 != 0) {
    lVar1 = param_1 + 0x28;
  }
  return lVar1;
}

