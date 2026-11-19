/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851f50
 */

void FUN_00851f50(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 1) = param_2;
  uVar1 = DAT_00d1ea40;
  *(undefined8 *)(param_1 + 3) = param_3;
  *(undefined8 *)(param_1 + 5) = param_4;
  *param_1 = uVar1;
  *(undefined8 *)(param_1 + 7) = param_5;
  return;
}

