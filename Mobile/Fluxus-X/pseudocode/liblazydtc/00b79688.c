/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b79688
 */

void mbedtls_md5_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_platform_zeroize(param_1,0x58);
  return;
}

