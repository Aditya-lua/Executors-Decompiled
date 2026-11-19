/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e444c
 */

void FUN_008e444c(long *param_1,undefined8 param_2,int param_3)

{
  int iVar1;
  
  iVar1 = FUN_008e44a4(*param_1);
  (**(code **)(*param_1 + 0x18))(param_1,iVar1 + param_3);
  FUN_008e4fb8(param_1[2],param_2,param_3);
  param_1[2] = param_1[2] + (long)param_3;
  return;
}

