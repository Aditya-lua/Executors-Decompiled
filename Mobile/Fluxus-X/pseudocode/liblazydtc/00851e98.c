/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851e98
 */

void FUN_00851e98(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined1 param_4,
                 undefined8 param_5)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 1) = param_2;
  uVar1 = DAT_00d1e9d0;
  *(undefined8 *)(param_1 + 3) = param_3;
  *(undefined1 *)(param_1 + 5) = param_4;
  *param_1 = uVar1;
  *(undefined8 *)(param_1 + 6) = param_5;
  return;
}

