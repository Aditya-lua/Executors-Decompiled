/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6716c
 */

undefined8 ossl_ccm_generic_setaad(long param_1)

{
  CRYPTO_ccm128_aad(param_1 + 0x50);
  return 1;
}

