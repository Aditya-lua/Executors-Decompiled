/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00876080
 */

void FUN_00876080(long param_1,long param_2,undefined4 param_3)

{
  *(undefined4 *)(*(long *)(param_1 + 0x30) + param_2 * 4) = param_3;
  return;
}

