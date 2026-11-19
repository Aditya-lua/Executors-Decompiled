/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00852014
 */

void FUN_00852014(undefined4 *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 2) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  uVar1 = DAT_00d1eab0;
  *(undefined8 *)(param_1 + 6) = param_2;
  *(undefined8 *)(param_1 + 8) = param_3;
  *param_1 = uVar1;
  return;
}

