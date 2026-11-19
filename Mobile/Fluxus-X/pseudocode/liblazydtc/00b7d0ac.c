/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7d0ac
 */

void mbedtls_asn1_free_named_data(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  free(*(void **)(param_1 + 0x10));
  free(*(void **)(param_1 + 0x28));
  mbedtls_platform_zeroize(param_1,0x40);
  return;
}

