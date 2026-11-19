/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d19b0
 */

undefined8 FUN_009d19b0(long param_1)

{
  CRYPTO_free(*(void **)(param_1 + 0x488));
  *(undefined8 *)(param_1 + 0x490) = 0;
  *(undefined8 *)(param_1 + 0x488) = 0;
  if (*(int *)(param_1 + 0x38) != 0) {
    CRYPTO_free(*(void **)(param_1 + 0x498));
    *(undefined8 *)(param_1 + 0x4a0) = 0;
    *(undefined8 *)(param_1 + 0x498) = 0;
  }
  return 1;
}

