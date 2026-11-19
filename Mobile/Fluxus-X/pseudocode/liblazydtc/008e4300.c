/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4300
 */

void FUN_008e4300(long param_1,int param_2,undefined4 param_3)

{
  *(undefined4 *)(*(long *)(param_1 + 8) + (long)param_2) = param_3;
  return;
}

