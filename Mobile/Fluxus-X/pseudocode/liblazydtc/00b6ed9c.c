/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ed9c
 */

undefined8
mbedtls_aes_crypt_ecb(undefined8 param_1,uint param_2,undefined8 param_3,undefined8 param_4)

{
  if (1 < param_2) {
    return 0xffffffdf;
  }
  if (param_2 == 0) {
    mbedtls_internal_aes_decrypt(param_1,param_3,param_4);
  }
  else {
    mbedtls_internal_aes_encrypt(param_1,param_3,param_4);
  }
  return 0;
}

