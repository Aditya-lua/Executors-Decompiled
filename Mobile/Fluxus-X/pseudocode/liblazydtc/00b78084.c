/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78084
 */

void mbedtls_gcm_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_cipher_free(param_1);
  mbedtls_platform_zeroize(param_1,0x1a8);
  return;
}

