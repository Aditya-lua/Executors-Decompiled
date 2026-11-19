/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c618
 */

void mbedtls_chacha20_init(long param_1)

{
  mbedtls_platform_zeroize(param_1,0x40);
  mbedtls_platform_zeroize(param_1 + 0x40,0x40);
  *(undefined8 *)(param_1 + 0x80) = 0x40;
  return;
}

