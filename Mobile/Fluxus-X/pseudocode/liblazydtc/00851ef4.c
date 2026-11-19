/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851ef4
 */

void FUN_00851ef4(undefined4 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 1) = param_2;
  uVar1 = DAT_00d1ea00;
  *(undefined8 *)(param_1 + 3) = param_3;
  *param_1 = uVar1;
  return;
}

