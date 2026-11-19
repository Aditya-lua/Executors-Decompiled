/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6714c
 */

bool ossl_ccm_generic_setiv(long param_1)

{
  int iVar1;
  
  iVar1 = CRYPTO_ccm128_setiv(param_1 + 0x50);
  return iVar1 == 0;
}

