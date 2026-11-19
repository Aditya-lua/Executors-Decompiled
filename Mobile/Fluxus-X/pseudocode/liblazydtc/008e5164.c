/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e5164
 */

void FUN_008e5164(long param_1)

{
  if (*(void **)(param_1 + 8) != (void *)0x0) {
    free(*(void **)(param_1 + 8));
    *(undefined8 *)(param_1 + 8) = 0;
  }
  return;
}

