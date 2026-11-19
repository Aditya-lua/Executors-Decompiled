/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00931c50
 */

void FUN_00931c50(long param_1,long param_2)

{
  if (param_2 < 0) {
    *(undefined8 *)(param_1 + 0xab8) = 0;
    *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) & 0xffffffdf;
    return;
  }
  *(long *)(param_1 + 0xab8) = param_2;
  *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) | 0x20;
  return;
}

