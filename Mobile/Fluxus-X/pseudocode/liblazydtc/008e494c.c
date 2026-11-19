/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e494c
 */

void FUN_008e494c(undefined8 param_1,undefined8 param_2,ulong param_3,ulong param_4)

{
  FUN_008e498c(param_1,param_2,(param_4 & 0xfffffffffffff000) - (param_3 & 0xfffffffffffff000));
  FUN_008e49b0(param_1,param_2,param_2,param_4 & 0xfff);
  return;
}

