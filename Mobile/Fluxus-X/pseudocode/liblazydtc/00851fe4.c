/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00851fe4
 */

void FUN_00851fe4(undefined4 *param_1,undefined8 param_2)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 2) = 0;
  *(undefined8 *)(param_1 + 4) = 0;
  uVar1 = DAT_00d1eaa0;
  *(undefined8 *)(param_1 + 6) = param_2;
  *param_1 = uVar1;
  return;
}

