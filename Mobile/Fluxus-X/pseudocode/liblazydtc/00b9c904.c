/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c904
 */

void mbedtls_hmac_drbg_free(long param_1)

{
  if (param_1 != 0) {
    mbedtls_md_free(param_1);
    mbedtls_platform_zeroize(param_1,0x80);
    *(undefined4 *)(param_1 + 0x6c) = 10000;
  }
  return;
}

