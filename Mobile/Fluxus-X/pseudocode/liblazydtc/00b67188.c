/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b67188
 */

bool ossl_ccm_generic_gettag(long param_1)

{
  long lVar1;
  
  lVar1 = CRYPTO_ccm128_tag(param_1 + 0x50);
  return lVar1 != 0;
}

