/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009d1428
 */

undefined8 FUN_009d1428(long param_1)

{
  if (*(int *)(param_1 + 0x38) != 0) {
    *(undefined4 *)(param_1 + 0xb60) = 0;
    CRYPTO_free(*(void **)(param_1 + 0xa58));
    *(undefined8 *)(param_1 + 0xa58) = 0;
  }
  return 1;
}

