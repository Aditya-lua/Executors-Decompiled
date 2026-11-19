/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851e58
 */

void FUN_00851e58(undefined4 *param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  
  *param_1 = DAT_00d1e9a0;
  uVar1 = *param_2;
  *(undefined8 *)(param_1 + 4) = param_2[1];
  *(undefined8 *)(param_1 + 2) = uVar1;
  return;
}

