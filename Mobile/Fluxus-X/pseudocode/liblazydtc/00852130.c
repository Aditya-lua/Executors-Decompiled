/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00852130
 */

void FUN_00852130(undefined4 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 1) = param_2;
  uVar1 = DAT_00d1eb40;
  *(undefined8 *)(param_1 + 4) = param_3;
  *(undefined8 *)(param_1 + 6) = param_4;
  *param_1 = uVar1;
  return;
}

