/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13f40
 */

void SCT_set0_extensions(long param_1,undefined8 param_2,undefined8 param_3)

{
  CRYPTO_free(*(void **)(param_1 + 0x30));
  *(undefined8 *)(param_1 + 0x30) = param_2;
  *(undefined8 *)(param_1 + 0x38) = param_3;
  *(undefined4 *)(param_1 + 0x60) = 0;
  return;
}

