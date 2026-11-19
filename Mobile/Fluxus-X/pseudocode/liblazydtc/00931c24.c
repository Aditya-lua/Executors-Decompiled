/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931c24
 */

void FUN_00931c24(long param_1,long param_2)

{
  if (param_2 < 0) {
    *(undefined8 *)(param_1 + 0xab0) = 0;
    *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) & 0xffffffbf;
    return;
  }
  *(long *)(param_1 + 0xab0) = param_2;
  *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) | 0x40;
  return;
}

