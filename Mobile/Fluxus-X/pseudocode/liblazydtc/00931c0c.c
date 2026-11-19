/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931c0c
 */

void FUN_00931c0c(long param_1)

{
  *(undefined8 *)(param_1 + 0xab8) = 0;
  *(undefined8 *)(param_1 + 0xab0) = 0;
  *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) & 0xffffff9f;
  return;
}

