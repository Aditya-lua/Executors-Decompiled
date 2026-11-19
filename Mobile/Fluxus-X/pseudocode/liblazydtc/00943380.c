/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00943380
 */

void FUN_00943380(undefined8 param_1,uint param_2,undefined8 param_3,uint param_4)

{
  FUN_00943224(param_1,(param_2 & 1) - 1,param_3,param_4 & 1,(param_2 >> 1 & 1) - 1,0);
  return;
}

