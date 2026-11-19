/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00876628
 */

void FUN_00876628(long param_1,undefined4 param_2)

{
  *(undefined4 *)(*(long *)(param_1 + 8) + (ulong)*(uint *)(param_1 + 0x20) * 0x88 + 0x20) = param_2
  ;
  return;
}

