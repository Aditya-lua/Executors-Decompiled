/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851f70
 */

void FUN_00851f70(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5,undefined8 param_6,undefined8 param_7)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 2) = param_2;
  *(undefined8 *)(param_1 + 4) = param_3;
  uVar1 = DAT_00d1ea50;
  *(undefined8 *)(param_1 + 6) = param_4;
  *(undefined8 *)(param_1 + 8) = param_5;
  *(undefined8 *)(param_1 + 10) = param_6;
  *(undefined8 *)(param_1 + 0xc) = param_7;
  *param_1 = uVar1;
  return;
}

