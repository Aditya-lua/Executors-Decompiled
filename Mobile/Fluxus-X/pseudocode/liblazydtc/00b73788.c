/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b73788
 */

void mbedtls_ctr_drbg_free(long param_1)

{
  if (param_1 != 0) {
    mbedtls_aes_free(param_1 + 0x28);
    mbedtls_platform_zeroize(param_1,0x158);
    *(undefined4 *)(param_1 + 0x20) = 10000;
    *(undefined4 *)(param_1 + 0x10) = 0xffffffff;
  }
  return;
}

