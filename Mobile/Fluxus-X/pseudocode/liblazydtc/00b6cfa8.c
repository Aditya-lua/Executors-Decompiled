/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6cfa8
 */

void mbedtls_chachapoly_free(long param_1)

{
  if (param_1 != 0) {
    mbedtls_chacha20_free(param_1);
    mbedtls_poly1305_free(param_1 + 0x88);
    *(undefined8 *)(param_1 + 0xd8) = 0;
    *(undefined8 *)(param_1 + 0xe0) = 0;
    *(undefined8 *)(param_1 + 0xe8) = 0;
  }
  return;
}

