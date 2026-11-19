/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008521dc
 */

void FUN_008521dc(undefined4 *param_1,undefined8 *param_2,undefined4 param_3)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  *param_1 = param_3;
  uVar2 = param_2[1];
  uVar1 = *param_2;
  param_1[5] = 0;
  *(undefined8 *)(param_1 + 6) = 0;
  *(undefined8 *)(param_1 + 3) = uVar2;
  *(undefined8 *)(param_1 + 1) = uVar1;
  return;
}

