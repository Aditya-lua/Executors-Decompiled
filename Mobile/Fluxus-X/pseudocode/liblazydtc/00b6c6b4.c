/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c6b4
 */

undefined8 mbedtls_chacha20_starts(long param_1,undefined4 *param_2,undefined4 param_3)

{
  *(undefined4 *)(param_1 + 0x30) = param_3;
  *(undefined4 *)(param_1 + 0x34) = *param_2;
  *(undefined4 *)(param_1 + 0x38) = param_2[1];
  *(undefined4 *)(param_1 + 0x3c) = param_2[2];
  mbedtls_platform_zeroize(param_1 + 0x40,0x40);
  *(undefined8 *)(param_1 + 0x80) = 0x40;
  return 0;
}

