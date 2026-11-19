/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4e284
 */

bool FUN_00a4e284(long param_1)

{
  if (param_1 != 0) {
    CRYPTO_free(*(void **)(*(long *)(param_1 + 0x40) + 8));
    CRYPTO_free(*(void **)(param_1 + 0x40));
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined4 *)(param_1 + 0x28) = 0;
    *(undefined4 *)(param_1 + 0x30) = 0;
  }
  return param_1 != 0;
}

