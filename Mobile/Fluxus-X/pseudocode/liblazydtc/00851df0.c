/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851df0
 */

void FUN_00851df0(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 1) = param_2;
  uVar1 = DAT_00d1e970;
  *(undefined8 *)(param_1 + 3) = param_3;
  *(undefined8 *)(param_1 + 6) = param_4;
  *(undefined8 *)(param_1 + 8) = param_5;
  *param_1 = uVar1;
  *(undefined8 *)(param_1 + 10) = 0;
  return;
}

