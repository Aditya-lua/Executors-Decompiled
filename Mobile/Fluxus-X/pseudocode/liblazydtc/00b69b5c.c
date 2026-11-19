/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b69b5c
 */

void mbedtls_cipher_free(long *param_1)

{
  if (param_1 == (long *)0x0) {
    return;
  }
  if (param_1[0xb] != 0) {
    mbedtls_zeroize_and_free(param_1[0xb],0x28);
  }
  if (param_1[10] != 0) {
    (**(code **)((&mbedtls_cipher_base_lookup_table)[*(uint *)(*param_1 + 8) >> 0x1a & 0x1f] + 0x58)
    )();
  }
  mbedtls_platform_zeroize(param_1,0x60);
  return;
}

