/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0097faf0
 */

void FUN_0097faf0(void *param_1)

{
  if ((*(byte *)((long)param_1 + 0x10) & 1) != 0) {
    operator_delete(*(void **)((long)param_1 + 0x20));
  }
  operator_delete(param_1);
  return;
}

