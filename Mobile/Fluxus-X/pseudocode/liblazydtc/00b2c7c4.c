/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2c7c4
 */

void ossl_tdes_freectx(undefined8 param_1)

{
  ossl_cipher_generic_reset_ctx();
  CRYPTO_clear_free(param_1,0x248,"providers/implementations/ciphers/cipher_tdes_common.c",0x3d);
  return;
}

