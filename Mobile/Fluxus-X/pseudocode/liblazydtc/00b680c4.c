/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b680c4
 */

bool ossl_gcm_aad_update(long param_1)

{
  int iVar1;
  
  iVar1 = CRYPTO_gcm128_aad(param_1 + 0xf8);
  return iVar1 == 0;
}

