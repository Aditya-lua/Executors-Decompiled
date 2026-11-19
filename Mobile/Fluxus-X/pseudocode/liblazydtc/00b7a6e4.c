/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a6e4
 */

void mbedtls_nist_kw_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_cipher_free(param_1);
  mbedtls_platform_zeroize(param_1,0x60);
  return;
}

