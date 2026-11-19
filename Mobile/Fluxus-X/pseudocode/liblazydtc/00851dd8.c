/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851dd8
 */

void FUN_00851dd8(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                 undefined4 param_5)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 2) = param_2;
  *(undefined8 *)(param_1 + 4) = param_3;
  uVar1 = DAT_00d1e960;
  param_1[6] = param_4;
  param_1[7] = param_5;
  *param_1 = uVar1;
  return;
}

