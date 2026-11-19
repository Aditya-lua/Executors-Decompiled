/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4070
 */

void FUN_008e4070(undefined8 param_1,uint param_2,long param_3,uint param_4)

{
  FUN_008e4874(param_1,*(uint *)(param_3 + 8) | (param_4 & 0x3ffffff) << 5 | param_2);
  return;
}

