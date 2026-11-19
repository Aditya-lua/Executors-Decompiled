/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097fadc
 */

void FUN_0097fadc(long param_1)

{
  if ((*(byte *)(param_1 + 0x10) & 1) == 0) {
    return;
  }
  operator_delete(*(void **)(param_1 + 0x20));
  return;
}

